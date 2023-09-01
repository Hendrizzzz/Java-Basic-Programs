package Exercises;

import java.util.Scanner;

public class IfVowelOrConsonant {
    public static void main(String[] args) {
        char letter;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a letter. ");
        letter = scanner.nextLine().charAt(0);
        scanner.close();

        if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
            switch (letter) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.print("The letter is a vowel");
                    break;
                default:
                    System.out.print("The letter is a consonant");
            }
        }else {
            System.out.print("That is not a letter");
        }
    }
}