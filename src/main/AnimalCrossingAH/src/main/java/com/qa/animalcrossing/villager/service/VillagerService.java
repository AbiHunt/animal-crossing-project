package com.qa.animalcrossing.villager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.animalcrossing.villager.domain.Villager;

@Service
public interface VillagerService {
	static //This is currently a static list - but I want it to get the info from a database
	List<Villager> getVillagers() {
		return null;
	}
	
	//defining base crud operations
	
	Villager getVillagerById(Long id);

	Villager insert(Villager villager);

    void updateVillager(Long id, Villager villager);

    void deleteVillager(Long villagerId);
		
		
		
		
//		return List.of(
//			new Villager("Kiki", "Cat", "Normal", false, 80)
//				);
//		return List.of(
//			new Villager(2,"Snake", "Rabbit", "Jock", false, 140)
//				);
//		return List.of(
//				new Villager(3, "Lily", "Frog", "Normal", false, 60)
//				);
	

}
