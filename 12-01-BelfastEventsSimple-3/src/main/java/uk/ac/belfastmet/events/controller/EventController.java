package uk.ac.belfastmet.events.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.events.domain.AllEvents;
import uk.ac.belfastmet.events.domain.Event;

@Controller
@RequestMapping("")
public class EventController {

	public EventController() {

	}

	@GetMapping("")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Belfast Events");

		

		model.addAttribute("events", this.getEventsArray());

		return "homePage";
	}
	
	@GetMapping("/{identifier}")
	public String event(@PathVariable("identifier") String identifier, Model model) {
		
		model.addAttribute("pageTitle","Event");
		String belfastEventsUrl = "http://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
		RestTemplate restTemplate = new RestTemplate();
		AllEvents allEvents = restTemplate.getForObject(belfastEventsUrl, AllEvents.class);
		
		Event selectedEvent = new Event();
		
		for(Event e:allEvents.getEvents()) {
			if(e.getIdentifier().equals(identifier)) {
				selectedEvent = e;
			}
		}
		model.addAttribute("events", selectedEvent);
		
		return "eventPage";
	}
	
	public ArrayList<Event> getEventsArray(){
		String belfastEventsUrl = "http://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
		RestTemplate restTemplate = new RestTemplate();
		AllEvents allEvents = restTemplate.getForObject(belfastEventsUrl, AllEvents.class);
		return allEvents.getEvents();
	}


}
