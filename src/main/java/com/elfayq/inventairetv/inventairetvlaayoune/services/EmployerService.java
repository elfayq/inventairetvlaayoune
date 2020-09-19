package com.elfayq.inventairetv.inventairetvlaayoune.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elfayq.inventairetv.inventairetvlaayoune.models.Employer;
import com.elfayq.inventairetv.inventairetvlaayoune.repositories.EmployerRepository;

@Service
public class EmployerService {

	@Autowired
	private EmployerRepository employerRepository;
	
	
	public List<Employer> getEmployers(){
		return employerRepository.findAll();
	}
	
	
	public void save(Employer employer) {
		employerRepository.save(employer);
	}
	
	//get by id
	public Optional<Employer> findById(int id) {
		return employerRepository.findById(id);
	}

	public void delete(Integer id) {
		employerRepository.deleteById(id);
	}

}
