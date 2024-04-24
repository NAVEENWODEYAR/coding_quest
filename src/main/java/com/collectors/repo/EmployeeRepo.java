/**
 * 
 */
package com.collectors.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collectors.entity.Employee;

/**
 * @author LENOVO
 *
 */
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
