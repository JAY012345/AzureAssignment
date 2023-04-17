package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	
	@RequestMapping("/welcome")
	public String show() {
		return "Welcome";
	}
	
	
	@RequestMapping("/Login")
	public String Login() {
		return "Login";
	}
}
