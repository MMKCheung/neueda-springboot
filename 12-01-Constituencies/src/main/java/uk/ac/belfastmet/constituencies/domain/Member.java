package uk.ac.belfastmet.constituencies.domain;

import lombok.Data;

@Data
public class Member {
	private String personId;
	private String affiliationId;
	private String memberNme;
	private String memberFirstName;
	private String memberLastName;
	private String memberSortName;
	private String party;
	private String partyOrganisationId;
	private String constituencyName;
	private String constituencyId;
}
 