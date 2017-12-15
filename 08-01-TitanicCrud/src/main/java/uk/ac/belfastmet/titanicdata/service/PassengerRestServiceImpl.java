package uk.ac.belfastmet.titanicdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.titanicdata.domain.Passenger;
import uk.ac.belfastmet.titanicdata.repositories.PassengerRepository;

@Service
public class PassengerRestServiceImpl implements PassengerRestService {

	@Autowired
	private PassengerRepository passengerRepository;

	public PassengerRestServiceImpl(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}

	@Override
	public Iterable<Passenger> list() {

		return this.passengerRepository.findAll();
	}

	@Override
	public Passenger create(Passenger passenger) {
		// TODO Auto-generated method stub
		return this.passengerRepository.save(passenger);
	}

	@Override
	public Passenger read(Integer passengerId) {
		// TODO Auto-generated method stub
		return this.passengerRepository.findOne(passengerId);
	}

	@Override
	public Passenger update(Integer passengerId, Passenger update) {
		
		Passenger passenger = this.passengerRepository.findOne(passengerId);
		passenger.setSurvived(update.getSurvived());
		passenger.setPclass(update.getPclass());
		passenger.setName(update.getName());
		passenger.setSex(update.getSex());
		passenger.setAge(update.getAge());
		passenger.setSibsp(update.getSibsp());
		passenger.setParch(update.getParch());
		passenger.setTicket(update.getTicket());
		passenger.setFare(update.getFare());
		passenger.setCabin(update.getCabin());
		passenger.setEmbarked(update.getEmbarked());

		return passengerRepository.save(passenger);
	
	}
	

	@Override
	public void delete(Integer passengerId) {
		// TODO Auto-generated method stub
		this.passengerRepository.delete(passengerId);
	}

}
