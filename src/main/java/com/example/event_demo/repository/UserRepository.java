package com.example.event_demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.event_demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	@Query("SELECT u FROM User u WHERE u.event.id = :id")
	List<User> findAllByEvent(long id);
	
	@Query("SELECT u FROM User u WHERE u.email = :email")
	User findByEmail(String email);
}
