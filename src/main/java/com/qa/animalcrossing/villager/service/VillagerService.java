package com.qa.animalcrossing.villager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.animalcrossing.villager.domain.Villager;

@Service
public class VillagerService {
	//This is currently a static list - I want it to get the info from a database
	public List<Villager> getVillagers() {
		return List.of(
			new Villager(1, "Kiki", "Cat", "Normal", false, 80)
				);
//		return List.of(
//			new Villager(2,"Snake", "Rabbit", "Jock", false, 140)
//				);
//		return List.of(
//				new Villager(3, "Lily", "Frog", "Normal", false, 60)
//				);
	
}

}
