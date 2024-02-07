//This program compute the Volume of Cylinder

import java.util.Scanner; // Scanner is in the java.util package

public class ComputeVolumeOfCylinderWithConsoleInput {
    public static void main (String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner (System.in);

        // Prompt the user to insert radius
        System.out.print ("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Prompt the user to insert height
        System.out.print ("Enter a number for height: ");
        double height = input.nextDouble();

        input.close();

        // Compute volume
        double volume = radius * radius * height * 3.14159;

        // Display volume
        System.out.println ("The volume for the cylinder of radius " + 
            radius + " and height " + height + " is " + volume);
    }
}