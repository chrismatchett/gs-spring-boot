package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

// @RestController
@Controller
public class TodoController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/add")
	public String postAdd(@ModelAttribute TodoAdd todoAdd, Model model) {
		model.addAttribute("todoAdd", todoAdd);
		return "add";
	}

}
//