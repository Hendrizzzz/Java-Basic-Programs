package Exercises;

import java.util.Scanner;

public class LoopRightTriangleCalculator {
    public static void main(String[] args) {

        String enter;
        double base;
        double height;
        double hypotenuse;
        double perimeter;
        double area;

        Scanner input = new Scanner (System.in);

        System.out.println("Welcome to the Right Triangle Calculator! ");

        while (true){
            System.out.printf("Please type \"enter\" to start %n");
            enter = input.next().trim().toLowerCase();

            if (enter.equals("enter")){

                System.out.println("Enter the base: ");
                base = input.nextDouble();

                System.out.println("Enter the height: ");
                height = input.nextDouble();

                while (base >= 0 && height >= 0){
                    hypotenuse = Math.sqrt((base*base)+(height*height));
                    perimeter = base + height + hypotenuse;
                    area = 0.5 * base * height;

                    System.out.printf("The perimeter of the right triangle with a base of %f and a height of %f is %f%n", base, height, perimeter);
                    System.out.printf("The area is %f%n", area);

                    System.out.println("Enter the base (enter a negative value to quit): ");
                    base = input.nextDouble();
                    System.out.println("Enter the height (enter a negative value to quit): ");
                    height = input.nextDouble();
                }
                System.out.printf("You have exited%nThank you for using the Triangle Calculator!");
                break;
            }

        }
    }
}