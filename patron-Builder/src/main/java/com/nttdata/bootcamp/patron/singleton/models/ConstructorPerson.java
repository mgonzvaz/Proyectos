package com.nttdata.bootcamp.patron.singleton.models;

import com.nttdata.bootcamp.patron.singleton.interfaces.PersonaBuilder;

public class ConstructorPerson {

	private PersonaBuilder personBuilder;

	public ConstructorPerson(PersonaBuilder personBuilder) {
		this.personBuilder = personBuilder;
	}

	public Person constructPerson() {
		this.personBuilder.buildName();
		this.personBuilder.buildAge();
		return this.personBuilder.getPerson();

	}
}
