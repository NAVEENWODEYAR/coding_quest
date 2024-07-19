package com.collectors.restcontroller;

import java.util.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.collectors.entity.Student;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {
	
	Map<Long,Student> hm = new HashMap<>();
	
	@GetMapping("/test")
	public ResponseEntity<?> testEndPoint(){
		log.warn("test endPoint");
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
	
	@GetMapping("/get-byId/{studentId}")
	public ResponseEntity<?> getStudentById(@PathVariable Long studentId){
		log.warn("GetById "+studentId);
		return new ResponseEntity(hm.get(studentId),HttpStatus.FOUND);
	}
	
}
