package com.elfayq.inventairetv.inventairetvlaayoune.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elfayq.inventairetv.inventairetvlaayoune.models.EquipementMake;
import com.elfayq.inventairetv.inventairetvlaayoune.repositories.EquipementMakeRepository;

@Service
public class EquipementMakeService {

	@Autowired
	private EquipementMakeRepository equipementMakeRepository;
	
	
	public List<EquipementMake> getEquipementMakes(){
		return equipementMakeRepository.findAll();
	}
	
	
	public void save(EquipementMake equipementMake) {
		equipementMakeRepository.save(equipementMake);
	}
	
	//get by id
	public Optional<EquipementMake> findById(int id) {
		return equipementMakeRepository.findById(id);
	}

	public void delete(Integer id) {
		equipementMakeRepository.deleteById(id);
	}

}

