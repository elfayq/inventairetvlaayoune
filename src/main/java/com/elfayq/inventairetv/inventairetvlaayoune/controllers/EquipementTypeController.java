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

import com.elfayq.inventairetv.inventairetvlaayoune.models.EquipementType;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EquipementTypeService;

@Controller
public class EquipementTypeController {

	@Autowired  private EquipementTypeService equipementTypeService;

	@GetMapping("/equipementTypes")
	public String getEquipementTypes(Model model) {		
		
		List<EquipementType> equipementTypeList = equipementTypeService.getEquipementTypes();	
	
		model.addAttribute("equipementTypes", equipementTypeList);
		return "equipementType";
	}	
	
	@PostMapping("/equipementTypes/addNew")
	public String addNew(EquipementType equipementType) {
		equipementTypeService.save(equipementType);
		return "redirect:/equipementTypes";
	}
	
	@RequestMapping("equipementTypes/findById")
	@ResponseBody
	public Optional<EquipementType> findById(int id) {
	  return equipementTypeService.findById(id);	
	}	
	
	@RequestMapping(value="/equipementTypes/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(EquipementType equipementType) {
		equipementTypeService.save(equipementType);
		return "redirect:/equipementTypes";
	}
	
	@RequestMapping(value="/equipementTypes/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		equipementTypeService.delete(id);
		return "redirect:/equipementTypes";
	}
}

