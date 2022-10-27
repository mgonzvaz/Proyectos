package com.nttdata.bootcamp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nttdata.bootcamp.models.Person;
import com.nttdata.bootcamp.services.PersonService;

import reactor.core.publisher.Flux;

@Controller
public class PersonListController {

	@Autowired
	PersonService personService;

	@GetMapping("/personList")
	public String personList(final Model model) {
		final Flux<Person> personList = personService.allPerson();
		model.addAttribute("personlist", personList);
		return "personL	ist";

	}
}
