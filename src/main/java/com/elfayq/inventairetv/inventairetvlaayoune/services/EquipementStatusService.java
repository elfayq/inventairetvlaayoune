package com.elfayq.inventairetv.inventairetvlaayoune.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elfayq.inventairetv.inventairetvlaayoune.models.EquipementStatus;
import com.elfayq.inventairetv.inventairetvlaayoune.repositories.EquipementStatusRepository;

@Service
public class EquipementStatusService {

	@Autowired
	private EquipementStatusRepository equipementStatusRepository;
	
	
	public List<EquipementStatus> getEquipementStatuses(){
		return equipementStatusRepository.findAll();
	}
	
	
	public void save(EquipementStatus equipementStatus) {
		equipementStatusRepository.save(equipementStatus);
	}
	
	//get by id
	public Optional<EquipementStatus> findById(int id) {
		return equipementStatusRepository.findById(id);
	}

	public void delete(Integer id) {
		equipementStatusRepository.deleteById(id);
	}

}

