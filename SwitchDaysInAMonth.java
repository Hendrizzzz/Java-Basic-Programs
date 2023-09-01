package Exercises;


import java.util.Scanner;

public class SwitchDaysInAMonth {
    public static void main (String[]args){
        String month;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter a month to find out how many days it has ");
        month = scanner.nextLine().trim();
        scanner.close();

        String fixedMonth = Character.toUpperCase(month.charAt(0)) + month.substring(1);

        switch (fixedMonth){
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.print("It has 31 days!");
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                System.out.print("It has 30 days!");
                break;

            case "February":
                System.out.print("It has 28 days if not leap year!");
                break;

            default:
                System.out.print("That is not a Month");
        }

    }

}
