package com.elfayq.inventairetv.inventairetvlaayoune.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elfayq.inventairetv.inventairetvlaayoune.models.Fonction;
import com.elfayq.inventairetv.inventairetvlaayoune.repositories.FonctionRepository;

@Service
public class FonctionService {

	@Autowired
	private FonctionRepository fonctionRepository;
	
	
	public List<Fonction> getFonctions(){
		return fonctionRepository.findAll();
	}
	
	//SAve new JobTitle
	public void save(Fonction fonction) {
		fonctionRepository.save(fonction);
	}
	
	//get by id
	public Optional<Fonction> findById(int id) {
		return fonctionRepository.findById(id);
	}

	public void delete(Integer id) {
		fonctionRepository.deleteById(id);
	}

}

