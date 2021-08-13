package com.ifrem.demo.api.actuator.service;

import org.springframework.http.ResponseEntity;

import com.ifrem.demo.api.actuator.model.ExampleServiceResponse;


public interface ExampleService {
	
	public ResponseEntity<ExampleServiceResponse> getMessage();
	
	public String hello();

}
