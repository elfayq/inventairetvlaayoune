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

import com.elfayq.inventairetv.inventairetvlaayoune.models.EquipementMaintenance;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EquipementMaintenanceService;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EquipementService;

@Controller
public class EquipementMaintenanceController {

	@Autowired	private EquipementMaintenanceService equipementMaintenanceService;
	@Autowired	private EquipementService equipementService;


	@GetMapping("/equipementMaintenances")
	public String getEquipementMaintenances(Model model) {		
		model.addAttribute("equipementMaintenances", equipementMaintenanceService.getEquipementMaintenances());	
		
		model.addAttribute("equipements", equipementService.getEquipements());
		

		
		return "EquipementMaintenance";
	}	
	
	@PostMapping("/equipementMaintenances/addNew")
	public String addNew(EquipementMaintenance equipementMaintenance) {
		equipementMaintenanceService.save(equipementMaintenance);
		return "redirect:/equipementMaintenances";
	}
	
	@RequestMapping("equipementMaintenances/findById")
	@ResponseBody
	public Optional<EquipementMaintenance> findById(int id) {
	  return equipementMaintenanceService.findById(id);	
	}	
	
	@RequestMapping(value="/equipementMaintenances/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(EquipementMaintenance equipementMaintenance) {
		equipementMaintenanceService.save(equipementMaintenance);
		return "redirect:/equipementMaintenances";
	}
	
	@RequestMapping(value="/equipementMaintenances/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		equipementMaintenanceService.delete(id);
		return "redirect:/equipementMaintenances";
	}

}

