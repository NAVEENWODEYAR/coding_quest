package com.collectors.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Naveen K Wodeyar
 * @date 06-Jul-2024
 */
@Service
public class TestService {

	RestTemplate restTemplate = new RestTemplate();
	
	public Object getProducts() {
		return restTemplate.getForObject("https://dummyjson.com/products", Object.class);
	}
}
