package com.dept.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Department {

	private Integer deptNo;
	private String deptName;
	private String location; 
	
	
}
