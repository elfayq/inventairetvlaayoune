package com.elfayq.inventairetv.inventairetvlaayoune.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elfayq.inventairetv.inventairetvlaayoune.models.EquipementAffectation;
import com.elfayq.inventairetv.inventairetvlaayoune.repositories.EquipementAffectationRepository;

@Service
public class EquipementAffectationService {

	@Autowired
	private EquipementAffectationRepository equipementAffectationRepository;
	
	
	public List<EquipementAffectation> getEquipementAffectations(){
		return equipementAffectationRepository.findAll();
	}
	
	
	public void save(EquipementAffectation equipementAffectation) {
		equipementAffectationRepository.save(equipementAffectation);
	}
	
	//get by id
	public Optional<EquipementAffectation> findById(int id) {
		return equipementAffectationRepository.findById(id);
	}

	public void delete(Integer id) {
		equipementAffectationRepository.deleteById(id);
	}


}

