package com.app.fruits;

public class Orange extends Fruit {

public Orange(String name, double weight, String color) {
	super(color, name, weight);
	}
@Override
public String taste() {
	return "sour";
}
}