package Exercises;

import java.util.Scanner;

public class switchSimpleCalculator {
    public static void main (String[]args){

        System.out.println("Welcome to this Simple Calculator!");

        float a;
        float b;
        String c;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        a = Float.parseFloat(scanner.nextLine());

        System.out.println("Enter the second number: ");
        b = Float.parseFloat(scanner.nextLine());

        System.out.println("Enter the operation: ");
        c = scanner.nextLine().toLowerCase();
        scanner.close();

        if ((c.equals("addition"))|| (c.equals("+"))){
            float answer = a + b;
            System.out.printf("The sum of %f and %f is %f",a,b,answer);
        }
        else if ((c.equals("subtraction"))||(c.equals("-"))){
            float answer = a - b;
            System.out.printf("The difference of %f and %f is %f",a,b,answer);
        }
        else if ((c.equals("multiplication"))||(c.equals("*"))){
            float answer = a * b;
            System.out.printf("The product of %f and %f is %f",a,b,answer);
        }
        else if ((c.equals("division"))||(c.equals("/"))){
            float answer = a / b;
            System.out.printf("The quotient of %f and %f is %f",a,b,answer);
        }
        else{
            System.out.printf("%s is not a mathematical operation", c);
        }
    }
}
