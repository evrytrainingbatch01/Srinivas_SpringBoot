package com.evry.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


@EnableAutoConfiguration
@SpringBootConfiguration
public class MainApp {
	public static void main(String args[]) {
		SpringApplication.run(MainApp.class, args);
	}
}
