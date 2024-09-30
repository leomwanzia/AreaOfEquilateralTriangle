# AreaOfEquilateralTriangle

Import Scanner:

    import java.util.Scanner; imports the Scanner class to read user input.

Main Method:

    Scanner in = new Scanner(System.in); creates a Scanner object named in to read input from the user.

    System.out.println("Enter the length of the side of the equilateral triangle"); prompts the user to enter the side length.

    double side = in.nextDouble(); reads the side length from the user.

    double area = calculateArea(side); calls the calculateArea method to compute the area.

    System.out.println("The area of the equilateral triangle is: " + area); prints the calculated area.

    in.close(); closes the Scanner object to free up resources.

    calculateArea Method:

    Math.sqrt(3) computes the square root of 3.

    Math.pow(side, 2) computes the square of the side length.

    The formula (Math.sqrt(3) / 4) * Math.pow(side, 2) calculates the area of the equilateral triangle.

**The result is stored in the variable area.**

The return area; statement returns the computed area to the caller of the method.
