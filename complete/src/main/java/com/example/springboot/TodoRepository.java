package com.example.springboot;

import java.util.*;

public class TodoRepository {

    private long id;
    private String title;
    private String description;

    public static ArrayList<String> list = new ArrayList<String>();

    static {
        for (int i = 0; i < 5; i++) { // The size of the ArrayList is now 5
            list.add("a");
        }
    }

    public TodoRepository(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

	// @PostMapping("/add")
	// public String postAdd(Model model) {

	// 	Todo t2 = new Todo(2, "Milk2", "Get the milk2");
	// 	ArrayList<Todo> todo = new ArrayList<Todo>();
	// 	t2.setId(2);
	// 	t2.setTitle("Milk2");
	// 	t2.setDescription("Get the Milk2");

	// 	TodoRepository.list.add("a");
	// 	System.out.println(TodoRepository.list.size());

	// 	model.addAttribute("todo", todo);
	// 	return "add";
	// }
