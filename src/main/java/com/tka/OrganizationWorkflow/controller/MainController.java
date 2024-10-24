package com.tka.OrganizationWorkflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.OrganizationWorkflow.entity.PracticeCountry;
import com.tka.OrganizationWorkflow.entity.PracticeEmployee;
import com.tka.OrganizationWorkflow.service.MainService;

@RestController
@RequestMapping("api")
public class MainController {
	
	@Autowired
	MainService service;

	@PostMapping("addrecord")
	public ResponseEntity<String> addrecord(@RequestBody PracticeCountry c)
	{
		String msg=service.addrecord(c);
       return ResponseEntity.ok(msg);
	}
	
	@PutMapping("updaterecord/{id}")
	public ResponseEntity<String> updaterecord(@RequestBody PracticeCountry c, @PathVariable int id)
	{
	String msg=service.updaterecord(c,id);
		return ResponseEntity.ok(msg);
	}
	
	@DeleteMapping("deleterecord/{id}")
	public ResponseEntity<String> deleterecord(@PathVariable int id)
	{
		String msg=service.deleterecord(id);
		return ResponseEntity.ok(msg);
	}
	
	@GetMapping("getall")
	public ResponseEntity<List<PracticeCountry>> getall()
	{
		List<PracticeCountry> list=service.getall();
		return ResponseEntity.ok(list);
	}

	
	@PostMapping("getemp")
	public ResponseEntity<String> getemp(@RequestBody PracticeEmployee ee)
	{
		String msg=service.getemp(ee);
		return ResponseEntity.ok(msg);
	}
	
	
}
