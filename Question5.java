import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the value
        System.out.print("Enter the value of x: ");
        int x = input.nextInt();
        System.out.print("Enter the value of y: ");
        int y = input.nextInt();

        input.close();

        
        if(x == y)
            System.out.println("1");
        else if(x > y)
            System.out.println("2");
        else 
            System.out.println("3");
    }
}