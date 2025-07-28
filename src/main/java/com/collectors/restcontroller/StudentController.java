package com.collectors.restcontroller;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.collectors.entity.Student;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/student")
@Slf4j
public class StudentController {
	
	public static final Logger log = LoggerFactory.getLogger(StudentController.class);
	
	Map<Long,Student> hm = new HashMap<>();
	
	@GetMapping("/test/{name}")
	public ResponseEntity<?> testEndPoint(@PathVariable String name){
		log.warn("Inside test endPoint");
		log.debug("Request {}",name);
		log.trace("Name {}",name);
		log.error("Test endPoint,");
		return new ResponseEntity<>("Welcome "+name, HttpStatus.FOUND);
	}
	
	@PostMapping
	public ResponseEntity<Object> addStudent(@RequestBody Student request){
		hm.put(request.getStId(), request);
		return ResponseEntity.status(HttpStatus.CREATED).body("Student record added successfully!");
	}
	
	@GetMapping
	public ResponseEntity<Object> getStudents(){
		return ResponseEntity.status(HttpStatus.FOUND).body(hm);
	}
	
	@GetMapping("/get-byId/{studentId}")
	public ResponseEntity<?> getStudentById(@PathVariable Long studentId){
		log.warn("Student found GetById "+studentId);
		return new ResponseEntity(hm.get(studentId),HttpStatus.FOUND);
	}
	
}
