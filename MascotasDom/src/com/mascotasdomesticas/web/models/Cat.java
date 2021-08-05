package com.mascotasdomesticas.web.models;

public class Cat extends Animal implements Pet {
	
	public Cat(String name, String breed, int weight) {
		setName(name);
		setBreed(breed);
		setWeight(weight);
	}
	
	@Override
	public String showAffection() {
		return "Your " + getBreed() + " cat, " + getName() + ", looked at you with some affection. You think." ;
	}
}
