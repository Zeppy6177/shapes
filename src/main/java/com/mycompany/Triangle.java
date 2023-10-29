package com.mycompany;

public class Triangle extends Shape implements PerimeterCalculable {
	double base;
	
	@Override
	public double calculateArea() {
		return (Math.pow(base, 2) * Math.sqrt(3))/4;
	}

	@Override
	public double calculatePerimeter() {
		return base * 3;
	}
	
}
