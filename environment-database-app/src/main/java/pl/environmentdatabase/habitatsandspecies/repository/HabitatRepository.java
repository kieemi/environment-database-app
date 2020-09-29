package pl.environmentdatabase.habitatsandspecies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.environmentdatabase.habitatsandspecies.entity.Habitat;


public interface HabitatRepository extends JpaRepository<Habitat, Long> {
	

}
