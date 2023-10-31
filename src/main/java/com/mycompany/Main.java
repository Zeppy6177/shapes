package com.mycompany;

import java.util.Scanner;

public class Main {
    public static String getUserInput(Scanner scanner, String msg) {
        if (msg != null) {
            System.out.println(msg);
        }

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                System.out.println("The input was blank.");
                continue;
            }

            return input;
        }
    }

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
            try {
                switch (Integer.parseInt(getUserInput(scanner, null))) {
                    case 1: // Square
                        while (true) {
                            try {
                                // getting input
                                double len = Double.parseDouble(getUserInput(scanner, "Input the length of one of the sides."));
                                // creating a square
                                Square square = new Square(Math.abs(len));
                                
                                // showing the user the result of the calculations
                                System.out.println("The area of the square is " + square.calculateArea());
                                System.out.println("The perimeter of the square is " + square.calculatePerimeter());
                         
                                break;
                            } catch (Exception e) {
                                System.err.println("Input was not understood, enter a number.\n(" + e + ")");
                            }
                        }

                        break;
                    case 2: // rectangle
                        while (true) {   
                            try {
                                // getting input
                                Double rWidrh = Double.parseDouble(getUserInput(scanner, "Input the width of the rectangle."));
                                Double rHeight = Double.parseDouble(getUserInput(scanner, "Input the height of the rectangle."));
                                
                                // creating a rectangle
                                Rectangle rectangle = new Rectangle(Math.abs(rWidrh), Math.abs(rHeight));
                                
                                // showing the user the result of the calculations
                                System.out.println("The area of the rectangle is " + rectangle.calculateArea());
                                System.out.println("The perimeter of the rectangle is " + rectangle.calculatePerimeter());

                                break;
                            } catch (Exception e) {
                                System.err.println("Input was not understood, enter a number.\n(" + e + ")");
                            }
                        }

                        break;
                    case 3: // triangle
                        while (true) {   
                            try {
                                // getting input
                                double base = Double.parseDouble(getUserInput(scanner, "Input the length of one of the sides."));
                                
                                // creating a triangle
                                Triangle triangle = new Triangle(Math.abs(base));
                                
                                // showing the user the result of the calculations
                                System.out.println("The area of the triangle is " + triangle.calculateArea());
                                System.out.println("The perimeter of the triangle is " + triangle.calculatePerimeter());

                                break;
                            } catch (Exception e) {
                                System.err.println("Input was not understood, enter a number.\n(" + e + ")");
                            }
                        }
                        break;
                    case 4: // circle
                        while (true) {   
                            try {
                                // getting input
                                double radius = Double.parseDouble(getUserInput(scanner, "Enter the radius."));
                                
                                // creating a circle
                                Circle circle = new Circle(Math.abs(radius));
                                
                                // showing the user the result of the calculations
                                System.out.println("The area of the circle is " + circle.calculateArea());
                                System.out.println("The circumference of the circle is " + circle.calculateCircumference());

                                break;
                            } catch (Exception e) {
                                System.err.println("Input was not understood, enter a number.\n(" + e + ")");
                            }
                        }
                        break;
                    case 5:
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.err.println("Input was not understood, use a whole number.\n(" + e + ")");
            }
        }

    }
}