package uk.ac.belfastmet.form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		
		return "formPage";
	}
	
	@PostMapping("/results")
	public String result(@RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName, @RequestParam("gender") String gender, Model model) {
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		model.addAttribute("gender", gender);
		return "resultPage";
	}
	
	@GetMapping("/results")
	public String getresults(Model model) {
		
		model.addAttribute("firstName", "Chuck");
		model.addAttribute("lastName", "Norris");
		model.addAttribute("gender", "All of them");
		return "resultPage";
	}
}


