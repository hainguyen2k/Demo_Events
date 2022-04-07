package com.example.event_demo.service;

import java.util.List;

import com.example.event_demo.entity.User;

public interface UserService {
	void save(User user);
	
	List<User> findAllByEvent(long id);
}
