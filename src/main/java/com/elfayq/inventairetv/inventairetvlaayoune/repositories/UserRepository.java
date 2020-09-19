package com.elfayq.inventairetv.inventairetvlaayoune.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elfayq.inventairetv.inventairetvlaayoune.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByUsername(String username);

}
