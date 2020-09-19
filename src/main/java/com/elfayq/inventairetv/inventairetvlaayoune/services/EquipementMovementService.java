package com.elfayq.inventairetv.inventairetvlaayoune.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elfayq.inventairetv.inventairetvlaayoune.models.EquipementMovement;
import com.elfayq.inventairetv.inventairetvlaayoune.repositories.EquipementMovementRepository;

@Service
public class EquipementMovementService {

	@Autowired
	private EquipementMovementRepository equipementMovementRepository;
	
	
	public List<EquipementMovement> getEquipementMovements(){
		return equipementMovementRepository.findAll();
	}
	
	
	public void save(EquipementMovement equipementMovement) {
		equipementMovementRepository.save(equipementMovement);
	}
	
	//get by id
	public Optional<EquipementMovement> findById(int id) {
		return equipementMovementRepository.findById(id);
	}

	public void delete(Integer id) {
		equipementMovementRepository.deleteById(id);
	}

}

