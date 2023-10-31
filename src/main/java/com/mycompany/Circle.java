package com.mycompany;

public class Circle extends Shape implements CircumferenceCalculable, Constants{
	double r;
	
	Circle(double radius)
	{
		this.r = radius;
	}
		
	@Override
	public double calculateArea() {
		return (PI * Math.pow(r, 2));
	}

	@Override
	public double calculateCircumference() {
		return 2 * PI * r;
	}
}
