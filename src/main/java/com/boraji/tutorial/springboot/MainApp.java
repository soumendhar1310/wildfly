package com.boraji.tutorial.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;

import com.boraji.tutorial.springboot.controller.HelloWorldController;

@RestController
@SpringBootApplication
public class MainApp {
	
	@Autowired
	private Environment env;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);
	
   public static void main(String[] args) {
      SpringApplication.run(MainApp.class, args);
   }
}
