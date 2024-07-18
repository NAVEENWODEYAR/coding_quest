package com.collectors.entity;

import jakarta.persistence.Id;
import lombok.*;

/**
 * @author Naveen K Wodeyar
 * @date 07/06/2024
 * @apiNote
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private static final long serialVersionUID = 123456789L;

	@Id
	public Long stId;
	
	private String stName;
	
	private String stClass;
	
	private String stGrade;
	
	private String stMail;

}
