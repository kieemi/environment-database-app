package pl.environmentdatabase.habitatsandspecies.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.environmentdatabase.habitatsandspecies.service.HabitatService;

@Controller
//@RequestMapping("/")
public class HabitatWebController {
	
	@Autowired
	private HabitatService habitatService;
	
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String goHome(){
		return "habitat/habitat-list";
	}
	

}
