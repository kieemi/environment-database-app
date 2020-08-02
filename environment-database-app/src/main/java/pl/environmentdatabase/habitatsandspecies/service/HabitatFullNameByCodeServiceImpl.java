package pl.environmentdatabase.habitatsandspecies.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.environmentdatabase.habitatsandspecies.entity.HabitatFullNameByCode;
import pl.environmentdatabase.habitatsandspecies.repository.HabitatFullNameByCodeRepository;

@Service
public class HabitatFullNameByCodeServiceImpl implements HabitatFullNameByCodeService {

	@Autowired
	private HabitatFullNameByCodeRepository habitatFullNameByCodeRepository;
	
	@Override
	public Iterable<HabitatFullNameByCode> findAll() {
		return habitatFullNameByCodeRepository.findAll();
	}

	@Override
	public Optional<HabitatFullNameByCode> findById(long id) {
		return habitatFullNameByCodeRepository.findById(id);
	}

	@Override
	public void save(HabitatFullNameByCode habitatFullNameByCode) {
		habitatFullNameByCodeRepository.save(habitatFullNameByCode);
	}

	@Override
	public void delete(long id) {
		habitatFullNameByCodeRepository.deleteById(id);
	}

}
