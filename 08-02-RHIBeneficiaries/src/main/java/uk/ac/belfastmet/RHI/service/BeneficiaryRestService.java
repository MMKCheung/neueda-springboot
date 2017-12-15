package uk.ac.belfastmet.RHI.service;

import uk.ac.belfastmet.RHI.domain.Beneficiary;

public interface BeneficiaryRestService {
	Iterable<Beneficiary> list();

	Beneficiary create(Beneficiary beneficiary);

	Beneficiary read(Integer beneficiaryId);

	Beneficiary update(Integer beneficaryId, Beneficiary update);

	void delete(Integer beneficiaryId);
}
