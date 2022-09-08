package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {


		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/message")
	public String  message(){
		return "Hi there !";
	}
	@GetMapping("/messagepath/{message}")
	public String messagePath(@PathVariable String message){
		String messagePath = "Hi there ! The message you typed was " + message;
		return messagePath;
	}
	@GetMapping("/messagebody")
	public String messageBody(@RequestBody String message){
		String messageBody = "Hi there ! The message you typed in the body was " + message;
		return messageBody;
	}
}
