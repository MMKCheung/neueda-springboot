package uk.ac.belfastmet.cereal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.cereal.repositories.CerealRepository;




	@Controller
	@RequestMapping("/")
	public class CerealController {
		
		@Autowired
		CerealRepository cerealRepository;
		
		public CerealController(CerealRepository cerealRepository) {
			super();
			this.cerealRepository = cerealRepository;
		}
		
		
		@GetMapping("/cereal")
		public String cereals(Model model) {
			model.addAttribute("pageTitle", "Cereal!");
			//this.dwarfService = new DwarfService();
			model.addAttribute("cereals", this.cerealRepository.findAll());

			return "cerealPage";
		}
		
	


		}
