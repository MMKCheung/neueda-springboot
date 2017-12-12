package uk.ac.belfastmet.cereal.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.cereal.domain.Cereal;
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
	
	@GetMapping("/cereal/edit/{cerealId}")
	public String editCereal(@PathVariable("cerealId") Integer cerealId, Model model) {
		model.addAttribute("pageTitle", "Edit Cereal!");
		model.addAttribute("cereal", cerealRepository.findOne(cerealId));
		return "editCereal";
	}
	
	@GetMapping("/cereal/delete/{cerealId}")
	public String deleteCereal(@PathVariable("cerealId") Integer cerealId) {
		cerealRepository.delete(cerealId);;
		return "redirect:/";
	}

	@GetMapping("/cereal/add")
	public String createCereal(Model model) {
		model.addAttribute("pageTitle", "Add Cereal");
		model.addAttribute("cereal", new Cereal());
		return "editCereal";

	}

	@PostMapping("/cereal/save")
	public String saveCereal(@Valid Cereal cereal, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "editCereal";
		} else {

			Cereal savedCereal = cerealRepository.save(cereal);
			return "redirect:/cereal/view/" + savedCereal.getCerealId();
		}
	}
}
