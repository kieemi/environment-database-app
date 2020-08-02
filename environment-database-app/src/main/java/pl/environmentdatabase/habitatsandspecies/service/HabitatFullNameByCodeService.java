package pl.environmentdatabase.habitatsandspecies.service;

import java.util.Optional;

import pl.environmentdatabase.habitatsandspecies.entity.HabitatFullNameByCode;

public interface HabitatFullNameByCodeService {
    Iterable<HabitatFullNameByCode> findAll();
    Optional<HabitatFullNameByCode> findById(long id);
    void save(HabitatFullNameByCode habitatFullNameByCode);
    void delete(long id);

}
