import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        
        System.out.println("------------------------ Stay Fit & Healthy ------------------------");

        //display information about exercises
        System.out.println("Based on day today (recommendation) \nCalories burned for exercises (per 30 minutes):-");
        System.out.printf("%-20s%-20s%-20s%-20s\n","Cycling", "Running", "Walking", "Swimming");
        System.out.printf("%-20s%-20s%-20s%-20s\n","295", "295", "140", "255");
        
        Scanner input = new Scanner(System.in);
        //input number (1-7) to get day
        System.out.print("Enter a number for day(1 to 7): ");
        int day = input.nextInt();
        
        input.close();

        //prints day based on number entered
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }
        
        //prints recommendation for exercise duration based on day
        if (day <= 0 || day > 7)
            System.out.println("Try again.");
        else if (day <= 5)
            System.out.println("It's weekday. You have less time to exercise. Exercise at least 30 minutes.");
        else 
            System.out.println("It's weekend. You have more time to exercise. Exercise at least 1 hour.");

    }
}