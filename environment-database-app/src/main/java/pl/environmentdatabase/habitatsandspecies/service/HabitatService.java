package pl.environmentdatabase.habitatsandspecies.service;

import java.util.Optional;

import pl.environmentdatabase.habitatsandspecies.entity.Habitat;

public interface HabitatService {
    Iterable<Habitat> findAll();
    Optional<Habitat> findById(long id);
    void save(Habitat habitat);
    void delete(long id);

}
