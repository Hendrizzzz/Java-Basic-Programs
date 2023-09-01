package Exercises;

import java.util.Scanner;

public class LoopAreaOfCircle {
    public static void main (String[]args) {
        int userInput;

        Scanner scanner = new Scanner (System.in);

        while (true){
            boolean isPrime = true;

            System.out.println("Enter a positive number: ");
            if (scanner.hasNextInt()){
                userInput = scanner.nextInt();
                if (userInput < 0){
                    scanner.nextLine();
                    continue;
                }
                else if (userInput == 0 || userInput == 1){
                    isPrime = false;
                    break;
                }
                double sqrt = Math.sqrt (userInput);

                for (int i = 2; Math.round(sqrt) >= i; i++ ){
                    if (userInput % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                    System.out.print(userInput + " is a Prime Number ");
                }
                else{
                    System.out.print(userInput + " is not a Prime Number");
                }
                break;
                }
            else{
                scanner.nextLine();
            }
        }
       }
    }