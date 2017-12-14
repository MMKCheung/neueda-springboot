package uk.ac.belfastmet.titanicdata.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanicdata.domain.Passenger;




	public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

		Iterable<Passenger> findBySurvived(Integer i);

		Iterable<Passenger> findByPclass(Integer i);

		Iterable<Passenger> findByEmbarked(String searchField);

		Iterable<Passenger> findByName(String searchField);

		Iterable<Passenger> findByNameLike(String searchField);
	
	
	
}
