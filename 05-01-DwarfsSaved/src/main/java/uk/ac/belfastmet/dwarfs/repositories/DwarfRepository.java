package uk.ac.belfastmet.dwarfs.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer> {

	Iterable<Dwarf> findByAuthor(String string);

	Iterable<Dwarf> findByName(String string);

	Iterable<Dwarf> findTop3ByOrderByName();

	Object findByDwarfId(int i);





	Iterable<Dwarf> findAllByOrderByName();

	Iterable<Dwarf> findByAuthorOrName(String string, String string2);

	

	

}
