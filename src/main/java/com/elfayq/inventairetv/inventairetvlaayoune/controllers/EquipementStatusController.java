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

import com.elfayq.inventairetv.inventairetvlaayoune.models.EquipementStatus;
import com.elfayq.inventairetv.inventairetvlaayoune.services.EquipementStatusService;

@Controller
public class EquipementStatusController {


	@Autowired  private EquipementStatusService equipementStatusService;

	@GetMapping("/equipementStatuses")
	public String getEquipementStatuss(Model model) {		
		
		List<EquipementStatus> equipementStatusList = equipementStatusService.getEquipementStatuses();	

		model.addAttribute("equipementStatuses", equipementStatusList);
		return "equipementStatus";
	}	
	
	@PostMapping("/equipementStatuses/addNew")
	public String addNew(EquipementStatus equipementStatus) {
		equipementStatusService.save(equipementStatus);
		return "redirect:/equipementStatuses";
	}
	
	@RequestMapping("equipementStatuses/findById")
	@ResponseBody
	public Optional<EquipementStatus> findById(int id) {
	  return equipementStatusService.findById(id);	
	}	
	
	@RequestMapping(value="/equipementStatuses/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(EquipementStatus equipementStatus) {
		equipementStatusService.save(equipementStatus);
		return "redirect:/equipementStatuses";
	}
	
	@RequestMapping(value="/equipementStatuses/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		equipementStatusService.delete(id);
		return "redirect:/equipementStatuses";
	}
}

