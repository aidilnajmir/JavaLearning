import java.util.Scanner;

public class SubtractionQuiz {
    public static void main (String[] args){
        // 1. Generate two random single-digit integers
        int num1 = (int)(Math.random () * 10);
        int num2 = (int)(Math.random () * 10);

        // 2. If num1 < num2, swap num1 with num2
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // 3. Prompt the user to answer " what is num1 - num2?"
        System.out.print
        ("What is " + num1 + " - " + num2 + " ? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        input.close();

        // 4. Grade the answer and display the result
        if (num1 - num2 == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(num1 + " - " + num2 + 
            " should be " + (num1 - num2));
        }
    }
}