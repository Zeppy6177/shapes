package com.mycompany;

public class Circle extends Shape implements CircumferenceCalculable {
	double r;
	
	@Override
	public double calculateArea() {
		return (PI * Math.pow(r, 2));
	}

	@Override
	public double calculateCircumference() {
		return 2 * PI * r;
	}
}
