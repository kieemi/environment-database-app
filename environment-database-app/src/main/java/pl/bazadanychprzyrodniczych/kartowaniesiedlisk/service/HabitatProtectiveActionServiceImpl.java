package pl.bazadanychprzyrodniczych.kartowaniesiedlisk.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.bazadanychprzyrodniczych.kartowaniesiedlisk.entity.HabitatProtectiveAction;
import pl.bazadanychprzyrodniczych.kartowaniesiedlisk.repository.HabitatProtectiveActionRepository;

@Service
public class HabitatProtectiveActionServiceImpl implements HabitatProtectiveActionService {

	@Autowired
	private HabitatProtectiveActionRepository habitatProtectiveActionRepository;
	
	@Override
	public Iterable<HabitatProtectiveAction> findAll() {
		return habitatProtectiveActionRepository.findAll();
	}

	@Override
	public Optional<HabitatProtectiveAction> findById(long id) {
		return null;
	}

	@Override
	public void save(HabitatProtectiveAction habitatProtectiveAction) {
		habitatProtectiveActionRepository.save(habitatProtectiveAction);
	}

	@Override
	public void delete(long id) {
		habitatProtectiveActionRepository.deleteById(id);
	}

}
