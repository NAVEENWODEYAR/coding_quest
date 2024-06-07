
package com.collectors.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Naveen K Wodeyar
 * @date 07/06/2024
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private static final long serialVersionUID = 123456789L;

	@Id
	public Long stId;

}
