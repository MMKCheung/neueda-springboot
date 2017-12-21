package uk.ac.belfastmet.railways.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.railways.domain.StationBoard;
import uk.ac.belfastmet.railways.domain.StationJsonResponse;

@Controller
@RequestMapping("")
public class RailwaysController {
	
	@GetMapping("")
	public String home() {
		
		String adelaideUrl = "http://neueda-flask-bndouglas.c9users.io/translink/api/station/3042A0";
		
		RestTemplate restTemplate = new RestTemplate();
		StationJsonResponse jsonResponse = restTemplate.getForObject(adelaideUrl, StationJsonResponse.class);
		System.out.println("Printing Station board");
		StationBoard stationBoard = jsonResponse.getStationBoard();
		System.out.println(stationBoard.getStationName());
		System.out.println(stationBoard.getTimeStamp());
		System.out.println(stationBoard.getService());
		return "homePage";
	}
	

}
