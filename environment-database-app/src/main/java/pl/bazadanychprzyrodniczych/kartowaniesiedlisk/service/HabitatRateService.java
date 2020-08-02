package pl.bazadanychprzyrodniczych.kartowaniesiedlisk.service;

import java.util.Optional;

import pl.bazadanychprzyrodniczych.kartowaniesiedlisk.entity.HabitatRate;

public interface HabitatRateService {
    Iterable<HabitatRate> findAll();
    Optional<HabitatRate> findById(long id);
    void save(HabitatRate habitatRate);
    void delete(long id);

}
