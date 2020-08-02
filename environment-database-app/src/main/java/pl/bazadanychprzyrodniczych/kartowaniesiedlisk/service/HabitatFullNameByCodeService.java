package pl.bazadanychprzyrodniczych.kartowaniesiedlisk.service;

import java.util.Optional;

import pl.bazadanychprzyrodniczych.kartowaniesiedlisk.entity.HabitatFullNameByCode;

public interface HabitatFullNameByCodeService {
    Iterable<HabitatFullNameByCode> findAll();
    Optional<HabitatFullNameByCode> findById(long id);
    void save(HabitatFullNameByCode habitatFullNameByCode);
    void delete(long id);

}
