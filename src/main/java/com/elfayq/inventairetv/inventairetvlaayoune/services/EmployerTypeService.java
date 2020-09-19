package com.elfayq.inventairetv.inventairetvlaayoune.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elfayq.inventairetv.inventairetvlaayoune.models.EmployerType;
import com.elfayq.inventairetv.inventairetvlaayoune.repositories.EmployerTypeRepository;

@Service
public class EmployerTypeService {

	@Autowired
	private EmployerTypeRepository employerTypeRepository;
	
	
	public List<EmployerType> getEmployerTypes(){
		return employerTypeRepository.findAll();
	}
	
	
	public void save(EmployerType employerType) {
		employerTypeRepository.save(employerType);
	}
	
	//get by id
	public Optional<EmployerType> findById(int id) {
		return employerTypeRepository.findById(id);
	}

	public void delete(Integer id) {
		employerTypeRepository.deleteById(id);
	}

}

