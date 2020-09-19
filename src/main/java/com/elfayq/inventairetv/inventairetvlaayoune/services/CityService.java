package com.elfayq.inventairetv.inventairetvlaayoune.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elfayq.inventairetv.inventairetvlaayoune.models.City;
import com.elfayq.inventairetv.inventairetvlaayoune.repositories.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepository;
	
	
	public List<City> getCities(){
		return cityRepository.findAll();
	}
	
	
	public void save(City city) {
		cityRepository.save(city);
	}
	
	//get by id
	public Optional<City> findById(int id) {
		return cityRepository.findById(id);
	}

	public void delete(Integer id) {
		cityRepository.deleteById(id);
	}
	
}
