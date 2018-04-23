package com.in28minutes.springboot.microservice.example.todo.springbootmicroservicetodo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThingsToDoController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private GetToDoListServiceProxy proxy;
	
	@GetMapping("/todo/{name}")
	public ThingsToDoBean getThingsToDoFeign(@PathVariable String name) {
		ThingsToDoBean response = proxy.retrieveThingsToDo(name);
		logger.info("{}", response);
		
		return new ThingsToDoBean(response.getId(), name, response.getVerificationStatus(), response.getTask(), 
				response.getPort());
	}
}