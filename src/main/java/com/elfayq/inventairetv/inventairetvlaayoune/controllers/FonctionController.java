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

import com.elfayq.inventairetv.inventairetvlaayoune.models.Fonction;
import com.elfayq.inventairetv.inventairetvlaayoune.services.FonctionService;

@Controller
public class FonctionController {

	@Autowired  private FonctionService fonctionService;

	@GetMapping("/fonctions")
	public String getFonctions(Model model) {		
		
		List<Fonction> fonctionList = fonctionService.getFonctions();	

		model.addAttribute("fonctions", fonctionList);
		return "fonction";
	}	
	
	@PostMapping("/fonctions/addNew")
	public String addNew(Fonction fonction) {
		fonctionService.save(fonction);
		return "redirect:/fonctions";
	}
	
	@RequestMapping("fonctions/findById")
	@ResponseBody
	public Optional<Fonction> findById(int id) {
	  return fonctionService.findById(id);	
	}	
	
	@RequestMapping(value="/fonctions/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Fonction fonction) {
		fonctionService.save(fonction);
		return "redirect:/fonctions";
	}
	
	@RequestMapping(value="/fonctions/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		fonctionService.delete(id);
		return "redirect:/fonctions";
	}
}

