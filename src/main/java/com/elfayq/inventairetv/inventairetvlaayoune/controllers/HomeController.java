package com.elfayq.inventairetv.inventairetvlaayoune.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.elfayq.inventairetv.inventairetvlaayoune.models.EquipementAffectation;
import com.elfayq.inventairetv.inventairetvlaayoune.models.Equipement;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EquipementAffectationService;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EquipementService;

@Controller
public class HomeController {
	
	@Autowired private EquipementService equipmentService;
	
	@Autowired private EquipementAffectationService affectationService;
	
	@GetMapping("/homes")
	public String home(Model model) {
		
		List<Equipement> equipments = equipmentService.selectAll();
	
		List<Equipement> stocks = equipmentService.selectAll();
		
		
		int stock = 0;
		int assignment = 0;
		int assigned = 0;
		int totequip = 0;
		
		
		if(stocks != null)	stock = stocks.size();
		
		if(equipments != null) assigned = equipments.size() - stock;
		if(equipments != null) totequip = equipments.size();
		
		model.addAttribute("totalStock",stock);
		model.addAttribute("totalAssignment",assignment);
		model.addAttribute("totalAssigned",assigned);
		model.addAttribute("totalEquipement",totequip);
		
		return "blank_index";
	}
	
	
	@RequestMapping(value = "/blank")
	public String blankhome() {
		
		return "blank/blank";
	}

}
