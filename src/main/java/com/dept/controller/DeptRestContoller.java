package com.dept.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dept.model.Department;

@RestController
@RequestMapping("/dept")
public class DeptRestContoller {

	@Value("${server.port}")
	private String port; 
	
	@GetMapping("/data")
	public String getMsg() {
		return "DEPT Producer :: "+port;
	}
	
	@GetMapping("/msg")
	public String getshowInfo() {
		return "DEPT Producer ::"+this.hashCode();
	}
	@GetMapping("/one")
	public Department getdeptOne() {
		
		return new Department(30, "Accounting", "California");
	}
	@GetMapping("/all")
	public List<Department> getList(){
		
		return Arrays.asList(
				new Department(30, "Analysis", "Banglore"),
				new Department(40, "QA", "Kolkata"),
				new Department(20, "UAT", "Banglore"),
				new Department(10,"Management","Mumbai"),
				new Department(20,"IncidentManagement","Indore"),
				new Department(30, "HR", "Bhopal")
				);
	}
}
