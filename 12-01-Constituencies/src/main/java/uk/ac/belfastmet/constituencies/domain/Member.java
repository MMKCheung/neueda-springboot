package uk.ac.belfastmet.constituencies.domain;

import java.util.Comparator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Member {
	@JsonProperty("PersonId")
	private String personId;
	@JsonProperty("AffiliationId")
	private String affiliationId;
	@JsonProperty("MemberName")
	private String memberName;
	@JsonProperty("MemberFirstName")
	private String memberFirstName;
	@JsonProperty("MemberLastName")
	private String memberLastName;
	@JsonProperty("MemberSortName")
	private String memberSortName;
	@JsonProperty("PartyName")
	private String party;
	@JsonProperty("PartyOrganisationId")
	private String partyOrganisationId;
	@JsonProperty("ConstituencyName")
	private String constituencyName;
	@JsonProperty("ConstituencyId")
	private String constituencyId;
	@JsonProperty("MemberImgUrl")
	private String image;

	//compare member party names
	public static Comparator<Member> mLAPartyComparator = new Comparator<Member>() {
		public int compare(Member m1, Member m2) {
			String partyid1 = m1.getParty();
			String partyid2 = m2.getParty();
			
			return partyid1.compareTo(partyid2);
			
		}
	};
}
