package pl.bazadanychprzyrodniczych.kartowaniesiedlisk.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.bazadanychprzyrodniczych.kartowaniesiedlisk.entity.HabitatExistingThreat;
import pl.bazadanychprzyrodniczych.kartowaniesiedlisk.repository.HabitatExistingThreatRepository;

@Service
public class HabitatExistingThreatServiceImpl implements HabitatExistingThreatService {

	@Autowired
	HabitatExistingThreatRepository habitatExistingThreatRepository;
	
	@Override
	public Iterable<HabitatExistingThreat> findAll() {
		return habitatExistingThreatRepository.findAll();
	}

	@Override
	public Optional<HabitatExistingThreat> findById(long id) {
		return habitatExistingThreatRepository.findById(id);
	}

	@Override
	public void save(HabitatExistingThreat habitatExistingThreat) {
		habitatExistingThreatRepository.save(habitatExistingThreat);
	}

	@Override
	public void delete(long id) {
		habitatExistingThreatRepository.deleteById(id);
	}

}
