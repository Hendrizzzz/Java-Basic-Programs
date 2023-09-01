package Exercises;

import java.util.Scanner;
public class LoopPrint1ToN {
    public static void main (String[]args){
        int i;
        int n;                             //declaring variables

        Scanner input = new Scanner (System.in);               //creating a scanner object

        System.out.println("Give me a number: ");
        n = Integer.parseInt(input.nextLine().trim());           //receive an input
        input.close();

        for (i = 0; i < n; i++){
            System.out.println(i);                       //print from 0 to n-1
            }
        System.out.print(n);                             //print n
        }


    }