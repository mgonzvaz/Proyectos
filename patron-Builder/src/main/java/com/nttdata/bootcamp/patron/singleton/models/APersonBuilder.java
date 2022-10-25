package com.nttdata.bootcamp.patron.singleton.models;

import com.nttdata.bootcamp.patron.singleton.interfaces.PersonaBuilder;

public class APersonBuilder implements PersonaBuilder {

	private Person person;

	public APersonBuilder() {
		this.person = new Person();
	}

	@Override
	public void buildName() {
		person.setName("Manuel Gonzalez Vaz");
		System.out.println("Nombre asignado");
	}

	@Override
	public void buildAge() {
		person.setAge(22);
		System.out.println("Edad asignada");

	}

	@Override
	public Person getPerson() {
		System.out.println("Persona creada");
		return this.person;
	}

}
