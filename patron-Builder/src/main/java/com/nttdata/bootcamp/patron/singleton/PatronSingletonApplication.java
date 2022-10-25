package com.nttdata.bootcamp.patron.singleton;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.patron.singleton.interfaces.PersonaBuilder;
import com.nttdata.bootcamp.patron.singleton.models.APersonBuilder;
import com.nttdata.bootcamp.patron.singleton.models.ConstructorPerson;
import com.nttdata.bootcamp.patron.singleton.models.Person;

@SpringBootApplication
public class PatronSingletonApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PatronSingletonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		PersonaBuilder personBuilder = new APersonBuilder();
		ConstructorPerson constuctPerson = new ConstructorPerson(personBuilder);
		Person person = constuctPerson.constructPerson();
		System.out.println(person);
	}
}
