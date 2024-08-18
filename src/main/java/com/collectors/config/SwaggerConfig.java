package com.collectors.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

/**
 * @author Naveen K Wodeyaar,
 * @Date 18-Aug-2024
 */
@Configuration
public class SwaggerConfig {
	
	@Bean
	public OpenAPI openAPI() {
		return new OpenAPI()
					.info(new Info()
							.title("Coding_Quest")
							.description("SpringBoot demo project for Testing,,")
							.version("1.0")
							.description("Testing demo,,")
							.contact(new Contact().name("Naveen K Wodeyar").url("naveen.co.in").email("naveenwodeyar@yahoo.com"))
							.license(new License().name("My License").url("www.license.co.in"))
							);
	}

}
