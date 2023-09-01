package Exercises;

import java.util.Scanner;

public class NestedLoopPyramid {
    public static void main(String[] args) {

        int userInput;
        int i;
        int j;
        int k;
        int x = 1;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number: ");
        userInput = scanner.nextInt();

        for (i = 1;  i <= userInput; i++ ){                //for the number of lines
            for (j = i; j <= userInput-1; j++ ){           //for the number of the initial spaces on each line
                System.out.print(" ");
            }
            for (k = 1; k <= x; k++ ){                    //for the number of asterisk in each line
                System.out.print("*");
            }
            System.out.println();
            x += 2;
        }
    }
}
