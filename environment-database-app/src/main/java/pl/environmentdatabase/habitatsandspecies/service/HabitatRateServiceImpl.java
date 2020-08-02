 package pl.environmentdatabase.habitatsandspecies.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.environmentdatabase.habitatsandspecies.entity.HabitatRate;
import pl.environmentdatabase.habitatsandspecies.repository.HabitatRateRepository;

@Service
public class HabitatRateServiceImpl implements HabitatRateService {

	@Autowired
	private HabitatRateRepository habitatRateRepository;
	
	@Override
	public Iterable<HabitatRate> findAll() {
		return habitatRateRepository.findAll();
	}

	@Override
	public Optional<HabitatRate> findById(long id) {
		return habitatRateRepository.findById(id);
	}

	@Override
	public void save(HabitatRate habitatRate) {
		habitatRateRepository.save(habitatRate);
	}

	@Override
	public void delete(long id) {
		habitatRateRepository.deleteById(id);
	}

}
