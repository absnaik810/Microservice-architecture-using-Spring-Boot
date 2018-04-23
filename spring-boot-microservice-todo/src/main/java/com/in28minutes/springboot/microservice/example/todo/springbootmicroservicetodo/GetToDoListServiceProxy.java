package com.in28minutes.springboot.microservice.example.todo.springbootmicroservicetodo;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="users-service")
@RibbonClient(name="users-service")
public interface GetToDoListServiceProxy {
	@GetMapping("/todo/{name}")
	public ThingsToDoBean retrieveThingsToDo(@PathVariable("name") String name);
}