package com.tecnotab.frontend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tecnotab.frontend.dao.UserRepository;
import com.tecnotab.frontend.model.User;

@RestController
public class UserController {
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/userslist")
	public List<User> listOfUsers() {
	return userRepo.findAll();
	}

}
