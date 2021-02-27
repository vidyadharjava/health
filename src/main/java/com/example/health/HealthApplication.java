package com.example.health;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.health.entity.Enrollees;
import com.example.health.repo.EnrolleesRepo;

@SpringBootApplication
public class HealthApplication implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(HealthApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(HealthApplication.class, args);
	}
	
	@Autowired
	EnrolleesRepo repo;

	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		
		Enrollees enrollees1 = new Enrollees();
		enrollees1.setName("Jhon");
		enrollees1.setDateOfBirth(new Date());
		enrollees1 = repo.save(enrollees1);
		
		Enrollees enrollees2 = new Enrollees();
		enrollees2.setName("Manrio");
		enrollees2.setDateOfBirth(new Date());
		enrollees2 = repo.save(enrollees2);
		
		Enrollees enrollees3 = new Enrollees();
		enrollees3.setName("Mike");
		enrollees3.setDateOfBirth(new Date());
		enrollees3 = repo.save(enrollees3);
		log.info(enrollees3.toString());
	}

}
