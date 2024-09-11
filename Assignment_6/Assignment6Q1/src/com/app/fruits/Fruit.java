package com.app.fruits;

public class Fruit {
private String color,name;
private double weight;
private boolean isFresh=true;
public String getColor() {
	return color;
}
public Fruit(String color, String name, double weight) {
	this.color = color;
	this.name = name;
	this.weight = weight;
}
public void setColor(String color) {
	this.color = color;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public boolean isFresh() {
	return isFresh;
}
public void setFresh(boolean isFresh) {
	this.isFresh = isFresh;
}
public String taste() {
	return "no specific taste ";
}
@Override 
public String toString() {
	return name+" "+weight+" "+color ;
}


}
