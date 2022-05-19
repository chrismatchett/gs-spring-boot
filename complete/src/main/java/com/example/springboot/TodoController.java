package com.example.springboot;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam; 

// @RestController
// https://spring.io/guides/gs/handling-form-submission/
@Controller
public class TodoController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/todo")
	public String todo() {
		return "todo";
	}

	// @RequestParam gets all the values from the form e.g. title = Milk, description = Get the milk
	@PostMapping("/todos")
	public String todos(Model model, @RequestParam Map<String, String> allParams) {

		// Loop over the form parameters and add them to a new ArrayList
		ArrayList<String> newTodo = new ArrayList<String>(); 
		for (String key : allParams.keySet()) {
			String paramKey = key;
			String paramValue = allParams.get(key);
			newTodo.add(paramValue);
		}
		// Add the new ArrayList to the existing TodoRepository ArrayList
		TodoRepository.datastore.add(newTodo);

		/*
		Test the ArrayList

		for (int i = 0; i < TodoRepository.datastore.size(); i++) {
            System.out.println(TodoRepository.datastore.get(i));
        }
		*/
		
		// Pass the datastore of todos to the add.html template
		model.addAttribute("datastore", TodoRepository.datastore);
		return "todos";
	}

}
