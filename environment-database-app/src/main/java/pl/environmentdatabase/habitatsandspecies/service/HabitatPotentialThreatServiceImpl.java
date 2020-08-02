package pl.environmentdatabase.habitatsandspecies.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.environmentdatabase.habitatsandspecies.entity.HabitatPotentialThreat;
import pl.environmentdatabase.habitatsandspecies.repository.HabitatPotentialThreatRepository;

@Service
public class HabitatPotentialThreatServiceImpl implements HabitatPotentialThreatService {

	@Autowired
	private HabitatPotentialThreatRepository habitatPotentialThreatRepository;
	
	@Override
	public Iterable<HabitatPotentialThreat> findAll() {
		return habitatPotentialThreatRepository.findAll();
	}

	@Override
	public Optional<HabitatPotentialThreat> findById(long id) {
		return habitatPotentialThreatRepository.findById(id);
	}

	@Override
	public void save(HabitatPotentialThreat habitatPotentialThreat) {
		habitatPotentialThreatRepository.save(habitatPotentialThreat);
	}

	@Override
	public void delete(long id) {
		habitatPotentialThreatRepository.deleteById(id);
	}

}
