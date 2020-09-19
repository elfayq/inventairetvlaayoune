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

import com.elfayq.inventairetv.inventairetvlaayoune.models.EquipementMake;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EquipementMakeService;

@Controller
public class EquipementMakeController {

	@Autowired  
	private EquipementMakeService equipementMakeService;

	@GetMapping("/equipementMakes")
	public String getStates(Model model) {		
		List<EquipementMake> equipementMakeList = equipementMakeService.getEquipementMakes();
		model.addAttribute("equipementMakes", equipementMakeList);
		return "equipementMake";
	}	
	
	@PostMapping("/equipementMakes/addNew")
	public String addNew(EquipementMake equipementMake) {
		equipementMakeService.save(equipementMake);
		return "redirect:/equipementMakes";
	}
	
	@RequestMapping("equipementMakes/findById")
	@ResponseBody
	public Optional<EquipementMake> findById(int id) {
	  return equipementMakeService.findById(id);	
	}	
	
	@RequestMapping(value="/equipementMakes/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(EquipementMake equipementMake) {
		equipementMakeService.save(equipementMake);
		return "redirect:/equipementMakes";
	}
	
	@RequestMapping(value="/equipementMakes/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		equipementMakeService.delete(id);
		return "redirect:/equipementMakes";
	}
}

