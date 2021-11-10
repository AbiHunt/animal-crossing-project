//This class should make it easy to create and access villager information

package com.qa.animalcrossing.villager.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.animalcrossing.villager.domain.*;

//Here I declare an interface which extends Spring Data JPA’s JpaRepository, 
//specifying the domain type as Employee, and the id type as Long

@Repository //marks this interface as a Spring Data JPA repository
public interface VillagerRepo extends JpaRepository<Villager, Long>{

}
