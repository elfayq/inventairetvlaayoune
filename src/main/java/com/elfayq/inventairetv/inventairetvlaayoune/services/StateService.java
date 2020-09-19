package com.elfayq.inventairetv.inventairetvlaayoune.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elfayq.inventairetv.inventairetvlaayoune.models.State;
import com.elfayq.inventairetv.inventairetvlaayoune.repositories.StateRepository;

@Service
public class StateService {
	
	
	@Autowired
	private StateRepository stateRepository;
	
	
	public List<State> getStates(){
		return stateRepository.findAll();
	}
	
	
	public void save(State state) {
		stateRepository.save(state);
	}
	
	//get by id
	public Optional<State> findById(int id) {
		return stateRepository.findById(id);
	}

	public void delete(Integer id) {
		stateRepository.deleteById(id);
	}
	
	
}
