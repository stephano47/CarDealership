package com.pluralsight;
import java.util.*;
public class UserInterface { // User Interface: Meant to be what the user/customer is mainly meant to use to complete whatever task they need

    public static void userStart () { // Meant to call the specific dealership method and display all the vehicles

        do{
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("|Welcome to the Car Dealership!|");
        System.out.println("________________________________");
        System.out.println("What Would You Like To do?");
        System.out.println("(7) List All Vehicles\n" + "(8) Add a Vehicle\n" + "(9) Remove a Vehicle\n" + "(99) Exit");
        int userChoice = scanner.nextInt();

            switch  (userChoice) {
                case 7:
                    displayAll();
                    break;
                case 8:
                    vehicleAdd();
                    break;
                case 9:
                    vehicleRemove();
                    break;
                case 99:
                    userExit();
                    break;
                default:
                    System.out.println("INVALID - Please Enter one of the number in the Parentheses ");
            }
        } while (true);
    }


    public static void displayAll(){
     DealershipFileManager.readAll();
    }

    private static void vehicleAdd(){
        int vin = Console.PromptForInt("Enter Vin: ");
        int year = Console.PromptForInt("Enter year: ");
        String make = Console.PromptForString("Enter make: ");
        String model = Console.PromptForString("Enter model: ");
        String vehicleType = Console.PromptForString("Enter vehicle type: ");
        String color = Console.PromptForString("Enter color:  ");
        int odometer = Console.PromptForInt("Enter odometer: ");
        double price = Console.PromptForDouble("Enter price: ");

        Vehicle v = new Vehicle(vin,year, make, model, vehicleType, color, odometer, price);



    }
    private static void vehicleRemove(){
        System.out.println("Removing Vehicle..");
    }

    public static void displayVehicle(Vehicle v){
        System.out.println(v);
    }



    static void userExit(){//make just cause why not
        System.out.println("Exiting....");
        System.exit(0);
    }
}

