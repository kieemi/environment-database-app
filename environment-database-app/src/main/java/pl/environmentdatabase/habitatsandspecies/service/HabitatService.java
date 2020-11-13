package pl.environmentdatabase.habitatsandspecies.service;

import java.util.List;
import java.util.Optional;

import pl.environmentdatabase.habitatsandspecies.entity.Habitat;

public interface HabitatService {
    List<Habitat> findAll();
    Optional<Habitat> findById(long id);
    void save(Habitat habitat);
    void delete(long id);

}
