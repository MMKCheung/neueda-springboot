package uk.ac.belfastmet.buildings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.buildings.service.BuildingService;


	@Controller
	@RequestMapping("/")
	public class VolumeController {
		
		
		@Autowired
		private BuildingService buildingservice;
		
		@GetMapping("/volume")
		public String volume(Model model) {
			model.addAttribute("pageTitle", "Largest Volume!");
			this.buildingservice = new BuildingService();
			model.addAttribute("volume", this.buildingservice.getVolume());
			return "LargestUsableVolume";
		}
}
