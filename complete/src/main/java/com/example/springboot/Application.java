package com.example.springboot;

import java.util.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		/*
		 * This is not part of SpringBoot
		 * As we don't have a database connection we are creating
		 * some test data. An ArrayList of Todos.
		 */

		Todo t1 = new Todo(1, "Milk", "Get the milk");
		ArrayList<Todo> todo = new ArrayList<Todo>();
		t1.setId(1);
		t1.setTitle("Milk");
		t1.setDescription("Get the Milk");
		todo.add(t1);

		for (int counter = 0; counter < todo.size(); counter++) {
			System.out.println(todo.get(counter).getTitle());
		}

		/*
		 * End of creating test data
		 */
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

}
