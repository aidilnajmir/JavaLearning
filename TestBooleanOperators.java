import java.util.Scanner;

public class TestBooleanOperators {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print (" Enter a number: ");
        int number = input.nextInt();

        input.close();

        if (number % 2 == 0)
            System.out.println(number + " is divisible by 2");

        if (number % 3 == 0)
            System.out.println(number + " is divisible by 3");
        
        if(number % 2 % 3 == 0)
            System.out.println(number + " is divisible by 2 and 3");

    }
}