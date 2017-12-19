package uk.ac.belfastmet.events.controller;

//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.events.domain.AllEvents;
import uk.ac.belfastmet.events.domain.Event;
//import uk.ac.belfastmet.events.repositories.EventRepository;

@Controller
@RequestMapping("")
public class EventsController {

//	@Autowired
//	EventRepository eventRepository;
	
	public EventsController() {
		
	}
	
	
	@GetMapping("")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Belfast Events");
		
		String belfastEventsUrl = "http://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
		RestTemplate restTemplate = new RestTemplate();
		AllEvents allEvents = restTemplate.getForObject(belfastEventsUrl, AllEvents.class);
	
		model.addAttribute("events", allEvents.getEvents());
		
		return "homePage";
	}
//	
//	@GetMapping("/event/{identifier}")
//	public String viewEvent(@PathVariable("identifier") Integer identifier, Model model) {
//		model.addAttribute("pageTitle", "View Event");
//		
//		String belfastEventsUrl = "http://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
//		RestTemplate restTemplate = new RestTemplate();
//		AllEvents allEvents = restTemplate.getForObject(belfastEventsUrl, AllEvents.class);
//		ArrayList<Event> event = allEvents.getEvents();
//		model.addAttribute("event", eventRepository.findOne(identifier));
//		return "viewEvent";
//	}
//	
	
	
	
	
}
