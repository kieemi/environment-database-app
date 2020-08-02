package pl.environmentdatabase.habitatsandspecies.service;

import java.util.Optional;

import pl.environmentdatabase.habitatsandspecies.entity.HabitatProtectiveAction;

public interface HabitatProtectiveActionService {
    Iterable<HabitatProtectiveAction> findAll();
    Optional<HabitatProtectiveAction> findById(long id);
    void save(HabitatProtectiveAction habitatProtectiveAction);
    void delete(long id);

}
