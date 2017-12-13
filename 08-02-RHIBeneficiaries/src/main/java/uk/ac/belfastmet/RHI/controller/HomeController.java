package uk.ac.belfastmet.RHI.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.RHI.domain.Beneficiary;
import uk.ac.belfastmet.RHI.repositories.BeneficiaryRepository;


@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) {
		
		return "homePage";
	}
	
	@Autowired
	BeneficiaryRepository beneficiaryRepository;
	
	public HomeController(BeneficiaryRepository beneficiaryRepository) {
		super();
		this.beneficiaryRepository = beneficiaryRepository;
	}
	
	
	@GetMapping("/beneficiaries")
	public String passengers(Model model) {
		model.addAttribute("pageTitle", "Beneficiaries!");
		//this.dwarfService = new DwarfService();
		model.addAttribute("er", this.beneficiaryRepository.findAll());

		return "beneficiariesPage";
	}
	
	@GetMapping("/beneficiaries/view/{beneficiaryId}")
	public String viewBeneficiary(@PathVariable("beneficiaryId") Integer beneficiaryId, Model model) {
		model.addAttribute("pageTitle", "View Beneficiaries!");
		model.addAttribute("beneficiary", beneficiaryRepository.findOne(beneficiaryId));
		return "viewBeneficiary";
	}
	@GetMapping("/beneficiaries/edit/{beneficiaryId}")
	public String editBeneficiary(@PathVariable("beneficiaryId") Integer beneficiaryId, Model model) {
		model.addAttribute("pageTitle", "Edit Beneficiaries!");
		model.addAttribute("beneficiary", beneficiaryRepository.findOne(beneficiaryId));
		return "editBeneficiary";
	}
	@GetMapping("/beneficiaries/delete/{beneficiaryId}")
	public String deleteBeneficiary(@PathVariable("beneficiaryId") Integer beneficiaryId,
		RedirectAttributes redirectAttrs) {
		beneficiaryRepository.delete(beneficiaryId);
		redirectAttrs.addFlashAttribute("message", "Beneficiary was deleted");
		return "redirect:/beneficiaries/";
	}

	@GetMapping("/beneficiaries/add")
	public String createBeneficiary(Model model) {
		model.addAttribute("pageTitle", "Add Beneficiary");
		model.addAttribute("beneficiary", new Beneficiary());
		return "editBeneficiary";

	}

	@PostMapping("/beneficiaries/save")
	public String saveBeneficiary(@Valid Beneficiary beneficiary, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "editBeneficiary";
		} else {

			Beneficiary savedBeneficiary = beneficiaryRepository.save(beneficiary);
			return "redirect:/beneficiaries/view/" + savedBeneficiary.getBeneficiaryId();
		}
	}



	}

