package com.nttdata.bootcamp.patron.singleton;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Singleton {

	private String name;
	private int age;

	static private Singleton singleton = null;

	public Singleton(String name, int age) {
		this.name = name;
		this.age = age;
	}

	static public Singleton getSingleton(String name, int age) {

		if (singleton == null) {
			singleton = new Singleton(name, age);
		}
		return singleton;
	}

	public String metodo() {
		return "Singleton instanciado bajo demanda";
	}
}
