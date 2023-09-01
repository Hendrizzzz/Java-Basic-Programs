package Exercises;

import java.util.Scanner;

public class ForSumOfOddNumbersFrom1ToN {
    public static void main (String[]args){

        Scanner input = new Scanner (System.in);

        int sum = 0;
        System.out.println("Enter the starting number: ");
        int start = input.nextInt();
        System.out.println("Enter the last number: ");
        int last = input.nextInt();
        input.close();

        if (start%2 == 0){
            start += 1;
        }

        for (int i = start; i <= last; i += 2){
            sum = sum + i;
        }
        System.out.printf("The sum of the odd integers between %d and %d is %d", start, last, sum);
    }
}
