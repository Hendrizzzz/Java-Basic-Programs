package Exercises;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.print("Enter a number? ");
        x = (scanner.nextInt());

        scanner.close();

        if (x > 0){
            System.out.print("The number is positive ");
        }
        else if (x == 0) {
            System.out.print("The number is negative ");
        }
        else {
            System.out.print("The number is neither positive or negative ");
        }
    }
}
