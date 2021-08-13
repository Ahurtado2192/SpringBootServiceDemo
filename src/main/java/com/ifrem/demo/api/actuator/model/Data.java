package com.ifrem.demo.api.actuator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Data {

	public int id;
	public String employee_name;
	public String employee_salary;
	public String employee_age;
	public String profile_image;
}
