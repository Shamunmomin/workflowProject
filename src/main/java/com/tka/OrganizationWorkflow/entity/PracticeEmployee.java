package com.tka.OrganizationWorkflow.entity;


import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
public class PracticeEmployee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String mobileno;
	private String emailod;
	private String department;
	private double salary;
	private String status;
	private String gender;
	
	
	
	@ManyToOne
	@JoinColumn(name = "c_id")
	@Autowired
	PracticeCountry country;
	
	public PracticeEmployee() {
		// TODO Auto-generated constructor stub
	}

	public PracticeEmployee(String name, String mobileno, String emailod, String department, double salary,
			String status, String gender, PracticeCountry country) {
		super();
		this.name = name;
		this.mobileno = mobileno;
		this.emailod = emailod;
		this.department = department;
		this.salary = salary;
		this.status = status;
		this.gender = gender;
		this.country = country;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmailod() {
		return emailod;
	}

	public void setEmailod(String emailod) {
		this.emailod = emailod;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public PracticeCountry getCountry() {
		return country;
	}

	public void setCountry(PracticeCountry country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "PracticeEmployee [id=" + id + ", name=" + name + ", mobileno=" + mobileno + ", emailod=" + emailod
				+ ", department=" + department + ", salary=" + salary + ", status=" + status + ", gender=" + gender
				+ ", country=" + country + "]";
	}
	
	
	}
