package com.curdOperations.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
//	changed port to 8081 because something was already using port 8080 on my machine
//curl -X PUT -H "Content-Type: application/json" -d "{\"name\": \"John Doe\", \"age\": 22, \"rollNo\": 3, \"contact\": \"9876543210\"}" http://localhost:8081/students/3
}
