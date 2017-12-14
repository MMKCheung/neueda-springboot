package uk.ac.belfastmet.titanicdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.titanicdata.domain.Passenger;
import uk.ac.belfastmet.titanicdata.service.PassengerRestService;

@RestController
@RequestMapping("/")
public class PassengerRestController {
	
	@Autowired
	PassengerRestService passengerRestService;
	
	public PassengerRestController(PassengerRestService passengerRestService) {
		super();
		this.passengerRestService = passengerRestService;
	}

	@GetMapping("/api")
	public Iterable<Passenger>list(){
		return passengerRestService.list();
	}
	
	@PostMapping("/api/passenger/")
	public Passenger create(@RequestBody Passenger passenger){
		return passengerRestService.create(passenger);
	}
	
	@GetMapping("/api/passenger/{passengerId}")
	public Passenger read(@PathVariable("passengerId") Integer passengerId){
		return passengerRestService.read(passengerId);
	}
	
	@DeleteMapping("/api/passenger/{passengerId}")
	public void delete(@PathVariable("passengerId") Integer passengerId){
		passengerRestService.delete(passengerId);
	}
}
