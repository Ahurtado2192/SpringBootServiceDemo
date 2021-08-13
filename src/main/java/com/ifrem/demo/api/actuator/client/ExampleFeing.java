/*
 * Copyright (c) 2019 Bancoppel
 *
 * Licensed under the GNU General Public License, Version 3 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.gnu.org/licenses/gpl-3.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.ifrem.demo.api.actuator.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.ifrem.demo.api.actuator.model.ExternalSampleResponse;
import com.ifrem.demo.api.actuator.utils.ServiceProperties;



@FeignClient(name = "exampleClient", url = ServiceProperties.EXTERNAL_SERVICE_EXAMPLE_HOST)
public interface ExampleFeing {

	@GetMapping(path = ServiceProperties.EXTERNAL_SERVICE_EXAMPLE_PATH, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	ExternalSampleResponse exampleData();
}
