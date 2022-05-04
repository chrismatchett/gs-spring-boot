package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

// @RestController
@Controller
public class LoginController {

	/*
	 * @GetMapping("/")
	 * public String index() {
	 * return "Greetings from Spring Boot!";
	 * }
	 */

	@GetMapping("/login")
	public String loginForm(Model model) {
		model.addAttribute("login", new loginForm());
		return "login";
	}

}
