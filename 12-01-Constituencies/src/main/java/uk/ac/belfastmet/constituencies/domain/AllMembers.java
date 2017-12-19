package uk.ac.belfastmet.constituencies.domain;

import java.util.ArrayList;

public class AllMembers {

	private ArrayList<Member> members = new ArrayList<Member>();

	public AllMembers() {
		super();
	}
	
	public AllMembers(ArrayList<Member> members) {
		this.members = members;
	}

	public ArrayList<Member> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<Member> members) {
		this.members = members;
	}
	
	
}
