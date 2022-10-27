package com.nttdata.bootcamp.controllers;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.models.Person;

import reactor.core.publisher.Flux;

@RestController
public class PersonController {

	@GetMapping("/person-list-1")
	public Flux<Person> personList1() {
		Person person = new Person("Manuel", "Gonzalez", 22);
		Flux<Person> fluxPerson = Flux.just(person).delayElements(Duration.ofSeconds(5));
		return fluxPerson;
	}

	@GetMapping("/person-list-2")
	public Flux<Person> personList2() {
		Person person = new Person("Sergio", "Navarro", 19);
		Flux<Person> fluxPerson = Flux.just(person).delayElements(Duration.ofSeconds(5));
		return fluxPerson;
	}

	@GetMapping("/person-list-3")
	public Flux<Person> personList3() {
		Person person = new Person("Angel", "Casado", 26);
		Flux<Person> fluxPerson = Flux.just(person).delayElements(Duration.ofSeconds(5));
		return fluxPerson;
	}

	@GetMapping("/person-list-4")
	public Flux<Person> personList4() {
		Person person = new Person("Patricia", "Blanco", 30);
		Flux<Person> fluxPerson = Flux.just(person).delayElements(Duration.ofSeconds(5));
		return fluxPerson;
	}
}
