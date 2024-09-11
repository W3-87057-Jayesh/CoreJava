package com.app.fruits;

public class Apple extends Fruit {

public Apple(String name, double weight, String color) {
	super(color, name, weight);
	}
@Override
public String taste() {
	return "sweet n sour";
}
}
