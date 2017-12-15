package uk.ac.belfastmet.RHI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.RHI.domain.Beneficiary;
import uk.ac.belfastmet.RHI.repositories.BeneficiaryRepository;

@Service
public class BeneficiaryRestServiceImpl implements BeneficiaryRestService{

	
	@Autowired
	private BeneficiaryRepository beneficiaryRepository;

	public BeneficiaryRestServiceImpl(BeneficiaryRepository beneficiaryRepository) {
		super();
		this.beneficiaryRepository = beneficiaryRepository;
	}
	
	@Override
	public Iterable<Beneficiary> list() {
		// TODO Auto-generated method stub
		return this.beneficiaryRepository.findAll();
	}

	@Override
	public Beneficiary create(Beneficiary beneficiary) {
		// TODO Auto-generated method stub
		return this.beneficiaryRepository.save(beneficiary);
	}

	@Override
	public Beneficiary read(Integer beneficiaryId) {
		// TODO Auto-generated method stub
		return this.beneficiaryRepository.findOne(beneficiaryId);
	}

	@Override
	public Beneficiary update(Integer beneficiaryId, Beneficiary update) {
	
		Beneficiary beneficiary = this.beneficiaryRepository.findOne(beneficiaryId);
		beneficiary.setName(update.getName());
		beneficiary.setDate(update.getDate());
		beneficiary.setLocation(update.getLocation());
		beneficiary.setTechtype(update.getTechtype());
		beneficiary.setCapacity(update.getCapacity());
		beneficiary.setPayment(update.getPayment());
		
		return beneficiaryRepository.save(beneficiary);
	}

	@Override
	public void delete(Integer beneficiaryId) {
		// TODO Auto-generated method stub
		this.beneficiaryRepository.delete(beneficiaryId);
	}
}
