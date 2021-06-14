package com.vellaisamy.prabhakaran.services.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsService {
	
	
	@GetMapping("/name")
	public String getName() {
		System.out.println("retrieving name");
		return "Prabhakaran Vellaisamy";
	}
	
	

}
