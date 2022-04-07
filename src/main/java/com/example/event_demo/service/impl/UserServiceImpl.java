package com.example.event_demo.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.event_demo.entity.User;
import com.example.event_demo.repository.UserRepository;
import com.example.event_demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	
	@Override
	public void save(User user) {
		user.setRole_name("ROLE_USER");
		userRepository.save(user);
	}

	@Override
	public List<User> findAllByEvent(long id) {
		return userRepository.findAllByEvent(id);
	}

}
