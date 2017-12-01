package uk.ac.belfastmet.charts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.charts.service.ChartsService;




	@Controller
	@RequestMapping("/")

	public class PopController {

		@Autowired
		private ChartsService chartsservice;

		@GetMapping("/pop")
		public String rock(Model model) {
			model.addAttribute("pageTitle", "Pop Charts!");
			this.chartsservice = new ChartsService();
			model.addAttribute("music", this.chartsservice.getMusic());
			return "pop";
		}
	}

