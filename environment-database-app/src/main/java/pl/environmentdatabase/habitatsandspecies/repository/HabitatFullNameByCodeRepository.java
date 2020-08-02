package pl.environmentdatabase.habitatsandspecies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.environmentdatabase.habitatsandspecies.entity.HabitatFullNameByCode;


public interface HabitatFullNameByCodeRepository extends JpaRepository<HabitatFullNameByCode, Long> {

}
