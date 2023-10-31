package com.mycompany;

public class Square extends Shape implements PerimeterCalculable{
	double width;

	Square(double width)
	{
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return Math.pow(this.width, 2);
	}

	@Override
	public double calculatePerimeter() {
		return this.width * 4;
	}
}
