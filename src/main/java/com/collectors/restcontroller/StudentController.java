package com.collectors.restcontroller;

import java.util.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.collectors.entity.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	Map<Long,Student> hm = new HashMap<>();
	
	@GetMapping("/test")
	public ResponseEntity<?> testEndPoint(){
		return new ResponseEntity<>("Welcome!", HttpStatus.FOUND);
	}
	
	@PostMapping
	public ResponseEntity<Object> addStudent(@RequestBody Student request){
		hm.put(request.getStId(), request);
		return ResponseEntity.status(HttpStatus.CREATED).body("Student added successfully!");
	}
	
	@GetMapping
	public ResponseEntity<Object> getStudents(){
		return ResponseEntity.status(HttpStatus.FOUND).body(hm);
	}
	
	@GetMapping("/get-byId")
	public ResponseEntity<?> getStudentById(@PathVariable Long studentId){
		return new ResponseEntity(hm,HttpStatus.FOUND);
	}
	
}
