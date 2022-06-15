package br.com.book.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "foobar")
@RestController
@RequestMapping("book-service")
public class FooBarController {
	
	private Logger logger = LoggerFactory.getLogger(FooBarController.class);
	
	@Operation(summary = "Testa o Resilience4j")
	@GetMapping("foo")
	//@Retry(name = "foo", fallbackMethod = "fallbackMethod")
	//@CircuitBreaker(name = "default", fallbackMethod = "fallbackMethod")
	//@RateLimiter(name = "default", fallbackMethod = "fallbackMethod")
	@Bulkhead(name = "default", fallbackMethod = "fallbackMethod")
	public String fooBar() {
		logger.info("Request to foo is received!");
//		var response = new RestTemplate().getForEntity("http://localhost:8080/foo", String.class);
		return "Hello, World!";
//		return response.getBody();
	}

	public String fallbackMethod(Throwable t) {
		return "fallbackMethod Hello, World!";
	}
}
