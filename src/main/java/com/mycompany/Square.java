package com.mycompany;

public class Square extends Shape implements PerimeterCalculable{
	double width;

	@Override
	public double calculatePerimeter() {
		return this.width * 4;
	}

	@Override
	public double calculateArea() {
		return Math.pow(this.width, 2);
	}
}