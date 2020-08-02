package pl.bazadanychprzyrodniczych.kartowaniesiedlisk.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.bazadanychprzyrodniczych.kartowaniesiedlisk.entity.Habitat;
import pl.bazadanychprzyrodniczych.kartowaniesiedlisk.repository.HabitatRepository;

@Service
public class HabitatServiceImpl implements HabitatService {

	@Autowired
	private HabitatRepository habitatRepository;
	
	@Override
	public Iterable<Habitat> findAll() {
		return habitatRepository.findAll();
	}

	@Override
	public Optional<Habitat> findById(long id) {
		return habitatRepository.findById(id);
	}

	@Override
	public void save(Habitat habitat) {
		habitatRepository.save(habitat);
	}

	@Override
	public void delete(long id) {
		habitatRepository.deleteById(id);
	}

}
