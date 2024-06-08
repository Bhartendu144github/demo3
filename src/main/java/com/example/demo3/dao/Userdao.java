package com.example.demo3.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo3.dto.User;
import com.example.demo3.repository.Userrepository;

@Repository
public class Userdao {
	
	@Autowired
	private Userrepository  ur;
	public User saveuser(User u) {
		return ur.save(u);
	}
	
	public Optional<User> findbyid(int id){
		return ur.findById(id);
	}
	
	public void deletebyid(int id) {
		 ur.deleteById(id);
	}
	
}
