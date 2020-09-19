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

import com.elfayq.inventairetv.inventairetvlaayoune.models.EquipementMovement;
import com.elfayq.inventairetv.inventairetvlaayoune.services.StateService;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EquipementMovementService;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EquipementService;

@Controller
public class EquipementMovementController {

	@Autowired	private EquipementMovementService equipementMovementService;
	@Autowired	private EquipementService equipementService;
	@Autowired	private StateService stateService;


	@GetMapping("/equipementMovements")
	public String getEquipementMovements(Model model) {		
		model.addAttribute("vehicleMovements", equipementMovementService.getEquipementMovements());	
		
		model.addAttribute("equipements", equipementService.getEquipements());
		model.addAttribute("states", stateService.getStates());
		

		
		return "EquipementMovement";
	}	
	
	@PostMapping("/equipementMovements/addNew")
	public String addNew(EquipementMovement equipementMovement) {
		equipementMovementService.save(equipementMovement);
		return "redirect:/equipementMovements";
	}
	
	@RequestMapping("equipementMovements/findById")
	@ResponseBody
	public Optional<EquipementMovement> findById(int id) {
	  return equipementMovementService.findById(id);	
	}	
	
	@RequestMapping(value="/equipementMovements/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(EquipementMovement equipementMovement) {
		equipementMovementService.save(equipementMovement);
		return "redirect:/equipementMovements";
	}
	
	@RequestMapping(value="/equipementMovements/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		equipementMovementService.delete(id);
		return "redirect:/equipementMovements";
	}

}

