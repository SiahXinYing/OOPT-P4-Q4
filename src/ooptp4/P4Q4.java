/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptp4;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class P4Q4 {

    public static void main(String[] args) {
        //todo :: By using array, create 3 CarType objects
        CarType[] types = {new CarType("Toyota", "Vios", 1.5),
            new CarType("Nissan", "Teana", 2.0),
            new CarType("Honda", "City", 1.6)
        };

        //todo :: create an array that will able to store 6 registration
        Registration[] registration = new Registration[2];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < registration.length; i++) {
            System.out.println("\nRegistration number: " + Registration.currentRegNo);

            //to do :: request and read the owner detail
            System.out.print("Enter Name : ");
            String name = scanner.nextLine();
            System.out.print("IC No. : ");
            int icNo = scanner.nextInt();

            //to do :: construct owner object
            Owner owner = new Owner(name, icNo);

            //to do :: request and read the car detail
            System.out.print("Enter the car's plate number:");
            String plateNum = scanner.nextLine();
            System.out.print("Enter the car's color:");
            String color = scanner.nextLine();
            System.out.print("Enter the car's year:");
            int year = scanner.nextInt();

            System.out.print("\nCar Types: ");

            //to do :: display all available carType
            for(int j=0 ; j<types.length;j++){
            System.out.println((j+1) + "." + types[j].toString);
            }
            
            System.out.print("\nSelect car type [1.." + types.length + "]:");
            int selection = scanner.nextInt();
            
            Car car = new Car(plateNum,color,year,types[selection-1]);
            
            registration[i]= new Registration(owner,car);
            
            scanner.nextLine();
        }
        
        displayListing(registration);
        }
    
   public static void displayListing(Registration[] regArr) {
  	System.out.printf("\n\n%50s\n", "Car Registration Listing");
  	System.out.printf("%-6s %-12s %-12s %-10s %-8s %-6s %-10s %-10s %5s\n", 
  		"Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
  	for (int i = 0; i < regArr.length; ++i) 
  		System.out.println(regArr[i]);
  }

    }
