package com.pluralsight;
import java.util.*;
public class UserInterface { // User Interface: Meant to be what the user/customer is mainly meant to use to complete whatever task they need
    public static void userStart () { // Meant to call the specific dealership method and display all the vehicles
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("|Welcome to the Car Dealership!|");
        System.out.println("________________________________");
        System.out.println("What Would You Like To do?");
        System.out.println("(7) List All Vehicles\n" + "(8) Add a Vehicle\n" + "(9) Remove a Vehicle\n" + "(0) Exit");
        int userChoice = scanner.nextInt();
        do {


            switch  (userChoice) {
                case 7:
                    System.out.println("All Vehicles");
                    break;
                case 8:
                    System.out.println("8");
                    break;
                case 9:
                    System.out.println("9");
                    break;
                case 0:
                    userExit();
                    break;
                default:
                    System.out.println("INVALID - Please Enter one of the number in the Parentheses ");
            }
        } while (true);
    }




    static void userExit(){ //make just cause why not
        System.exit(0);
    }
}

