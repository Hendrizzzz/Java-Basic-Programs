package Exercises;

import java.util.Scanner;

public class SwitchMaleFemale {
    public static void main(String[]args){

        Scanner scanner = new Scanner (System.in);
        String userGender;

        System.out.println("What is your gender?");
        userGender = scanner.nextLine();

        switch (userGender){
            case "Male":
                System.out.print("You are a Male");
                break;
            case "Female":
                System.out.print("You are a Female");
                break;
            default:
                System.out.print("That is not a Gender");
        }
    }
}
