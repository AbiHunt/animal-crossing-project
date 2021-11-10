package com.qa.animalcrossing.villager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication //a meta-annotation that pulls in component scanning, 
					   //autoconfiguration, and property support.
public class VillagerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(VillagerApplication.class, args);
	}

}
