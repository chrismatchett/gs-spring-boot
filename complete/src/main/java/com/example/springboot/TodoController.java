package com.example.springboot;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

// @RestController
// https://spring.io/guides/gs/handling-form-submission/
@Controller
public class TodoController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/add")
	public String addTodo(@ModelAttribute Todo todo, Model model) {
		model.addAttribute("todo", todo);
		return "add";
	}

}
