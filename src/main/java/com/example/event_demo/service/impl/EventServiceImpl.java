package com.example.event_demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.event_demo.entity.Event;
import com.example.event_demo.repository.EventRepository;
import com.example.event_demo.service.EventService;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepository eventRepository;
	
	@Override
	public List<Event> findAllEvent() {
		return eventRepository.findAll();
	}

	@Override
	public List<Event> findEventByKeyword(String keyword) {
		return eventRepository.findEventByKeyword(keyword);
	}

	@Override
	public Event findById(long id) {
		return eventRepository.findById(id).get();
	}

}
