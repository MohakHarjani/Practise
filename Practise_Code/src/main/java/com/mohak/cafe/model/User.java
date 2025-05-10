package com.mohak.cafe.model;

import org.hibernate.annotations.*;

import jakarta.persistence.*;


@Entity
@DynamicInsert
@DynamicUpdate
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String contactNo;
	private String email;
	private String password;
	private String status;
	private String role;
	//==============================================================================
	public User(String name, String contactNo, String email, String password, String status, String role) {
		super();
		this.name = name;
		this.contactNo = contactNo;
		this.email = email;
		this.password = password;
		this.status = status;
		this.role = role;
	}
	
	
	
	
	//======================================================================================
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
