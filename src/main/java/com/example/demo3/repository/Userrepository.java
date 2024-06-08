package com.example.demo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo3.dto.User;

public interface Userrepository extends JpaRepository<User, Integer>{
	
}
