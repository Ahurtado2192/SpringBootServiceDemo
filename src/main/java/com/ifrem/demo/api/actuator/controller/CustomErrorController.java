package com.ifrem.demo.api.actuator.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ifrem.demo.api.actuator.model.ApiError;

@Controller
public class CustomErrorController implements ErrorController {

	@Override
	public String getErrorPath() {
		return "/error"; 
	}

	@ResponseBody
	@GetMapping("/error")
	public ResponseEntity<ApiError> handleError(HttpServletRequest request) {

		return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ApiError().builder().message("error").status("500").build());
	}

}