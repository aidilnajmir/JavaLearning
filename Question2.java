import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("-------------- Group Divisor --------------");
        Scanner input = new Scanner(System.in);
        
        //insert the number of students 
        System.out.print("Enter the number of students in the class: ");
        int student = input.nextInt();

        //insert the number of groups
        System.out.print("Enter the number of groups needed: ");
        int group = input.nextInt();

        input.close();

        //calculate the number of students per group 
        double a = Math.floor(student / group);
        double b = Math.floor(student % group);
        System.out.println("Number of students per group: " + a);
        System.out.println("Number of students that don't have group: " + b);

        //display if the division is fair or there are extra students
        if (b == 0)
            System.out.println("It's a fair division.");
        else 
            System.out.println(b + " student(s) should join any group.");
    }
}
