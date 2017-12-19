package uk.ac.belfastmet.constituencies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
		
		@GetMapping("/")
}
