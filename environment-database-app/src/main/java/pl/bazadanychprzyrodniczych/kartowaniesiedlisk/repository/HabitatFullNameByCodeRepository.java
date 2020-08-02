package pl.bazadanychprzyrodniczych.kartowaniesiedlisk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.bazadanychprzyrodniczych.kartowaniesiedlisk.entity.HabitatFullNameByCode;


public interface HabitatFullNameByCodeRepository extends JpaRepository<HabitatFullNameByCode, Long> {

}
