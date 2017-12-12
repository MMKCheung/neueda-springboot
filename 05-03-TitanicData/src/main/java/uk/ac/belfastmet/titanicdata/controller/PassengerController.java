package uk.ac.belfastmet.titanicdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titanicdata.repositories.PassengerRepository;





	@Controller
	@RequestMapping("/")
	public class PassengerController {
		
		@Autowired
		PassengerRepository passengerRepository;
		
		public PassengerController(PassengerRepository passengerRepository) {
			super();
			this.passengerRepository = passengerRepository;
		}
		
		
		@GetMapping("/passengers")
		public String passengers(Model model) {
			model.addAttribute("pageTitle", "Passengers!");
			//this.dwarfService = new DwarfService();
			model.addAttribute("er", this.passengerRepository.findAll());

			return "passengersPage";
		}
		
		@GetMapping("/survivors")
		public String survivors(Model model) {
			model.addAttribute("pageTitle", "Survivors!");
			//this.dwarfService = new DwarfService();
			model.addAttribute("passengers", this.passengerRepository.findBySurvived(1));

			return "survivors";
		}
		
		@GetMapping("/firstclass")
		public String firstclass(Model model) {
			model.addAttribute("pageTitle", "First-Class Passengers!");
			//this.dwarfService = new DwarfService();
			model.addAttribute("passengers", this.passengerRepository.findByPclass(1));

			return "firstclass";
		}


		}