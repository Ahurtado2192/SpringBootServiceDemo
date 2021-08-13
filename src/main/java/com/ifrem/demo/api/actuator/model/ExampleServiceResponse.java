package com.ifrem.demo.api.actuator.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExampleServiceResponse {

	
	private String employeeName;
	private String employeeSalary;
	private String employeeAge;
}
