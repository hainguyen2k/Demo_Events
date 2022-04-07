package com.example.event_demo.service;

import java.util.List;

import com.example.event_demo.entity.Event;

public interface EventService {
	List<Event> findAllEvent();

	List<Event> findEventByKeyword(String keyword);
	
	Event findById(long id);
	

}
