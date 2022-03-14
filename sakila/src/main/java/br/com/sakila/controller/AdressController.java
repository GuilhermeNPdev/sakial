package br.com.sakila.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.sakila.repository.AdressRepository;

@Controller
public class AdressController {
	
	@Autowired
	private AdressRepository adressRepository;
	
	@GetMapping({"/Adress/Adress"}) //é o nome que eu quiser colocar
    public String listarAtores(ModelMap model) { 			
    	   
		 //o findAll lista todos atores 
		 model.addAttribute("adress", adressRepository.findAll());
		 return "Adress/Adress"; //é o nome do arquivo real	
    	    	
    }
}