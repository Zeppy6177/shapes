package com.mycompany;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select a shape from the options below:");
            System.out.println("1) Square");
            System.out.println("2) Rectangle");
            System.out.println("3) Equilateral Triangle");
            System.out.println("4) Circle");

            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    System.out.println("Input the length of one of the sides.");
                    Square square = new Square(Double.parseDouble(scanner.nextLine()));
                    System.out.println("The area of the square is " + square.calculateArea());
                    System.out.println("The perimeter of the square is " + square.calculatePerimeter());
                    
                    break;
                case 2:
                    System.out.println("Input the width of the rectangle.");
                    Double rWidrh = Double.parseDouble(scanner.nextLine());
                    System.out.println("Input the height of the rectangle.");
                    Double rHeight = Double.parseDouble(scanner.nextLine());

                    Rectangle rectangle = new Rectangle(rWidrh, rHeight);

                    System.out.println("The area of the square is " + rectangle.calculateArea());
                    System.out.println("The perimeter of the square is " + rectangle.calculatePerimeter());

                    break;
                case 3:
                    System.out.println("Input the length of one of the sides.");
                    Triangle triangle = new Triangle(Double.parseDouble(scanner.nextLine()));

                    break;
                case 4:
                    System.out.println("Input the radius.");
                    Circle circle = new Circle(Double.parseDouble(scanner.nextLine()));
                    break;    
                default:
                    break;

                
            }
        }
    }
}