package uk.ac.belfastmet.cereal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.cereal.repositories.CerealRepository;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	CerealRepository cerealRepository;
	
	public HomeController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Home Page!");
		model.addAttribute("cereals", cerealRepository.findAll());
		return "homePage";
	} 
	
	
	
	@GetMapping("/cereal/view/{cerealId}")
	public String viewCereal(@PathVariable("cerealId") Integer cerealId, Model model) {
		model.addAttribute("pageTitle", "View Cereal!");

		model.addAttribute("cereals", cerealRepository.findOne(cerealId));

		return "viewCereal";
	}
}