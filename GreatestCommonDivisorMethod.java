import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    /** Main method */
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int n2 = input.nextInt();

        System.out.println("The greatest common divisor for " + n1 + 
         " and " + n2 + " is " + gcd(n1, n2));
    
         input.close();
    }

    /** Return the gcd of two integers */
    public static int gcd(int n1, int n2) {
        int gcd = 1;    // Initial gcd is 1
        int k = 1;  // Possible gcd

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;    // Update gcd
            k++;
        }

        return gcd; // Return gcd
    }
}
