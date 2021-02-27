package com.example.health.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.health.entity.Enrollees;
import com.example.health.entity.EnrolleesService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/enrollees")
public class EnrolleesController {

	@Autowired
	EnrolleesService service;
	
	@GetMapping
	public List<Enrollees> getAllEnrollees(){
		return service.getAllEnrollees();
	}
	
	@PostMapping
	public Enrollees updateEnrollees(@RequestBody Enrollees enrollees){
		return service.updateEnrollees(enrollees);
	}
}
