package pl.bazadanychprzyrodniczych.kartowaniesiedlisk.service;

import java.util.Optional;

import pl.bazadanychprzyrodniczych.kartowaniesiedlisk.entity.HabitatProtectiveAction;

public interface HabitatProtectiveActionService {
    Iterable<HabitatProtectiveAction> findAll();
    Optional<HabitatProtectiveAction> findById(long id);
    void save(HabitatProtectiveAction habitatProtectiveAction);
    void delete(long id);

}
