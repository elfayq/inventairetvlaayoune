package com.elfayq.inventairetv.inventairetvlaayoune.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.elfayq.inventairetv.inventairetvlaayoune.models.Employer;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EmployerService;
import com.elfayq.inventairetv.inventairetvlaayoune.services.CityService;
import com.elfayq.inventairetv.inventairetvlaayoune.services.StateService;


@Controller
public class EmployerController {
	
	@Autowired	private EmployerService employerService;
	@Autowired	private CityService cityService;
	@Autowired	private StateService stateService;


	@GetMapping("/employers")
	public String getEmployers(Model model) {		
		model.addAttribute("employers", employerService.getEmployers());	
		
		model.addAttribute("cities", cityService.getCities());
		
		model.addAttribute("states", stateService.getStates());

		
		return "Employer";
	}	
	
	@PostMapping("/employers/addNew")
	public String addNew(Employer employer) {
		employerService.save(employer);
		return "redirect:/employers";
	}
	
	@RequestMapping("employers/findById")
	@ResponseBody
	public Optional<Employer> findById(int id) {
	  return employerService.findById(id);	
	}	
	
	@RequestMapping(value="/employers/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Employer employer) {
		employerService.save(employer);
		return "redirect:/employers";
	}
	
	@RequestMapping(value="/employers/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		employerService.delete(id);
		return "redirect:/employers";
	}
	
}


