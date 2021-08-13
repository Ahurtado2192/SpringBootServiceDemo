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

package com.ifrem.demo.api.actuator.bussines;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.ifrem.demo.api.actuator.client.ExampleFeing;
import com.ifrem.demo.api.actuator.model.ApiError;
import com.ifrem.demo.api.actuator.model.ExampleServiceResponse;
import com.ifrem.demo.api.actuator.model.ExternalSampleResponse;
import com.ifrem.demo.api.actuator.utils.ServiceProperties;

import feign.FeignException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class GetMessageBussines {


	@Autowired
	private ExampleFeing clientFeing;

	public ExampleServiceResponse getMessage() {
		
		log.info("Llamando a un servicio externo");
		
		
		ExternalSampleResponse employeeData = clientFeing.exampleData();
		
		
		return ExampleServiceResponse.builder().employeeAge(employeeData.getData().getEmployee_age())
				.employeeName(employeeData.getData().getEmployee_name())
				.employeeSalary(employeeData.getData().getEmployee_salary()).build();

	}
}
