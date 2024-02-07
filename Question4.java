import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("------------------------- Productivity Calculator -------------------------");

        productivityCalculator();

        System.out.println("\nThank you for using this capacity management calculator!");
    }

    public static void productivityCalculator() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of products demanded by your customers (per day): ");
        int totalProduct = input.nextInt();

        System.out.println("Productivity of employee (based on type and size of the products):-");
        System.out.printf("\n%-20s%-20s%-20s%-20s", "1. Small products", "2. Medium products", "3. Large products", "4. Other products");
        System.out.printf("\n%-20s%-20s%-20s%-20s", "50 units/ hour", "25 units/hour", "7 units/hour", "10 units/hour");

        productionCalculator(totalProduct);

        input.close();
    }

    public static void productionCalculator(int productivity) {
        Scanner input = new Scanner(System.in);

        System.out.print("\n\nChoose the type of products to produce (1-4): ");
        int productType = input.nextInt();

        System.out.print("\n\nNumber of your employee(s): ");
        int employees = input.nextInt();

        double timeTaken = 0;

        input.close();

        if (productType == 1) {
            timeTaken = productivity / 50.0;
            System.out.println(((int) (timeTaken * 100) / 100.0) + " hour(s) needed if you only have 1 employee.");
            System.out.println("With " + employees + " employee(s), the production will be finished in "
                + ((int) (timeTaken * 100) / 100.0) / employees + " hour(s).");
        }

        if (productType == 2) {
            timeTaken = productivity / 25.0;
            System.out.println(((int) (timeTaken * 100) / 100.0) + " hour(s) needed if you only have 1 employee.");
            System.out.println("With " + employees + " employee(s), the production will be finished in "
                + ((int) (timeTaken * 100) / 100.0) / employees + " hour(s).");
        }

        if (productType == 3) {
            timeTaken = productivity / 7.0;
            System.out.println(((int) (timeTaken * 100) / 100.0) + " hour(s) needed if you only have 1 employee.");
            System.out.println("With " + employees + " employee(s), the production will be finishedin "
                + ((int) (timeTaken * 100) / 100.0) / employees + " hour(s).");
        }

        if (productType == 4) {
            timeTaken = productivity / 10.0;
            System.out.println(((int) (timeTaken * 100) / 100.0) + " hour(s) needed if you only have 1 employee.");
            System.out.println("With " + employees + " employee(s), the production will be finished in "
                + ((int) (timeTaken * 100) / 100.0) / employees + " hour(s).");
        }

        if (productType <= 0 || productType > 4){
            System.out.println("Invalid input.");
        }
    }
}
