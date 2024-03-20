package com.example.demo.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee implements Serializable {
	private static final long serialVersionUID = 7308219999299852241L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false,updatable=false,name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	private String email;
	private String jobtitle;
	private String phone;
	private String imageUrl;
	@Column(nullable=false, updatable=false)
	private String employeeCode;
	public Employee() {
		super();
	}
	public Employee(Long id, String name, String email, String jobtitle, String phone, String imageUrl,
			String employeeCode) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.jobtitle = jobtitle;
		this.phone = phone;
		this.imageUrl = imageUrl;
		this.employeeCode = employeeCode;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", jobtitle=" + jobtitle + ", phone="
				+ phone + ", imageUrl=" + imageUrl + ", employeeCode=" + employeeCode + "]";
	}
	
	
	

}
