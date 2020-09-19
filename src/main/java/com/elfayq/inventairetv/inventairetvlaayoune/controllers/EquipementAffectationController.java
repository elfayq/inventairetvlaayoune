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

import com.elfayq.inventairetv.inventairetvlaayoune.models.EquipementAffectation;
import com.elfayq.inventairetv.inventairetvlaayoune.services.StateService;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EquipementAffectationService;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EquipementService;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EmployerService;

@Controller
public class EquipementAffectationController {


	@Autowired  private EquipementAffectationService equipementAffectationService;
	@Autowired  private EquipementService equipementService;
	@Autowired  private StateService stateService;
	@Autowired  private EmployerService employerService;


	@GetMapping("/equipementAffectations")
	public String getEquipementAffectations(Model model) {		
		
		model.addAttribute("equipementAffectations", equipementAffectationService.getEquipementAffectations());
		model.addAttribute("equipements", equipementService.getEquipements());
		model.addAttribute("states", stateService.getStates());
		model.addAttribute("employers", employerService.getEmployers());

		return "equipementAffectation";
	}	
	
	@PostMapping("/equipementAffectations/addNew")
	public String addNew(EquipementAffectation equipementAffectation) {
		equipementAffectationService.save(equipementAffectation);
		return "redirect:/equipementAffectations";
	}
	
	@RequestMapping("equipementAffectations/findById")
	@ResponseBody
	public Optional<EquipementAffectation> findById(int id) {
	  return equipementAffectationService.findById(id);	
	}	
	
	@RequestMapping(value="/equipementAffectations/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(EquipementAffectation equipementAffectation) {
		equipementAffectationService.save(equipementAffectation);
		return "redirect:/equipementAffectations";
	}
	
	@RequestMapping(value="/equipementAffectations/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		equipementAffectationService.delete(id);
		return "redirect:/equipementAffectations";
	}
}

