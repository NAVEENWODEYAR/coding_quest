package com.collectors.restcontroller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.collectors.entity.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	Map<Long,Student> hm = new HashMap<>();
	
	@GetMapping("/test")
	public ResponseEntity<Object> testEndPoint(){
		return ResponseEntity.ok("Welcome!");
	}
	
	@PostMapping
	public ResponseEntity<Object> addStudent(@RequestBody Student request){
		hm.put(request.getStId(), request);
		return ResponseEntity.ok("Student added successfully!");
	}
	
	@GetMapping
	public ResponseEntity<Object> getStudents(){
		return ResponseEntity.ok(hm);
	}
	
}
