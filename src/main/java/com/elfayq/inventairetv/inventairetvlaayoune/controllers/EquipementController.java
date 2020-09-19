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

import com.elfayq.inventairetv.inventairetvlaayoune.models.Equipement;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EmployerService;
import com.elfayq.inventairetv.inventairetvlaayoune.services.StateService;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EquipementMakeService;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EquipementService;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EquipementStatusService;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EquipementTypeService;

@Controller
public class EquipementController {
	
	@Autowired	private EquipementService equipementService;
	@Autowired	private EquipementMakeService equipementMakeService;
	@Autowired	private EquipementStatusService equipementStatusService;
	@Autowired	private EquipementTypeService equipementTypeService;


	@GetMapping("/equipements")
	public String getEquipements(Model model) {	
		
		model.addAttribute("equipements", equipementService.getEquipements());			
		model.addAttribute("equipementMakes", equipementMakeService.getEquipementMakes());			
		model.addAttribute("equipementStatuses", equipementStatusService.getEquipementStatuses());		
		model.addAttribute("equipementTypes", equipementTypeService.getEquipementTypes());				
		
		return "Equipement";
	}	
	
	@PostMapping("/equipements/addNew")
	public String addNew(Equipement equipement) {
		equipementService.save(equipement);
		return "redirect:/equipements";
	}
	
	@RequestMapping("equipements/findById")
	@ResponseBody
	public Optional<Equipement> findById(int id) {
	  return equipementService.findById(id);	
	}	
	
	@RequestMapping(value="/equipements/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Equipement equipement) {
		equipementService.save(equipement);
		return "redirect:/equipements";
	}
	
	@RequestMapping(value="/equipements/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		equipementService.delete(id);
		return "redirect:/equipements";
	}
	
}

