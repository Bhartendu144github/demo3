package com.example.demo3.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo3.dto.User;
import com.example.demo3.service.Userservice;

@RestController
@RequestMapping("/api/user")
public class Usercontroller {
	
	@Autowired
	private Userservice us;
	@PostMapping
	public User save(@RequestBody User u) {
		return us.saveuser(u);
	}
	
	@PutMapping
	public User update(@RequestBody User u) {
		return us.updateuser(u);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		return us.deletebyid(id);
	}
	
	@GetMapping("/{id}")
	public Optional<User> findbyid(@PathVariable int id) {
		return us.findbyid(id);
	}
	
}


















