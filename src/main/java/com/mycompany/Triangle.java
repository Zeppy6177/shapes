package com.mycompany;

public class Triangle extends Shape implements PerimeterCalculable {
	double base;
	
	Triangle(double base_len)
	{
		this.base = base_len;
	}

	@Override
	public double calculateArea() {
		return ((Math.sqrt(3)/4) * Math.pow(base, 2));
	}

	@Override
	public double calculatePerimeter() {
		return base * 3;
	}
}
