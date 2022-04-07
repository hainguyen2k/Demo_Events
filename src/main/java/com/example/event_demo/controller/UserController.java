package com.example.event_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.event_demo.entity.User;
import com.example.event_demo.service.UserService;


@Controller
@RequestMapping("/formRegister")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/event")
	public String showRegisterForm(@RequestParam long id, Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("idEvent", id);
		System.out.println(id);
		return "form_register";
	}
	
	@PostMapping
	public String save(User user) {
		userService.save(user);
		return "success_page";
	}
}
