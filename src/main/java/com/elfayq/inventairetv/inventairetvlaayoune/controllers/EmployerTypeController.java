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
import com.elfayq.inventairetv.inventairetvlaayoune.models.EmployerType;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EmployerTypeService;

@Controller
public class EmployerTypeController {

	@Autowired  private EmployerTypeService employerTypeService;

	@GetMapping("/employerTypes")
	public String getEmployerTypes(Model model) {		
		
		List<EmployerType> employerTypeList = employerTypeService.getEmployerTypes();	

		model.addAttribute("employerTypes", employerTypeList);
		return "employerType";
	}	
	
	@PostMapping("/employerTypes/addNew")
	public String addNew(EmployerType employerType) {
		employerTypeService.save(employerType);
		return "redirect:/employerTypes";
	}
	
	@RequestMapping("employerTypes/findById")
	@ResponseBody
	public Optional<EmployerType> findById(int id) {
	  return employerTypeService.findById(id);	
	}	
	
	@RequestMapping(value="/employerTypes/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(EmployerType employerType) {
		employerTypeService.save(employerType);
		return "redirect:/employerTypes";
	}
	
	@RequestMapping(value="/employerTypes/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		employerTypeService.delete(id);
		return "redirect:/employerTypes";
	}
}
