package uk.ac.belfastmet.buildings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.buildings.service.BuildingService;


@Controller
@RequestMapping("/")
public class FloorController {
	
	
	@Autowired
	private BuildingService buildingservice;
	
	@GetMapping("/floor")
	public String floor(Model model) {
		model.addAttribute("pageTitle", "Largest Floor Area!");
		this.buildingservice = new BuildingService();
		model.addAttribute("floorspace", this.buildingservice.getFloorspace());
		return "LargestFloorArea";
	}


	}