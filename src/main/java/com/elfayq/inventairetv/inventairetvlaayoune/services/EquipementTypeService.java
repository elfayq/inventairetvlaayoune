package com.elfayq.inventairetv.inventairetvlaayoune.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elfayq.inventairetv.inventairetvlaayoune.models.EquipementType;
import com.elfayq.inventairetv.inventairetvlaayoune.repositories.EquipementTypeRepository;

@Service
public class EquipementTypeService {
	
	@Autowired
	private EquipementTypeRepository equipementTypeRepository;
	
	//Return list of 
	public List<EquipementType> getEquipementTypes(){
		return equipementTypeRepository.findAll();
	}
	
	
	public void save(EquipementType equipementType) {
		equipementTypeRepository.save(equipementType);
	}
	
	//get by id
	public Optional<EquipementType> findById(int id) {
		return equipementTypeRepository.findById(id);
	}

	public void delete(Integer id) {
		equipementTypeRepository.deleteById(id);
	}

}

