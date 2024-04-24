/**
 * 
 */
package com.collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collectors.entity.Employee;
import com.collectors.repo.EmployeeRepo;

/**
 * @author LENOVO
 *
 */
@RestController
@RequestMapping("/emp")
@EnableCaching
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	@PostMapping("/addEmp")
	public ResponseEntity<Object> addEmp(@RequestBody Employee request){
		return ResponseEntity.ok(empRepo.save(request));
	}
	
	@GetMapping("/getEmp/{empId}")
	@Cacheable(value = "Employee")
	public ResponseEntity<Object> getEmp(@PathVariable Long empId){
		return ResponseEntity.ok(empRepo.findById(empId));
	}

}
