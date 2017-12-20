package uk.ac.belfastmet.constituencies.controller;

import java.util.ArrayList;
import java.util.Collections;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.constituencies.domain.AllMembers;
import uk.ac.belfastmet.constituencies.domain.Member;

@Controller
@RequestMapping("")
public class ConstituencyController {

	public ConstituencyController() {

	}

	@GetMapping("")
	public String home(Model model) {
		model.addAttribute("pageTitle", "NI MLA");
		return "homePage";
	}

	@GetMapping("/{constituencyId}")
	public String constituency(@PathVariable("constituencyId") String constituencyId, Model model) {
		model.addAttribute("pageTitle", "Constituency Data");
		String constituencyDataUrl = "https://api.myjson.com/bins/zkou7";
		RestTemplate restTemplate = new RestTemplate();
		AllMembers allMembers = restTemplate.getForObject(constituencyDataUrl, AllMembers.class);
		// model.addAttribute("members", allMembers.getAllMembers());

		ArrayList<Member> selectedMembers = new ArrayList<Member>();

		for (Member m : allMembers.getAllMembers()) {
			if (m.getConstituencyId().equals(constituencyId)) {

				selectedMembers.add(m);
			}
		}
		model.addAttribute("members", selectedMembers);
		
		//sorts selectedmembers by party name 
		Collections.sort(selectedMembers, Member.mLAPartyComparator);
		
		//for constituency title
		model.addAttribute("constituency", selectedMembers.get(0).getConstituencyName());
		return "constituency";

	}

	
}
