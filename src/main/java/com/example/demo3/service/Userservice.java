package com.example.demo3.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo3.dao.Userdao;
import com.example.demo3.dto.User;

@Service
public class Userservice {
	@Autowired
	private Userdao ud;
	public User saveuser(User u) {
		User user=ud.saveuser(u);
		return user;
	}
	
	public User updateuser(User u) {
		Optional<User> recivuser=ud.findbyid(u.getId());
		if(recivuser.isPresent()) {
			User user=recivuser.get();
			user.setName(u.getName());
			user.setEmail(u.getEmail());
			user.setPhone(u.getPhone());
			user=ud.saveuser(user);
			return user;
		}
		return null;
	}
	
	public Optional<User> findbyid(int id) {
		Optional<User> user=ud.findbyid(id);
		return user;
	}
	
	
	public String deletebyid(int id) {
		ud.deletebyid(id);
		return "User deleted";
	}
	
}
