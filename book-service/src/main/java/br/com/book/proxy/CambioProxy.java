package br.com.book.proxy;

import java.math.BigDecimal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.book.response.Cambio;

@FeignClient(name = "cambio-service", url = "localhost:8000", path = "cambio")
public interface CambioProxy {

	@GetMapping("{valor}/{de}/{para}")
	public Cambio getCambio(@PathVariable("valor") BigDecimal valor, 
			@PathVariable("de") String de, @PathVariable("para") String para);
	
}
