package pl.environmentdatabase.habitatsandspecies.service;

import java.util.Optional;

import pl.environmentdatabase.habitatsandspecies.entity.HabitatRate;

public interface HabitatRateService {
    Iterable<HabitatRate> findAll();
    Optional<HabitatRate> findById(long id);
    void save(HabitatRate habitatRate);
    void delete(long id);

}
