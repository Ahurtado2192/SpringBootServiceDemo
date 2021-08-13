/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ifrem.demo.api.actuator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ifrem.demo.api.actuator.bussines.GetMessageBussines;
import com.ifrem.demo.api.actuator.model.ApiError;
import com.ifrem.demo.api.actuator.model.ExampleServiceResponse;
import com.ifrem.demo.api.actuator.service.ExampleService;

import lombok.extern.slf4j.Slf4j;

@Controller
public class ExampleServiceController implements ExampleService {

	@Autowired
	private GetMessageBussines getMessageBussines;

	@GetMapping(path = "/getMessage", produces = MediaType.APPLICATION_JSON_VALUE)
	@Override
	public ResponseEntity<ExampleServiceResponse> getMessage() {

		return ResponseEntity.status(HttpStatus.OK).body(getMessageBussines.getMessage());
	}

	@RequestMapping("/")
	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return "hola";
	}
}
