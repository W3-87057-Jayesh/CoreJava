package com.app.geometry;

public class Point2D {
private double x,y;

public Point2D(double x, double y) {
	super();
	this.x = x;
	this.y = y;
}

public double getX() {
	return x;
}

public void setX(double x) {
	this.x = x;
}

public double getY() {
	return y;
}

public void setY(double y) {
	this.y = y;
}
public String getDetails() {
    return "Point(" + x + ", " + y + ")";
}
public boolean isEqual(Point2D other) {
    return this.x == other.x && this.y == other.y;
}
public double calculateDistance(Point2D other) {
    return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
}
}
