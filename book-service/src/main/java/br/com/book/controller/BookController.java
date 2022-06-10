package br.com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.book.model.Book;
import br.com.book.proxy.CambioProxy;
import br.com.book.repository.BookRepository;

@RestController
@RequestMapping("book")
public class BookController {
	
	@Autowired
	private Environment env;
	
	@Autowired
	private BookRepository repository;
	
	@Autowired
	private CambioProxy proxy;
	
	@GetMapping("{id}/{moeda}")
	public Book getBook(@PathVariable("id") Long id, @PathVariable("moeda") String moeda) {
		
		var book = repository.findById(id);
		if(book == null) throw new RuntimeException("book inválido!");
		
//		Map<String, String> params = new HashMap<>();
//		params.put("valor", book.get().getPreco().toString());
//		params.put("de", "USD");
//		params.put("para", moeda);
		
//		var cambio = new RestTemplate().getForEntity("http://localhost:8000/cambio/{valor}/{de}/{para}", Cambio.class, params).getBody();
		
		var cambio = proxy.getCambio(book.get().getPreco(), "USD", moeda);
		
		var port = env.getProperty("local.server.port");
		book.get().setPorta("Book port: " + port + "\nCambio port: " + cambio.getPortaExecucao());
		book.get().setPreco(cambio.getValorConvertido());
		book.get().setMoeda(moeda);
		return book.get();
	}
	
}
