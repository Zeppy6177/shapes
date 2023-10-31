package com.mycompany;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creating the scanner for user input

        // while loop to continue asking the user for shapes
        while (true) {
            // menu
            System.out.println("Select a shape from the options below:");
            System.out.println("1) Square");
            System.out.println("2) Rectangle");
            System.out.println("3) Equilateral Triangle");
            System.out.println("4) Circle");
            System.out.println("5) Exit");

            // switch case for the input
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1: // Square
                    // getting input
                    System.out.println("Input the length of one of the sides.");

                    // creating a square
                    Square square = new Square(Double.parseDouble(scanner.nextLine()));

                    // showing the user the result of the calculations
                    System.out.println("The area of the square is " + square.calculateArea());
                    System.out.println("The perimeter of the square is " + square.calculatePerimeter());
                    
                    break;
                case 2: // rectangle
                    // getting input
                    System.out.println("Input the width of the rectangle.");
                    Double rWidrh = Double.parseDouble(scanner.nextLine());
                    System.out.println("Input the height of the rectangle.");
                    Double rHeight = Double.parseDouble(scanner.nextLine());

                    // creating a rectangle
                    Rectangle rectangle = new Rectangle(rWidrh, rHeight);

                    // showing the user the result of the calculations
                    System.out.println("The area of the rectangle is " + rectangle.calculateArea());
                    System.out.println("The perimeter of the rectangle is " + rectangle.calculatePerimeter());

                    break;
                case 3: // triangle
                    // getting input
                    System.out.println("Input the length of one of the sides.");
                    
                    // creating a triangle
                    Triangle triangle = new Triangle(Double.parseDouble(scanner.nextLine()));

                    // showing the user the result of the calculations
                    System.out.println("The area of the triangle is " + triangle.calculateArea());
                    System.out.println("The perimeter of the triangle is " + triangle.calculatePerimeter());
                    break;
                case 4: // circle
                    // getting input
                    System.out.println("Input the radius.");

                    // creating a circle
                    Circle circle = new Circle(Double.parseDouble(scanner.nextLine()));

                    // showing the user the result of the calculations
                    System.out.println("The area of the circle is " + circle.calculateArea());
                    System.out.println("The circumference of the circle is " + circle.calculateCircumference());
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }

    }
}