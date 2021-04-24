package com.springboot.restapi.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Client {
	@Id
	private String id;
	
	@NotBlank
    @Size(max=100)
	private String firstName;
	private String lastName;
	private String address;
	
	@Email(message = "Email should be valid")
	private String email;
	
	
	int age;
	
	public Client(String firstName, String lastName, String email, int age, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String emailId) {
		this.email = emailId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + email
				+ "]";
	}

}
