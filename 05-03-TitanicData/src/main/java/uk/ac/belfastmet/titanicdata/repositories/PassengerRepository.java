package uk.ac.belfastmet.titanicdata.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanicdata.domain.Passenger;




	public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

		Iterable<Passenger> findBySurvived(int i);

		Iterable<Passenger> findByPclass(int i);

	
	
	
	
}
