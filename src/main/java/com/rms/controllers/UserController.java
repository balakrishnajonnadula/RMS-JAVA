package com.rms.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rms.entities.UserEntity;
import com.rms.service.dao.UserDao;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserDao dao;

	@PostMapping("/")
	public ResponseEntity<?> createUser(@RequestBody UserEntity user) {
		UserEntity createUser = dao.createUser(user);
		return new ResponseEntity<UserEntity>(createUser, HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<List<UserEntity>> getAllUsers() {
		List<UserEntity> allUsers = dao.getAllUsers();
		return new ResponseEntity<List<UserEntity>>(allUsers, HttpStatus.OK);

	}

	@GetMapping("/{userId}")
	public ResponseEntity<UserEntity> getById(@PathVariable String userId) {
		UserEntity user = dao.getByUserId(userId);
		return new ResponseEntity<UserEntity>(user, HttpStatus.OK);
	}

}
