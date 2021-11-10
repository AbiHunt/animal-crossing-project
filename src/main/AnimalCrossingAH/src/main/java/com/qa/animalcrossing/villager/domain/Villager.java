package com.qa.animalcrossing.villager.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

//model class I can create individual villagers from 
@Entity //a JPA annotation to make this object ready for storage in a JPA-based data store
public class Villager {
	
	//fields
	//I want each new villager to have an automatically generated id number
	private @Id @GeneratedValue Long id; //id is the primary key
	private String name;
	private String animalType;
	private String personality;
	private boolean npc;
	private int height;
	//These are attributes of my Villager domain object
	
	//no arg constructor
	public Villager() {
		super();
	}

	//generated constructor with all fields 
	public Villager(int id, 
					String name, 
					String animalType, 
					String personality, 
					boolean npc, 
					int height) {
		super();
		this.id = (long) id;
		this.name = name;
		this.animalType = animalType;
		this.personality = personality;
		this.npc = npc;
		this.height = height;
	}



	//generated constructor without id 
	public Villager(String name, 
					String animalType, 
					String personality, 
					boolean npc, 
					int height) {
		super();
		this.name = name;
		this.animalType = animalType;
		this.personality = personality;
		this.npc = npc;
		this.setHeight(height); //validation of setter so height can't be a ridiculous number 
	}
	

	//generated getters and setters for all fields
	public Long getId() {
		return id;
	}


	public void setId(int id) {
		this.id = (long) id;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getPersonality() {
		return personality;
	}

	public void setPersonality(String personality) {
		this.personality = personality;
	}

	public boolean isNpc() {
		return isNpc();
	}

	public void setNpc(boolean npc) {
		this.npc = npc;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height < 40 && height < 200) {
			this.height = height;
		}
		else {
			System.out.println("Villager height must be minimum 40 and maximum 200");
		}
	}
	@Override	//generated toString 
	public String toString() {
		return "Villager [id=" + id + ", name=" + name + ", animalType=" + animalType + ", personality=" + personality
				+ ", npc=" + npc + ", height=" + height + "]";
	}


}
