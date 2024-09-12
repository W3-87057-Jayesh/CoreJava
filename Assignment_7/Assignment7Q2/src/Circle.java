

class NegativeDiameterException extends Exception{
	public NegativeDiameterException(String s) {
		super(s);
	}
}
class Circle {
private double myX,myY,myDiameter;

public Circle() {
this.myX=0;
this.myY=0;
this.myDiameter=100;
}
public double getMyX() {
	return myX;
}
public void setMyX(double myX) {
	this.myX = myX;
}
public double getMyY() {
	return myY;
}
public void setMyY(double myY) {
	this.myY = myY;
}
public double getMyDiameter() {
	return myDiameter;
}
public void setMyDiameter(double myDiameter)throws NegativeDiameterException{ 
	if(myDiameter>=0) 
	{this.myDiameter = myDiameter;}else {
		throw new NegativeDiameterException("The Diameter cannot be negative");
	}
}
}
