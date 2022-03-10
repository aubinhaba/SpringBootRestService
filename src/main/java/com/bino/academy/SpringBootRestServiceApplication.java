package com.bino.academy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bino.academy.repository.LibraryRepository;



@SpringBootApplication
public class SpringBootRestServiceApplication {
	
	@Autowired
	LibraryRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestServiceApplication.class, args);
	}
}
