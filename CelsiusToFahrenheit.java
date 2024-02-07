import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to insert a degree in Celsius
        System.out.print ("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        input.close();
        
        // Convert Celcius to Fahrenheit
        double fahrenheit = celsius * (9.0/5) + 32;

        // Display the result
        System.out.println("Celsius " + celsius + " is " + 
            fahrenheit + " in Fahrenheit");
    }
}