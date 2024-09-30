package com.leo;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // prompt user to enter the length of side
        System.out.print("Enter the length of the side of the equilateral triangle: ");
        //read the input in double
        double side = in.nextDouble();

        //call the calculateArea method to compute the area
        double area = calculateArea(side);

        //print the area
        System.out.println("The area of the equilateral triangle is: " +area);

        in.close();
    }

    private static double calculateArea(double side) {
        //Math.sqrt(3) computes the square root of 3
        //Math.pow(side, 2) computes the power of side to 2
        double area = (Math.sqrt(3) /4) *Math.pow(side, 2);

        //return the calculated area
        return area;
    }
}
