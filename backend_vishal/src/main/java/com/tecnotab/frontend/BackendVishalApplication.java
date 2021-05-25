package com.tecnotab.frontend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tecnotab.frontend.dao.UserRepository;
import com.tecnotab.frontend.model.User;

@SpringBootApplication
public class BackendVishalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendVishalApplication.class, args);
	}
	@Autowired
	UserRepository userRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepo.save(new User("x","y","vishalshyam.5@gmail.com"));
		userRepo.save(new User("p","o","vishalshyam.2@gmail.com"));
		userRepo.save(new User("i","l","vishalshyam.o@gmail.com"));
		userRepo.save(new User("w","v","vishalshyam.p@gmail.com"));
		
	}



}
