package com.app.web;

import com.app.web.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.app.web.entity.Student;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
