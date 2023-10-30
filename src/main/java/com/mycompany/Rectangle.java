package com.mycompany;

public class Rectangle extends Shape implements PerimeterCalculable {
	double width;
	double height;

	Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculatePerimeter() {
		return (this.width + this.height) * 2;
	}

	@Override
	public double calculateArea() {
		return this.width * this.height;
	}
}
