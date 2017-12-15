package uk.ac.belfastmet.RHI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.RHI.domain.Beneficiary;
import uk.ac.belfastmet.RHI.service.BeneficiaryRestService;

@RestController
@RequestMapping("/")
public class BeneficiaryRestController {
	
	@Autowired
	BeneficiaryRestService beneficiaryRestService;
	
	public BeneficiaryRestController(BeneficiaryRestService beneficiaryRestService) {
		super();
		this.beneficiaryRestService = beneficiaryRestService;
	}
	
	@GetMapping("/api")
	public Iterable<Beneficiary>list(){
		return beneficiaryRestService.list();
	}
	
	@PostMapping("/api/beneficiary/")
	public Beneficiary create(@RequestBody Beneficiary beneficiary) {
		return beneficiaryRestService.create(beneficiary);
	}
	
	@GetMapping("/api/beneficiary/{beneficiaryId}")
	public Beneficiary read(@PathVariable("beneficiaryId") Integer beneficiaryId) {
		return beneficiaryRestService.read(beneficiaryId);
	}
	
	@PutMapping("/api/beneficiary/{beneficiaryId}")
	public Beneficiary update(@PathVariable("beneficiaryId") Integer beneficiaryId, @RequestBody Beneficiary beneficiary ){
		return beneficiaryRestService.update(beneficiaryId, beneficiary);
	}
	
	@DeleteMapping("/api/beneficiary/{beneficiaryId}")
	public void delete(@PathVariable("beneficiaryId") Integer beneficiaryId) {
		beneficiaryRestService.delete(beneficiaryId);
	}
}
