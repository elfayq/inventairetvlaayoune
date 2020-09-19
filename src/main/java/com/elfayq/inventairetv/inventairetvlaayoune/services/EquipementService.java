package com.elfayq.inventairetv.inventairetvlaayoune.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elfayq.inventairetv.inventairetvlaayoune.models.Equipement;
import com.elfayq.inventairetv.inventairetvlaayoune.repositories.EquipementRepository;

@Service
public class EquipementService {

	@Autowired
	private EquipementRepository equipementRepository;
	
	
	public List<Equipement> getEquipements(){
		return equipementRepository.findAll();
	}
	
	
	public void save(Equipement equipement) {
		equipementRepository.save(equipement);
	}
	
	//get by id
	public Optional<Equipement> findById(int id) {
		return equipementRepository.findById(id);
	}

	public void delete(Integer id) {
		equipementRepository.deleteById(id);
	}
	
	
	//Return list of Equipement
		public List<Equipement> selectAll(){
			System.out.println(equipementRepository.findAll());
			return equipementRepository.findAll();
		}
 
}

