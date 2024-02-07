import java.util.Scanner;

public class FinalProject {
    

    public static void main(String[] args) {
        double total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("************************************************\t\t\t\t\t\t************************************************");
        System.out.println("************************************************\t\t\t\t\t\t************************************************");
        System.out.println("************************************************    WELCOME TO THE SHOPPING MANAGEMENT SYSTEM   ************************************************");
        System.out.println("************************************************\t\t\t\t\t\t************************************************");
        System.out.println("************************************************\t\t\t\t\t\t************************************************");
        System.out.print("\t\t\t\t\t\t\t    (PRESS ANY NUMBER TO CONTINUE, -1 TO EXIT)");
        int mainChoice = input.nextInt();
        if (mainChoice == -1) {
            System.exit(0);
        }
        else 
        menu(total);
    }

    public static void menu(double totalPrice) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n*************************************************************************************************************************************************");
        System.out.println("\t\t\t\t\t\t\t\tMAIN MENU");
        System.out.println("\t\t\t\t\t1. Fashion");
        System.out.println("\t\t\t\t\t2. Food and Beverages");
        System.out.println("\t\t\t\t\t3. Groceries");
        System.out.println("\t\t\t\t\t4. Entertainment");
        System.out.println("\t\t\t\t\t5. Exit");
        System.out.print("\t\t\t\t\tEnter your choice (number) : ");
        System.out.println("\n*************************************************************************************************************************************************");
        System.out.print("\t\t\t\t\t\t\t\tEnter your choice (number) : ");
        int menuChoice;
        menuChoice = input.nextInt();
    
    if (menuChoice == 4) {
        System.out.println("\n\n*************************************************************************************************************************************************");
            System.out.println("\t\t\t\t\t\t\t\tENTERTAINMENT SECTION");
            System.out.println("\t\t\t\t(below are the entertainment centres available)");
            System.out.println("\t\t\t\t\t1. Cinema");
            System.out.println("\t\t\t\t\t2. Bowling Alleys");
            System.out.println("\t\t\t\t\t3. Arcades");
            System.out.println("\n*************************************************************************************************************************************************");
            System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
            int entertainment = input.nextInt();
            if (entertainment == -1) {
                menu(totalPrice);
            }

            else if (entertainment == 1) {
                System.out.println("\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\tbelow are the movies available");
                System.out.printf("\t\t\t\t\t%-40s%-30s%-20s%-20s\n", "TITLE", "GENRE","DURATION","TICKET PRICE");
                System.out.printf("\t\t\t\t\t%-40s%-30s%-20s%-20s\n", "1. Godzilla vs. Kong", "Sci-fi/Action", "1h 53m", "RM 15.90");
                System.out.printf("\t\t\t\t\t%-40s%-30s%-20s%-20s\n", "2. Raya and the Last Dragon", "Family/Fantasy", "1h 57m", "RM 11.90");
                System.out.printf("\t\t\t\t\t%-40s%-30s%-20s%-20s\n", "3. Mortal Kombat", "Fantasy/Action", "1h 50m", "RM 14.90");
                System.out.println("\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to main menu");
                int cinema = input.nextInt();
                if (cinema == -1) {
                    menu(totalPrice);
                }
                else if (cinema == 1) {
                    System.out.print("How many people are going to watch Godzilla vs. Kong? : ");
                    int godzillaKong = input.nextInt(); 
                    totalPrice += 15.90 * godzillaKong;
                    System.out.println("Your ticket purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitCinema1 = input.nextInt();
                    if (exitCinema1 != -1) {
                        menu(totalPrice);
                    }
                }
                else if (cinema == 2) {
                    System.out.print("How many many people are going to watch Raya and the Last Dragon? : ");
                    int rayaDragon = input.nextInt(); 
                    totalPrice += 11.90 * rayaDragon;
                    System.out.println("Your ticket purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitCinema2 = input.nextInt();
                    if (exitCinema2 != -1) {
                        menu(totalPrice);
                    }
                }
                else if (cinema == 3) {
                    System.out.print("How many people are going to watch Mortal Kombat? : ");
                    int mortalKombat = input.nextInt(); 
                    totalPrice += 14.90 * mortalKombat;
                    System.out.println("Your ticket purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitCinema3 = input.nextInt();
                    if (exitCinema3 != -1) {
                        menu(totalPrice);
                    }
                }

            else if (entertainment == 2) {
                System.out.println("\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\tBOWLING RATE (PER GAME)");
                System.out.printf("\t\t\t\t\t%-30s%-20s\n", "TYPE", "PRICE");
                System.out.printf("\t\t\t\t\t%-30s%-20s\n", "1. Adult", "RM 8.00");
                System.out.printf("\t\t\t\t\t%-30s%-20s\n", "2. Member", "RM 6.00");
                System.out.printf("\t\t\t\t\t%-30s%-20s\n", "3. Student", "RM 5.00");
                System.out.printf("\t\t\t\t\t%-30s%-20s\n", "4. Shoes Rental (Per Pair)", "RM 2.50");
                System.out.printf("\t\t\t\t\t%-30s%-20s\n", "5. Socks (Per Pair)", "RM 4.00");
                System.out.println("\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to main menu");
                int bowling = input.nextInt();
                if (bowling == -1) {
                    menu(totalPrice);
                }
                else if (bowling == 1) {
                    System.out.print("How many games do you (adult) wish to play? : ");
                    int adult = input.nextInt(); 
                    totalPrice += 8.00 * adult;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitBowling1 = input.nextInt();
                    if (exitBowling1 != -1) {
                        menu(totalPrice);
                    }
                }
                else if (bowling == 2) {
                    System.out.print("How many games do you (member) wish to play? : ");
                    int member = input.nextInt(); 
                    totalPrice += 6.00 * member;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitBowling2 = input.nextInt();
                    if (exitBowling2 != -1) {
                        menu(totalPrice);
                    }
                }
                else if (bowling == 3) {
                    System.out.print("How many games do you (student) wish to play? : ");
                    int student = input.nextInt(); 
                    totalPrice += 5.00 * student;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitBowling3 = input.nextInt();
                    if (exitBowling3 != -1) {
                        menu(totalPrice);
                    }
                }
                else if (bowling == 4) {
                    System.out.print("How many pair of shoes do you want to rent? : ");
                    int shoes = input.nextInt(); 
                    totalPrice += 2.50 * shoes;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitBowling4 = input.nextInt();
                    if (exitBowling4 != -1) {
                        menu(totalPrice);
                    }
                }
                else if (bowling == 5) {
                    System.out.print("How many pair of socks do want to buy? : ");
                    int socks = input.nextInt(); 
                    totalPrice += 4.00 * socks;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitBowling5 = input.nextInt();
                    if (exitBowling5 != -1) {
                        menu(totalPrice);
                    }
                }

            }

            else if (entertainment == 3) {
                System.out.println("\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\tGames available (2 tokens = RM 1) ");
                System.out.printf("\t\t\t\t\t%-30s%-20s\n", "GAME", "TOKEN");
                System.out.printf("\t\t\t\t\t%-30s%-20s\n", "1. Halo Firestorm Raven", "8 tokens");
                System.out.printf("\t\t\t\t\t%-30s%-20s\n", "2. Tekken 7", "4 tokens");
                System.out.printf("\t\t\t\t\t%-30s%-20s\n", "3. Midnight Maximum Tune 5", "6 tokens");
                System.out.printf("\t\t\t\t\t%-30s%-20s\n", "4. Avengers: Infinity Quest", "2 tokens");
                System.out.println("\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to main menu");
                int arcades = input.nextInt();
                if (arcades == -1) {
                    menu(totalPrice);
                }
                else if (arcades == 1) {
                    System.out.print("How many games do you wish to play? : ");
                    int halo = input.nextInt(); 
                    totalPrice += 4.00 * halo;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitArcades1 = input.nextInt();
                    if (exitArcades1 != -1) {
                        menu(totalPrice);
                    }
                }
                else if (arcades == 2) {
                    System.out.print("How many games do you wish to play? : ");
                    int tekken = input.nextInt(); 
                    totalPrice += 2.00 * tekken;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitArcades2 = input.nextInt();
                    if (exitArcades2 != -1) {
                        menu(totalPrice);
                    }
                }
                else if (arcades == 3) {
                    System.out.print("How many games do you wish to play? : ");
                    int midnight = input.nextInt(); 
                    totalPrice += 3.00 * midnight;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitArcades3 = input.nextInt();
                    if (exitArcades3 != -1) {
                        menu(totalPrice);
                    }
                }
                else if (arcades == 4) {
                    System.out.print("How many games do you wish to play? : ");
                    int avengers = input.nextInt(); 
                    totalPrice += 1.00 * avengers;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitArcades4 = input.nextInt();
                    if (exitArcades4 != -1) {
                        menu(totalPrice);
                    }
                }
                
            }

            else {
                System.out.print("Invalid input! Enter any number to return to main menu : ");
                int errorEntertainment = input.nextInt();
                if (errorEntertainment != -1) {
                    menu(totalPrice);
                }
            }
        
        }
    }
}
}
