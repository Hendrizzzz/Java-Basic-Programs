package Exercises;

import java.util.Scanner;

public class ifLeapYearOrNot {
    public static void main (String[]args){
        Scanner yearCheck = new Scanner(System.in);
        int x;

        System.out.println("Welcome to The Leap Year Checker!");
        System.out.println("Please enter a Year: ");
        x = Integer.parseInt(yearCheck.nextLine());

        yearCheck.close();

        if (x%4==0) {
            if (x % 100 == 0) {
                System.out.print("It is not a LEAP YEAR.");
            } else {
                System.out.print("It is a LEAP YEAR.");
            }
        }
        else {
            System.out.print("It is not a LEAP YEAR.");
        }
    }

}