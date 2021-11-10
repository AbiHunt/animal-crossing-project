//my app loads through this main class 

package com.qa.animalcrossing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.animalcrossing.villager.domain.Villager;

//equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan
@SpringBootApplication (scanBasePackages = {"com.qa.animalcrossing"})
public class AnimalCrossingAhApplication {

	//main method here 
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		SpringApplication.run(AnimalCrossingAhApplication.class, args);
		
		//object mapper is a class that spring uses to convert objects
		ObjectMapper mapper = new ObjectMapper();

		Villager demoVillager = new Villager("Kiki", "Cat", "Normal", false, 80);

		String demoVillagerAsJSON = null;
		try {
			demoVillagerAsJSON = mapper.writeValueAsString(demoVillager);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(demoVillagerAsJSON);

		Villager backToVillager = mapper.readValue(demoVillagerAsJSON, Villager.class);

		System.out.println(backToVillager);
	}

}
