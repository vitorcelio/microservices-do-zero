package br.com.cambio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CambioServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CambioServiceApplication.class, args);
	}

}
