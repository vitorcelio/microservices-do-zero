package br.com.cambio.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;

@OpenAPIDefinition(info = @Info(title = "cambio service api", version = "v1", description = "documentação da api do cambio service"))
public class OpenApiConfiguration {

	public OpenAPI customOpenAPI() {
		return new OpenAPI()
						.components(new Components())
						.info(new io.swagger.v3.oas.models.info
								.Info()
								.title("Cambio Service api")
								.version("v1")
								.license(new License()
											.name("Apache 2.0")
											.url("http://springdoc.org")));
	}

}
