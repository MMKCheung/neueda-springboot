package uk.ac.belfastmet.constituencies.domain;

import java.util.ArrayList;

public class AllMembers {

	private ArrayList<Member> allMembers = new ArrayList<Member>();

	public AllMembers() {
		super();
	}
	
	public AllMembers(ArrayList<Member> allMembers) {
		this.allMembers = allMembers;
	}

	public ArrayList<Member> getAllMembers() {
		return allMembers;
	}

	public void setAllMembers(ArrayList<Member> allMembers) {
		this.allMembers = allMembers;
	}
	
	
}
