package com.in28minutes.springboot.microservice.example.todo.springbootmicroservicetodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.in28minutes.springboot.microservice.example.todo.springbootmicroservicetodo")
@EnableDiscoveryClient
public class SpringBootMicroserviceTodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceTodoApplication.class, args);
	}
}