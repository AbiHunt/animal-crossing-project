package com.domain.animalcrossing.villagers.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.domain.animalcrossing.villagers.domain.Villager;

@Service
public class VillagerService {
	//This is currently a static list - I want it to get the info from a database
	public List<Villager> getVillagers() {
		return List.of(
			new Villager(1, "Kiki", "Cat", "Normal", false, 80)
			);
	
}

}
