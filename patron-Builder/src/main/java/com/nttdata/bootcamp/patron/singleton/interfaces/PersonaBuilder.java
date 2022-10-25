package com.nttdata.bootcamp.patron.singleton.interfaces;

import com.nttdata.bootcamp.patron.singleton.models.Person;

public interface PersonaBuilder {
	void buildName();

	void buildAge();

	Person getPerson();
}
