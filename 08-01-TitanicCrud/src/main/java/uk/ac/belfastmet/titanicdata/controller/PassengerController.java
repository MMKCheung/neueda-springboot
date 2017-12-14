package uk.ac.belfastmet.titanicdata.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titanicdata.domain.Passenger;
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
		// this.dwarfService = new DwarfService();
		model.addAttribute("er", this.passengerRepository.findAll());

		return "passengersPage";
	}

	@GetMapping("/passengers/view/{passengerId}")
	public String viewPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "View Passengers!");
		model.addAttribute("passenger", passengerRepository.findOne(passengerId));
		return "viewPassenger";
	}

	@GetMapping("/passengers/edit/{passengerId}")
	public String editPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "Edit Passengers!");
		model.addAttribute("passenger", passengerRepository.findOne(passengerId));
		return "editPassenger";
	}

	@GetMapping("/passengers/delete/{passengerId}")
	public String deletePassenger(@PathVariable("passengerId") Integer passengerId, RedirectAttributes redirectAttrs) {
		passengerRepository.delete(passengerId);
		redirectAttrs.addFlashAttribute("message", "Passenger was deleted");
		return "redirect:/passengers/";
	}

	@GetMapping("/passengers/add")
	public String createCereal(Model model) {
		model.addAttribute("pageTitle", "Add Passenger");
		model.addAttribute("passenger", new Passenger());
		return "editPassenger";

	}

	@PostMapping("/passengers/save")
	public String savePassenger(@Valid Passenger passenger, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "editPassenger";
		} else {

			Passenger savedPassenger = passengerRepository.save(passenger);
			return "redirect:/passengers/view/" + savedPassenger.getPassengerId();
		}
	}

	@GetMapping("/survivors")
	public String survivors(Model model) {
		model.addAttribute("pageTitle", "Survivors!");
		// this.dwarfService = new DwarfService();
		model.addAttribute("passengers", this.passengerRepository.findBySurvived(1));

		return "survivors";
	}

	@GetMapping("/firstclass")
	public String firstclass(Model model) {
		model.addAttribute("pageTitle", "First-Class Passengers!");
		// this.dwarfService = new DwarfService();
		model.addAttribute("passengers", this.passengerRepository.findByPclass(1));

		return "firstclass";
	}

	@PostMapping("/passengers/search")
	public String search(@RequestParam("searchField") String searchField,
			@RequestParam("searchString") String searchString, Model model) {

		if (searchField.equals("name")) {
			model.addAttribute("pageTitle", "Search Passengers!");
			model.addAttribute("er", this.passengerRepository.findByNameLike("%"+searchString+"%"));

		} else if (searchField.equals("embarked")) {
			model.addAttribute("pageTitle", "Search Passengers!");
			model.addAttribute("er", this.passengerRepository.findByEmbarked(searchString));

		} else if (searchField.equals("passengerClass")) {

			Integer pClass = Integer.parseInt(searchString);
			model.addAttribute("pageTitle", "Search Passengers!");

			model.addAttribute("er", this.passengerRepository.findByPclass(pClass));
		}

		return "passengersPage";
	}

}