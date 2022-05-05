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
