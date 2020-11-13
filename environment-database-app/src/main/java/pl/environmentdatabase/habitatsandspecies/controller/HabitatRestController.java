package pl.environmentdatabase.habitatsandspecies.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pl.environmentdatabase.habitatsandspecies.entity.Habitat;
import pl.environmentdatabase.habitatsandspecies.repository.HabitatRepository;
import pl.environmentdatabase.habitatsandspecies.service.HabitatService;

@RestController
@RequestMapping("/api")
public class HabitatRestController {
	
	@Autowired
	private HabitatRepository habitatRepository;
	
	
	@GetMapping(path="/habitats")
	public DataTablesOutput<Habitat> findAll(@Valid DataTablesInput input){
		return (DataTablesOutput<Habitat>) habitatRepository.findAll();
	}
	
//    @RequestMapping(value = "/habitats/{id}", method = RequestMethod.GET)
//	public Habitat getEmployeeById(@PathVariable("id") long id){
//		return employeeService.getEmployeeById(id);
	

}
