package pl.environmentdatabase.habitatsandspecies.service;

import java.util.Optional;

import pl.environmentdatabase.habitatsandspecies.entity.HabitatPotentialThreat;

public interface HabitatPotentialThreatService {
    Iterable<HabitatPotentialThreat> findAll();
    Optional<HabitatPotentialThreat> findById(long id);
    void save(HabitatPotentialThreat habitatPotentialThreat);
    void delete(long id);

}
