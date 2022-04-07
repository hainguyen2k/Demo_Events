package com.example.event_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.event_demo.service.EventService;
import com.example.event_demo.service.UserService;

@Controller
@RequestMapping("/")
public class EventController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private EventService eventService;

	@GetMapping("/eventdetail/event")
	public String showDetail(@RequestParam long id, Model model) {
		model.addAttribute("listUser", userService.findAllByEvent(id));
		model.addAttribute("event", eventService.findById(id));
		model.addAttribute("idEvent", id);
		System.out.println(id);
		return "event_details";
	}
	
	@GetMapping
	public String home(Model model, String keyword) {
		if (keyword != null) {
			model.addAttribute(model.addAttribute("events", eventService.findEventByKeyword(keyword)));
		} else {
			model.addAttribute("events", eventService.findAllEvent());
		}
		return "index";
	}
	
	
}
