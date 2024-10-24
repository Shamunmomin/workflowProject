package com.tka.OrganizationWorkflow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PracticeCountry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String cname;
	
	public PracticeCountry() {
		// TODO Auto-generated constructor stub
	}

	public PracticeCountry(String cname) {
		super();
		this.cname = cname;
	}

	public int getId() {
		return cid;
	}

	public void setId(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "PracticeCountry [id=" + cid + ", name=" + cname + "]";
	}
	

}
