package com.tka.OrganizationWorkflow.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.OrganizationWorkflow.dao.MainDao;
import com.tka.OrganizationWorkflow.entity.PracticeCountry;
import com.tka.OrganizationWorkflow.entity.PracticeEmployee;

@Service
public class MainService {

	@Autowired
	MainDao dao;

	public String addrecord(PracticeCountry c) {
		String msg=dao.addrecord(c);
		
		if(Objects.isNull(msg)) {
			msg="record not added";
		}
		return msg;
	}

	public String updaterecord(PracticeCountry c, int id) {
	
		String msg= dao.updaterecord(c,id);
		
		if(Objects.isNull(msg)) {
			msg="record not update";
		}
		return msg;
	}

	public String deleterecord(int id) {
		String msg=dao.deleterecord(id);
		
		if(Objects.isNull(msg)) {
			msg="record not delete";
		}
		return msg;
	}

	public List<PracticeCountry> getall() {
		List<PracticeCountry> list=dao.getall();
		return list;
	}

	
	

//	ADD EMPLOYEE RECORD
	public String getemp(PracticeEmployee ee) {
		String msg=dao.getemp(ee);
		if(Objects.isNull(msg)) {
			msg="Employee not added";
		}
		return msg;
	}

	
	

	
	
}
