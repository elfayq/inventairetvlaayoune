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

import com.elfayq.inventairetv.inventairetvlaayoune.models.Seervice;
import com.elfayq.inventairetv.inventairetvlaayoune.services.SeerviceService;

@Controller
public class SeerviceController {
	
	@Autowired
	private SeerviceService seerviceService;

	@GetMapping("/seervices")
	public String getSeervices(Model model) {		
		List<Seervice> seerviceList = seerviceService.getServics();
		model.addAttribute("seervices", seerviceList);	
		return "seervice";
	}	
	
	@PostMapping("/seervices/addNew")
	public String addNew(Seervice seervice) {
		seerviceService.save(seervice);
		return "redirect:/seervices";
	}
	
	@RequestMapping("seervices/findById")
	@ResponseBody
	public Optional<Seervice> findById(int id) {
	  return seerviceService.findById(id);	
	}	
	
	@RequestMapping(value="/seervices/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Seervice seervice) {
		seerviceService.save(seervice);
		return "redirect:/seervices";
	}
	
	@RequestMapping(value="/seervices/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		seerviceService.delete(id);
		return "redirect:/seervices";
	}
	
}
