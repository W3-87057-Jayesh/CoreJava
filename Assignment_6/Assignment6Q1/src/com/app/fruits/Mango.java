package com.app.fruits;

public class Mango extends Fruit {

public Mango(String name, double weight, String color) {
		super(color, name, weight);
	}
@Override
public String taste() {
	return "sweet";
}
}
