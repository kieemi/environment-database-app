package pl.bazadanychprzyrodniczych.kartowaniesiedlisk.service;

import java.util.Optional;

import pl.bazadanychprzyrodniczych.kartowaniesiedlisk.entity.HabitatExistingThreat;

public interface HabitatExistingThreatService {
    Iterable<HabitatExistingThreat> findAll();
    Optional<HabitatExistingThreat> findById(long id);
    void save(HabitatExistingThreat habitatExistingThreat);
    void delete(long id);

}
