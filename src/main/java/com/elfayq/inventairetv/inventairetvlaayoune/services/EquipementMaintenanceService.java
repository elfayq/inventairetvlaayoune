package com.elfayq.inventairetv.inventairetvlaayoune.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elfayq.inventairetv.inventairetvlaayoune.models.EquipementMaintenance;
import com.elfayq.inventairetv.inventairetvlaayoune.repositories.EquipementMaintenanceRepository;

@Service
public class EquipementMaintenanceService {

	@Autowired
	private EquipementMaintenanceRepository equipementMaintenanceRepository;
	
	
	public List<EquipementMaintenance> getEquipementMaintenances(){
		return equipementMaintenanceRepository.findAll();
	}
	
	
	public void save(EquipementMaintenance equipementMaintenance) {
		equipementMaintenanceRepository.save(equipementMaintenance);
	}
	
	//get by id
	public Optional<EquipementMaintenance> findById(int id) {
		return equipementMaintenanceRepository.findById(id);
	}

	public void delete(Integer id) {
		equipementMaintenanceRepository.deleteById(id);
	}


}
