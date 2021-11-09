package com.qa.animalcrossing.villager.domain;

//model class I can create individual villagers from 
public class Villager {
	
	//fields
	private int id;
	private String name;
	private String animalType;
	private String personality;
	private boolean npc;
	private int height;
	
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
		this.id = id;
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
		this.height = height;
	}
	
	

	
	//generated getters and setters for all fields
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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

	public void setLivesHere(boolean npc) {
		this.npc = npc;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	//generated toString 
	@Override
	public String toString() {
		return "Villager [name=" + name + ", animalType=" + animalType + ", personality=" + 
				personality + ", npc=" + npc + ", height=" + height + "]";
	}


}
