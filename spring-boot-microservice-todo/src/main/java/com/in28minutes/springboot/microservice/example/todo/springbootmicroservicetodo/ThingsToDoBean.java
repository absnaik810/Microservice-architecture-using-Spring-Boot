package com.in28minutes.springboot.microservice.example.todo.springbootmicroservicetodo;

public class ThingsToDoBean {
	private Long id;
	private String name;
	private Boolean verificationStatus;
	private String task;
	private int port;
	
	public ThingsToDoBean() {
		
	}
	
	public ThingsToDoBean(Long id, String name, Boolean verificationStatus, String task, int port) {
		super();
		this.id = id;
		this.name = name;
		this.verificationStatus = verificationStatus;
		this.task = task;
		this.port=port;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getVerificationStatus() {
		return verificationStatus;
	}

	public void setVerificationStatus(Boolean verificationStatus) {
		this.verificationStatus = verificationStatus;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}