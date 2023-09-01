package Exercises;

import java.util.Scanner;
public class NestedLoopShape {
    public static void main (String[]args){

        int rows, columns;
        String symbol;

        Scanner input = new Scanner (System.in);
        System.out.println("Enter how many rows: ");
        rows = input.nextInt();
        System.out.println("Enter how many columns: ");
        columns = input.nextInt();
        System.out.println("Enter what symbol to use: ");
        symbol = input.next();

        for (int i = 1; i <= rows; i++){
            System.out.println();
            for (int j = 1; j <= columns; j++){
                System.out.print(symbol);
            }
        }
    }
}
