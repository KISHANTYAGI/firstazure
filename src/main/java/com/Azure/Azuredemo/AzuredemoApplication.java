package com.Azure.Azuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzuredemoApplication {
	
	@GetMapping("/")
	 public String message()
	 {
		 return "your application successfully update in azure";
	 }

	public static void main(String[] args) {
		SpringApplication.run(AzuredemoApplication.class, args);
	}

}
