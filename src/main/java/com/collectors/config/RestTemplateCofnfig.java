package com.collectors.config;

import org.springframework.context.annotation.*;
import org.springframework.web.client.RestTemplate;
/**
 * @author Naveen K Wodeyar
 * @date 06-Jul-2024
 */
@Configuration
public class RestTemplateCofnfig {
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
