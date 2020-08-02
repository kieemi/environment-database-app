package pl.bazadanychprzyrodniczych.kartowaniesiedlisk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.bazadanychprzyrodniczych.kartowaniesiedlisk.entity.Habitat;


public interface HabitatRepository extends JpaRepository<Habitat, Long> {
	//TODO in example here was method like this, i dont know if it's neccesary
	//Iterable<Book> findByCategoryName(String category);

}
