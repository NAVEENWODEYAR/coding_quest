package com.collectors.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Naveen K Wodeyar
 * @date 06-Jul-2024
 */
@Service
@Slf4j
public class TestService {

	RestTemplate restTemplate = new RestTemplate();
	
	public Object getProducts() {
		log.info("RestTemplate");
		return restTemplate.getForObject("https://dummyjson.com/products", Object.class);
	}
}
