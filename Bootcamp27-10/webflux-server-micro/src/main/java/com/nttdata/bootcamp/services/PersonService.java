package com.nttdata.bootcamp.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.nttdata.bootcamp.models.Person;

import reactor.core.publisher.Flux;

@Service
public class PersonService {

	public Flux<Person> allPerson() {
		Flux<Person> persona1 = WebClient.create("http://localhost:8080/person-list1").get().retrieve()
				.bodyToFlux(Person.class);
		Flux<Person> persona2 = WebClient.create("http://localhost:8080/person-list2").get().retrieve()
				.bodyToFlux(Person.class);
		Flux<Person> persona3 = WebClient.create("http://localhost:8080/person-list3").get().retrieve()
				.bodyToFlux(Person.class);
		Flux<Person> persona4 = WebClient.create("http://localhost:8080/person-list4").get().retrieve()
				.bodyToFlux(Person.class);
		Flux<Person> personas = Flux.merge(persona1, persona2, persona3, persona4);
		return personas;
	}
}
