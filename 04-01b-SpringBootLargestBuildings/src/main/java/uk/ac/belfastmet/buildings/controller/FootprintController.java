package uk.ac.belfastmet.buildings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.buildings.service.BuildingService;

@Controller
@RequestMapping("/")

public class FootprintController {

	@Autowired
	private BuildingService buildingservice;

	@GetMapping("/footprint")
	public String footprint(Model model) {
		model.addAttribute("pageTitle", "Largest Footprint!");
		this.buildingservice = new BuildingService();
		model.addAttribute("footprint", this.buildingservice.getFootprint());
		return "LargestFootprint";
	}
}
