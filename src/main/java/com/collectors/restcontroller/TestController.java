package com.collectors.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collectors.service.TestService;

/**
 * @author Naveen K Wodeyar
 * @date 06-Jul-2024
 */
@RestController
@RequestMapping("/api/v1/test")
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping
	public ResponseEntity<?> getProducts(){
		return ResponseEntity.ok(testService.getProducts());
	}

}
