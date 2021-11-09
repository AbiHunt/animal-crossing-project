package com.domain.animalcrossing.villagers.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.animalcrossing.villagers.domain.Villager;
import com.domain.animalcrossing.villagers.service.VillagerService;

//This class has all of the resources for my API
//It serves as the business logic for managing villagers (business/service layer)

@RestController //makes this class serve rest end-points 
@RequestMapping(path = "api/v1/villager") //adds path onto localhost:8080
public class VillagerController {
	
	//referencing the Villager service class
	private final VillagerService villagerService;
	
	//Constructor
	@Autowired  //magically instanciates villagerService for me and injects it into the constructor 
	public VillagerController(VillagerService villagerService) {
		this.villagerService = villagerService;
	}

	
	//a rest end-point method
	@GetMapping 
	public List<Villager> getVillagers() {
		return villagerService.getVillagers();
	}
	
}

