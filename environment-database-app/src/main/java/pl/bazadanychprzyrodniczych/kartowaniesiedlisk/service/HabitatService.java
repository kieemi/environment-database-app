package pl.bazadanychprzyrodniczych.kartowaniesiedlisk.service;

import java.util.Optional;

import pl.bazadanychprzyrodniczych.kartowaniesiedlisk.entity.Habitat;

public interface HabitatService {
    Iterable<Habitat> findAll();
    Optional<Habitat> findById(long id);
    void save(Habitat habitat);
    void delete(long id);

}
