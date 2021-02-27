package com.example.health.entity;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.health.repo.EnrolleesRepo;

@Service
public class EnrolleesService {
	
	@Autowired
	EnrolleesRepo repo;
	
	public List<Enrollees> getAllEnrollees(){
		return StreamSupport.stream(repo.findAll().spliterator(), false).collect(Collectors.toList());
	}
	
	public Enrollees updateEnrollees(Enrollees enrollees){
		return repo.save(enrollees);
	}
}
