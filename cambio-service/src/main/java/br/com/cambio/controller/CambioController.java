package br.com.cambio.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cambio.model.Cambio;
import br.com.cambio.repository.CambioRepository;

@RestController
@RequestMapping("cambio")
public class CambioController {
	
	@Autowired
	private Environment env;
	
	@Autowired
	private CambioRepository repository;
	
	@GetMapping("{valor}/{de}/{para}")
	public Cambio getCambio(@PathVariable("valor") BigDecimal valor, 
			@PathVariable("de") String de, @PathVariable("para") String para) {
		
		var cambio = repository.findByDeAndPara(de, para);
		if(cambio == null) throw new RuntimeException("não existe!");
		
		var port =  env.getProperty("local.server.port");
		
		cambio.setPortaExecucao(port);
		cambio.setValorConvertido(cambio.getFatorConversao().multiply(valor).setScale(2, RoundingMode.CEILING));
		return cambio;
	}
	
}
