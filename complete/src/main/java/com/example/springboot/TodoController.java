package com.example.springboot;

import java.util.*;

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
	public String postAdd(Model model) {

		Todo t2 = new Todo(2, "Milk2", "Get the milk2");
		ArrayList<Todo> todo = new ArrayList<Todo>();
		t2.setId(2);
		t2.setTitle("Milk2");
		t2.setDescription("Get the Milk2");

		TodoRepository.list.add("a");
		System.out.println(TodoRepository.list.size());

		model.addAttribute("todo", todo);
		return "add";
	}

}
