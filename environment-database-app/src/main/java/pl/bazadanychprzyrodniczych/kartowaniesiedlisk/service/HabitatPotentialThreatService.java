package pl.bazadanychprzyrodniczych.kartowaniesiedlisk.service;

import java.util.Optional;

import pl.bazadanychprzyrodniczych.kartowaniesiedlisk.entity.HabitatPotentialThreat;

public interface HabitatPotentialThreatService {
    Iterable<HabitatPotentialThreat> findAll();
    Optional<HabitatPotentialThreat> findById(long id);
    void save(HabitatPotentialThreat habitatPotentialThreat);
    void delete(long id);

}
