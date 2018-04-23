package me.abhishek.springboot.microservice.example.users.springbootmicroservicetodoservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
	
	@Autowired
	UsersRepository repository;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/")
	public String index() {
		return "Hello from the ToDo Controller\n";
	}
	
	@GetMapping("/todo/{name}")
	public Users getThingsToDo(@PathVariable String name) {
		Users thingToDo=repository.findByNameIgnoreCaseContaining(name);
		thingToDo.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		
		return thingToDo;
	}
	
	@GetMapping("/todos")
	public List<Users> getAllThingsToDo() {
		return repository.findAll();
	}
}