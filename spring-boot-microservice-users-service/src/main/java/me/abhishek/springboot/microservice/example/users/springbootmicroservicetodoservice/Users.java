package me.abhishek.springboot.microservice.example.users.springbootmicroservicetodoservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Entity
@EnableJpaRepositories
@Table(name="users")
public class Users {
	
	@Id
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="verified")
	private int verificationStatus;
	
	private String task;
	private int port;
	
	public Users() {
		
	}
	
	public Users(Long id, String name, int verificationStatus, String task) {
		super();
		this.id=id;
		this.name=name;
		this.verificationStatus=verificationStatus;
		this.task=task;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getVerificationStatus() {
		return verificationStatus;
	}
	
	public String getTask() {
		return task;
	}
	
	public int getPort() {
		return port;
	}
	
	public void setPort(int port) {
		this.port=port;
	}
	
	@Override
	public String toString() {
		return "Users{" + 
				"id=" + id + 
				", name='" + name + '\'' +
				", verificationStatus='" + verificationStatus + '\'' +
				'}';
	}
}