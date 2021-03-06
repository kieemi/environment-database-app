package pl.environmentdatabase.habitatsandspecies.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.environmentdatabase.habitatsandspecies.entity.Habitat;
import pl.environmentdatabase.habitatsandspecies.service.HabitatService;

@RestController
@RequestMapping("/api")
public class HabitatRestController {
	
	@Autowired
	private HabitatService habitatService;
	
	
	@GetMapping("/habitats")
	public Iterable<Habitat> findAll(){
		return habitatService.findAll();
	}
	

}
