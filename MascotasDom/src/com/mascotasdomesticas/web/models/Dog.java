package com.mascotasdomesticas.web.models;

public class Dog extends Animal implements Pet{
	public Dog(String name, String breed, int weight) {
		setName(name);
		setBreed(breed);
		setWeight(weight);
	}
	
	@Override
	public String showAffection() {
		if(getWeight() < 30 ) {
			return "You created a " + getBreed() + ". " + getName() + " hopped into your lap and cuddle you!";
		}
		else {
			return "You created a " + getBreed() + ". " + getName() + " curled up next to you";
		}
	}
}
