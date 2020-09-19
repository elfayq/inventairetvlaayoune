package com.elfayq.inventairetv.inventairetvlaayoune.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elfayq.inventairetv.inventairetvlaayoune.models.Seervice;
import com.elfayq.inventairetv.inventairetvlaayoune.repositories.SeerviceRepository;

@Service
public class SeerviceService {

	@Autowired
	private SeerviceRepository seerviceRepository;
	
	
	public List<Seervice> getServics(){
		return seerviceRepository.findAll();
	}
	
	
	public void save(Seervice seervice) {
		seerviceRepository.save(seervice);
	}
	
	//get by id
	public Optional<Seervice> findById(int id) {
		return seerviceRepository.findById(id);
	}

	public void delete(Integer id) {
		seerviceRepository.deleteById(id);
	}
	
}
