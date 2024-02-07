//This program compute the Sales and Service Tax and show the amount after tax included
import java.util.Scanner; // Scanner is in the java.util package

public class SalesAndServiceTax {
    public static void main (String[] args) {
       // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the purchase amount
        System.out.print ("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        input.close();

        // Compute tax
        double tax = purchaseAmount * 0.06;
        double afterTaxAmount = purchaseAmount + tax;
        
        // Display tax
        System.out.println ("Sales and Service Tax is " + (int)(tax * 100) / 100.0);
        // Display after tax amount
        System.out.println ("After Tax Amount is " + (int)(afterTaxAmount * 100) / 100.0);
    }
}