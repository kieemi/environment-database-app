package pl.environmentdatabase.habitatsandspecies.service;

import java.util.Optional;

import pl.environmentdatabase.habitatsandspecies.entity.HabitatExistingThreat;

public interface HabitatExistingThreatService {
    Iterable<HabitatExistingThreat> findAll();
    Optional<HabitatExistingThreat> findById(long id);
    void save(HabitatExistingThreat habitatExistingThreat);
    void delete(long id);

}
