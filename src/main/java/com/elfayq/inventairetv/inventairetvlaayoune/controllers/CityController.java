package com.elfayq.inventairetv.inventairetvlaayoune.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.elfayq.inventairetv.inventairetvlaayoune.models.City;
import com.elfayq.inventairetv.inventairetvlaayoune.services.CityService;

@Controller
public class CityController {
	
	@Autowired
	private CityService cityService;

	@GetMapping("/cities")
	public String getCities(Model model) {		
		List<City> cityList = cityService.getCities();	
		model.addAttribute("cities", cityList);	
		return "city";
	}	
	
	@PostMapping("/cities/addNew")
	public String addNew(City city) {
		cityService.save(city);
		return "redirect:/cities";
	}
	
	@RequestMapping("cities/findById")
	@ResponseBody
	public Optional<City> findById(int id) {
	  return cityService.findById(id);	
	}	
	
	@RequestMapping(value="/cities/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(City city) {
		cityService.save(city);
		return "redirect:/cities";
	}
	
	@RequestMapping(value="/cities/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		cityService.delete(id);
		return "redirect:/cities";
	}
	
}
