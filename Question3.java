import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("----------Shopping Budget----------");
        Scanner input = new Scanner(System.in);
        
        //insert the amount of money the user has
        System.out.print("Enter the amount of money you have: RM ");
        double money = input.nextDouble();

        //insert the number of item to purchase
        System.out.print("Enter the number of item(s) purchased: ");
        int item = input.nextInt();

        double totalPrice = 0;
        
        //insert the price of each item
        for (int i = 0; i < item; i++) {
            System.out.print("Price of the item: RM ");
            double price = input.nextDouble();
            totalPrice += price;
        } 

        input.close();
        double balance = money - totalPrice;

        //display the total price
        System.out.println("Total item(s): " + item);
        System.out.println("Total price: RM" + totalPrice);

        //display the balance left or if the money is not enough
        while (balance > 0) {
            System.out.println("You have RM" + balance + " left. Save the money for future use!");
            break;
        }
        
        while (balance == 0) {
            System.out.println("You have used all your money.");
            break;
        }
        
        while (balance < 0) {
            System.out.println("You don't have enough money.");
            break;
        }
    }
}
