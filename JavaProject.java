import java.util.Scanner;

public class JavaProject {

    public static void main(String[] args) {
        double total = 0;
        int SweatshirtCount = 0, HoodieCount = 0, BlouseCount = 0, MenShoeCount = 0, WomenShoeCount = 0,
                KidsShoeCount = 0, MenWatchCount = 0, WomenWatchCount = 0, HandbagCount = 0, SnackPlateCount = 0,
                ZingerCount = 0, SignatureCount = 0, IceCreamCount = 0, CakeCount = 0, BananaCount = 0,
                MilkTeaCount = 0, StrawPuddingCount = 0, AmericanoCount = 0, BreadCount = 0, MuffinCount = 0,
                DoughnutCount = 0, ChickenCount = 0, MeatCount = 0, FishCount = 0, RiceCount = 0, PastaCount = 0,
                MeeCount = 0, OilCount = 0, ChiliCount = 0, MustardCount = 0, KokoCount = 0, HoneyCount = 0,
                KelloggCount = 0, SoupCount = 0, BeanCount = 0, TunaCount = 0, BroccoliCount = 0, ShrimpCount = 0,
                CarrotCount = 0, MilkCount = 0, EggsCount = 0, CheeseCount = 0, CrackerCount = 0, PeanutCount = 0,
                ChipsCount = 0, AppleCount = 0, OrangeCount = 0, PotatoCount = 0, LemonTeaCount = 0, JuiceCount = 0,
                SoftDrinkCount = 0, GodzillaCount = 0, RayaCount = 0, MortalCount = 0, AdultCount = 0, MemberCount = 0,
                StudentCount = 0, BowlShoesCount = 0, SocksCount = 0, HaloCount = 0, TekkenCount = 0, MidnightCount = 0,
                AvengersCount = 0;

        Scanner input = new Scanner(System.in);
        System.out.println(
                "************************************************\t\t\t\t\t\t************************************************");
        System.out.println(
                "************************************************\t\t\t\t\t\t************************************************");
        System.out.println(
                "************************************************    WELCOME TO THE SHOPPING MANAGEMENT SYSTEM   ************************************************");
        System.out.println(
                "************************************************\t\t\t\t\t\t************************************************");
        System.out.println(
                "************************************************\t\t\t\t\t\t************************************************");
        System.out.print("\t\t\t\t\t\t (PRESS ANY NUMBER TO CONTINUE, -1 TO EXIT) : ");
        int mainChoice = input.nextInt();
        if (mainChoice != -1) {
            menu(total, SweatshirtCount, HoodieCount, BlouseCount, MenShoeCount, WomenShoeCount, KidsShoeCount,
                    MenWatchCount, WomenWatchCount, HandbagCount, SnackPlateCount, ZingerCount, SignatureCount,
                    IceCreamCount, CakeCount, BananaCount, MilkTeaCount, StrawPuddingCount, AmericanoCount, BreadCount,
                    MuffinCount, DoughnutCount, ChickenCount, MeatCount, FishCount, RiceCount, PastaCount, MeeCount,
                    OilCount, ChiliCount, MustardCount, KokoCount, HoneyCount, KelloggCount, SoupCount, BeanCount,
                    TunaCount, BroccoliCount, ShrimpCount, CarrotCount, MilkCount, EggsCount, CheeseCount, CrackerCount,
                    PeanutCount, ChipsCount, AppleCount, OrangeCount, PotatoCount, LemonTeaCount, JuiceCount,
                    SoftDrinkCount, GodzillaCount, RayaCount, MortalCount, AdultCount, MemberCount, StudentCount,
                    BowlShoesCount, SocksCount, HaloCount, TekkenCount, MidnightCount, AvengersCount);
        } else if (mainChoice == -1) {
            System.exit(0);
        }
    }

    public static void menu(double totalPrice, int sweatshirtCount, int hoodieCount, int blouseCount, int menShoeCount,
            int womenShoeCount, int kidsShoeCount, int menWatchCount, int womenWatchCount, int handbagCount,
            int snackPlateCount, int zingerCount, int signatureCount, int iceCreamCount, int cakeCount, int bananaCount,
            int milkTeaCount, int strawPuddingCount, int americanoCount, int breadCount, int muffinCount,
            int doughnutCount, int chickenCount, int meatCount, int fishCount, int riceCount, int pastaCount,
            int meeCount, int oilCount, int chiliCount, int mustardCount, int kokoCount, int honeyCount,
            int kelloggCount, int soupCount, int beanCount, int tunaCount, int broccoliCount, int shrimpCount,
            int carrotCount, int milkCount, int eggsCount, int cheeseCount, int crackerCount, int peanutCount,
            int chipsCount, int appleCount, int orangeCount, int potatoCount, int lemonTeaCount, int juiceCount,
            int softDrinkCount, int godzillaCount, int rayaCount, int mortalCount, int adultCount, int memberCount,
            int studentCount, int bowlShoesCount, int socksCount, int haloCount, int tekkenCount, int midnightCount,
            int avengersCount) {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "\n\n*************************************************************************************************************************************************");
        System.out.println("\t\t\t\t\t\t\t\tMAIN MENU");
        System.out.println("\t\t\t\t\t1. Fashion");
        System.out.println("\t\t\t\t\t2. Food and Beverages");
        System.out.println("\t\t\t\t\t3. Groceries");
        System.out.println("\t\t\t\t\t4. Entertainment");
        System.out.println("\t\t\t\t\t5. Exit");
        System.out.println(
                "\n*************************************************************************************************************************************************");
        System.out.print("\t\t\t\t\t\t\tEnter your choice (number) : ");
        int menuChoice;
        menuChoice = input.nextInt();

        if (menuChoice == 1) {
            System.out.println(
                    "\n\n*************************************************************************************************************************************************");
            System.out.println("\t\t\t\t\t\t\t\tFASHION SECTION");
            System.out.println("\t\t\t\t(below are the shops available that sell products related to fashion)");
            System.out.println("\t\t\t\t\t1. Uniqlo");
            System.out.println("\t\t\t\t\t2. Adidas");
            System.out.println("\t\t\t\t\t3. Fossil");
            System.out.println(
                    "\n*************************************************************************************************************************************************");
            System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
            int menu1 = input.nextInt();

            if (menu1 == -1) {
                menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount, kidsShoeCount,
                        menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount, signatureCount,
                        iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount, americanoCount,
                        breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount, riceCount,
                        pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount, kelloggCount,
                        soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount,
                        cheeseCount, crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                        lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount, adultCount,
                        memberCount, studentCount, bowlShoesCount, socksCount, haloCount, tekkenCount, midnightCount,
                        avengersCount);
            } else if (menu1 == 1) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\t\t\t\t\tUNIQLO");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "PRODUCT", "PRICE");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Sweatshirt", "RM 59.90");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Men's Hoodie", "RM 70.00");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Women's Blouse", "RM 65.90");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to main menu : ");
                int fashion1 = input.nextInt();
                if (fashion1 == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                } else if (fashion1 == 1) {
                    System.out.print("How many of sweatshirt do you want to buy? : ");
                    int sweatshirt = input.nextInt();
                    sweatshirtCount += sweatshirt;
                    totalPrice += 59.9 * sweatshirt;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitUniqlo1 = input.nextInt();
                    if (exitUniqlo1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                } else if (fashion1 == 2) {
                    System.out.print("How many of men's hoodie do you want to buy? : ");
                    int menHoodie = input.nextInt();
                    hoodieCount += menHoodie;
                    totalPrice += 70.0 * menHoodie;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitUniqlo2 = input.nextInt();
                    if (exitUniqlo2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                } else if (fashion1 == 3) {
                    System.out.print("How many of women's blouse do you want to buy? : ");
                    int womenBlouse = input.nextInt();
                    blouseCount += womenBlouse;
                    totalPrice += 65.9 * womenBlouse;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitUniqlo3 = input.nextInt();
                    if (exitUniqlo3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
            } else if (menu1 == 2) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\t\t\t\t\tADIDAS");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "PRODUCT", "PRICE");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Men's shoe", "RM 159.90");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Women's shoe", "RM 129.90");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Kid's shoe", "RM 95.50");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to main menu : ");
                int fashion2 = input.nextInt();
                if (fashion2 == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                } else if (fashion2 == 1) {
                    System.out.print("How many of men's shoe do you want to buy? : ");
                    int menShoe = input.nextInt();
                    menShoeCount += menShoe;
                    totalPrice += 159.9 * menShoe;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitAdidas1 = input.nextInt();
                    if (exitAdidas1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                } else if (fashion2 == 2) {
                    System.out.print("How many of women's shoe do you want to buy? : ");
                    int womenShoe = input.nextInt();
                    womenShoeCount += womenShoe;
                    totalPrice += 129.9 * womenShoe;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitAdidas2 = input.nextInt();
                    if (exitAdidas2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                } else if (fashion2 == 3) {
                    System.out.print("How many of kids' shoe do you want to buy? : ");
                    int kidsShoe = input.nextInt();
                    totalPrice += 95.5 * kidsShoe;
                    kidsShoeCount += kidsShoe;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitAdidas3 = input.nextInt();
                    if (exitAdidas3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
            } else if (menu1 == 3) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\t\t\t\t\tFOSSIL");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "PRODUCT", "PRICE");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Men's watch", "RM 499.00");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Women's watch", "RM 449.90");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Women's handbag", "RM 600.00");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to main menu : ");
                int fashion3 = input.nextInt();
                if (fashion3 == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }

                else if (fashion3 == 1) {
                    System.out.print("How many of men's watch do you want to buy? : ");
                    int menWatch = input.nextInt();
                    menWatchCount += menWatch;
                    totalPrice += 499.0 * menWatch;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitFossil1 = input.nextInt();
                    if (exitFossil1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (fashion3 == 2) {
                    System.out.print("How many of women's watch do you want to buy? : ");
                    int womenWatch = input.nextInt();
                    womenWatchCount += womenWatch;
                    totalPrice += 449.9 * womenWatch;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitFossil2 = input.nextInt();
                    if (exitFossil2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (fashion3 == 3) {
                    System.out.print("How many of women's handbag do you want to buy? : ");
                    int womenHandbag = input.nextInt();
                    handbagCount += womenHandbag;
                    totalPrice += 600.0 * womenHandbag;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitFossil3 = input.nextInt();
                    if (exitFossil3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
            }

            else {
                System.out.print("Invalid input! Enter any number to return to main menu : ");
                int errorFashion = input.nextInt();
                if (errorFashion != -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }
            }

        }

        else if (menuChoice == 2) {
            System.out.println(
                    "\n\n*************************************************************************************************************************************************");
            System.out.println("\t\t\t\t\t\t\t\tFOOD AND BEVERAGES SECTION");
            System.out.println("\t\t\t\t(below are the shops available that sell food and beverages)");
            System.out.println("\t\t\t\t\t1. Kentucky Fried Chicken (KFC)");
            System.out.println("\t\t\t\t\t2. Baskin robbins");
            System.out.println("\t\t\t\t\t3. Tealive");
            System.out.println(
                    "\n*************************************************************************************************************************************************");
            System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
            int menu2 = input.nextInt();
            if (menu2 == -1) {
                menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount, kidsShoeCount,
                        menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount, signatureCount,
                        iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount, americanoCount,
                        breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount, riceCount,
                        pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount, kelloggCount,
                        soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount,
                        cheeseCount, crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                        lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount, adultCount,
                        memberCount, studentCount, bowlShoesCount, socksCount, haloCount, tekkenCount, midnightCount,
                        avengersCount);
            }

            else if (menu2 == 1) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\t\t\t\t\tKENTUCKY FRIED CHICKEN (KFC)");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "MENU", "PRICE");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Snack Plate 2-pieces chicken", "RM 16.90");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Zinger Combo", "RM 15.50");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Signature Box - Classic", "RM 19.90");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to main menu : ");
                int foodBeverages1 = input.nextInt();
                if (foodBeverages1 == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }

                else if (foodBeverages1 == 1) {
                    System.out.print("How many of Snack Plate 2-pieces chicken do you want to buy? : ");
                    int snackPlate = input.nextInt();
                    snackPlateCount += snackPlate;
                    totalPrice += 16.90 * snackPlate;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitKfc1 = input.nextInt();
                    if (exitKfc1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (foodBeverages1 == 2) {
                    System.out.print("How many of Zinger Combo do you want to buy? : ");
                    int zingerCombo = input.nextInt();
                    zingerCount += zingerCombo;
                    totalPrice += 15.50 * zingerCombo;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitKfc2 = input.nextInt();
                    if (exitKfc2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (foodBeverages1 == 3) {
                    System.out.print("How many of Signature Box - Classic do you want to buy? : ");
                    int signatureBox = input.nextInt();
                    signatureCount += signatureBox;
                    totalPrice += 19.90 * signatureBox;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitKfc3 = input.nextInt();
                    if (exitKfc3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
            }

            else if (menu2 == 2) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\t\t\t\t\tBaskin Robbins");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "MENU", "PRICE");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Regular Single-scoop Ice Cream", "RM 11.00");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Rainbow Tuxedo Cake", "RM 155.00");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Banana Split", "RM 28.50");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to main menu : ");
                int foodBeverages2 = input.nextInt();
                if (foodBeverages2 == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }

                else if (foodBeverages2 == 1) {
                    System.out.print("How many of Regular Single-scoop Ice Cream do you want to buy? : ");
                    int singleScoop = input.nextInt();
                    iceCreamCount += singleScoop;
                    totalPrice += 11.00 * singleScoop;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitBR1 = input.nextInt();
                    if (exitBR1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (foodBeverages2 == 2) {
                    System.out.print("How many of Rainbow Tuxedo Cake do you want to buy? : ");
                    int rainbowCake = input.nextInt();
                    cakeCount += rainbowCake;
                    totalPrice += 155.00 * rainbowCake;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitBR2 = input.nextInt();
                    if (exitBR2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (foodBeverages2 == 3) {
                    System.out.print("How many of Banana Split do you want to buy? : ");
                    int bananaSplit = input.nextInt();
                    bananaCount += bananaSplit;
                    totalPrice += 28.50 * bananaSplit;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitBR3 = input.nextInt();
                    if (exitBR3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
            }

            else if (menu2 == 3) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\t\t\t\t\tTealive");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "MENU", "PRICE");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Signature Brown Sugar Pearl Milk Tea", "RM 7.50");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Strawberry Pudding Smoothies", "RM 8.50");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Americano", "RM 7.50");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to main menu : ");
                int foodBeverages3 = input.nextInt();
                if (foodBeverages3 == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }

                else if (foodBeverages3 == 1) {
                    System.out.print("How many of Signature Brown Sugar Pearl Milk Tea do you want to buy? : ");
                    int milkTea = input.nextInt();
                    milkTeaCount += milkTea;
                    totalPrice += 7.50 * milkTea;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitTea1 = input.nextInt();
                    if (exitTea1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (foodBeverages3 == 2) {
                    System.out.print("How many of Strawberry Pudding Smoothies do you want to buy? : ");
                    int strawberry = input.nextInt();
                    strawPuddingCount += strawberry;
                    totalPrice += 8.50 * strawberry;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitTea2 = input.nextInt();
                    if (exitTea2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (foodBeverages3 == 3) {
                    System.out.print("How many of Americano do you want to buy? : ");
                    int americano = input.nextInt();
                    americanoCount += americano;
                    totalPrice += 7.50 * americano;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitTea3 = input.nextInt();
                    if (exitTea3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
            }

            else {
                System.out.print("Invalid input! Enter any number to return to main menu : ");
                int errorFood = input.nextInt();
                if (errorFood != -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }
            }

        }

        else if (menuChoice == 3) {
            System.out.println(
                    "\n\n*************************************************************************************************************************************************");
            System.out.println("\t\t\t\t\t\t\t\tGROCERIES SECTION");
            System.out.println("\t\t\t\t(below are the types of products available for groceries)");
            System.out.println("\t\t\t\t\t1. Bakery and Bread");
            System.out.println("\t\t\t\t\t2. Meat and Seafood");
            System.out.println("\t\t\t\t\t3. Pasta and Rice");
            System.out.println("\t\t\t\t\t4. Oils, Sauces, Salad Dressings, and Condiments");
            System.out.println("\t\t\t\t\t5. Cereals and Breakfast Foods");
            System.out.println("\t\t\t\t\t6. Soups and Canned Goods");
            System.out.println("\t\t\t\t\t7. Frozen Foods");
            System.out.println("\t\t\t\t\t8. Dairy, Cheese, and Eggs");
            System.out.println("\t\t\t\t\t9. Snacks and Crackers");
            System.out.println("\t\t\t\t\t10. Produce (Fruits and Vegetables)");
            System.out.println("\t\t\t\t\t11. Drinks");
            System.out.println(
                    "\n*************************************************************************************************************************************************");
            System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
            int product3 = input.nextInt();
            if (product3 == -1) {
                menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount, kidsShoeCount,
                        menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount, signatureCount,
                        iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount, americanoCount,
                        breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount, riceCount,
                        pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount, kelloggCount,
                        soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount,
                        cheeseCount, crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                        lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount, adultCount,
                        memberCount, studentCount, bowlShoesCount, socksCount, haloCount, tekkenCount, midnightCount,
                        avengersCount);
            }

            else if (product3 == 1) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\t\t\t\t\t ");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "PRODUCT", "PRICE");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Whole wheat bread", "RM 4.50");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Muffins", "RM 2.50");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Donuts (6 per pack)", "RM 7.90");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
                int bakery = input.nextInt();
                if (bakery == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }

                else if (bakery == 1) {
                    System.out.print("How many of whole wheat bread do you want to buy? : ");
                    int bread = input.nextInt();
                    breadCount += bread;
                    totalPrice += 4.50 * bread;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitBakery1 = input.nextInt();
                    if (exitBakery1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (bakery == 2) {
                    System.out.print("How many of muffins do you want to buy? : ");
                    int muffin = input.nextInt();
                    muffinCount += muffin;
                    totalPrice += 2.50 * muffin;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitBakery2 = input.nextInt();
                    if (exitBakery2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (bakery == 3) {
                    System.out.print("How many pack of donuts do you want to buy? : ");
                    int donut = input.nextInt();
                    doughnutCount += donut;
                    totalPrice += 7.90 * donut;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitBakery3 = input.nextInt();
                    if (exitBakery3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
            }

            else if (product3 == 2) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\t\t\t\t\t ");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "PRODUCT", "PRICE");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Chicken", "RM 6.90/kg");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Meat", "RM 10.00/kg");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Fish", "RM 12.00/kg");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
                int meatSeafood = input.nextInt();
                if (meatSeafood == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }

                else if (meatSeafood == 1) {
                    System.out.print("How many kilogram of chicken do you want to buy? : ");
                    int chicken = input.nextInt();
                    chickenCount += chicken;
                    totalPrice += 6.90 * chicken;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitMeatSeafood1 = input.nextInt();
                    if (exitMeatSeafood1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (meatSeafood == 2) {
                    System.out.print("How many kilogram of meat do you want to buy? : ");
                    int meat = input.nextInt();
                    meatCount += meat;
                    totalPrice += 10.00 * meat;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitMeatSeafood2 = input.nextInt();
                    if (exitMeatSeafood2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (meatSeafood == 3) {
                    System.out.print("How many kilogram of fish do you want to buy? : ");
                    int fish = input.nextInt();
                    fishCount += fish;
                    totalPrice += 12.00 * fish;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitMeatSeafood3 = input.nextInt();
                    if (exitMeatSeafood3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
            }

            else if (product3 == 3) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\t\t\t\t\t ");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "PRODUCT", "PRICE");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Rice (10 kg)", "RM 13.50");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Pasta", "RM 4.00");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Mee", "RM 3.00");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
                int ricePasta = input.nextInt();
                if (ricePasta == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }

                else if (ricePasta == 1) {
                    System.out.print("How many packet of rice do you want to buy? : ");
                    int rice = input.nextInt();
                    riceCount += rice;
                    totalPrice += 13.50 * rice;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitRicePasta1 = input.nextInt();
                    if (exitRicePasta1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (ricePasta == 2) {
                    System.out.print("How many packet of pasta do you want to buy? : ");
                    int pasta = input.nextInt();
                    pastaCount += pasta;
                    totalPrice += 4.00 * pasta;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitRicePasta2 = input.nextInt();
                    if (exitRicePasta2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (ricePasta == 3) {
                    System.out.print("How many packet of mee do you want to buy? : ");
                    int mee = input.nextInt();
                    meeCount += mee;
                    totalPrice += 3.00 * mee;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitRicePasta3 = input.nextInt();
                    if (exitRicePasta3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
            }

            else if (product3 == 4) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\t\t\t\t\t ");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "PRODUCT", "PRICE");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Cooking Oil", "RM 30.00");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Chili Sauce", "RM 20.00");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Mustard", "RM 14.30");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
                int oilSauce = input.nextInt();
                if (oilSauce == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }

                else if (oilSauce == 1) {
                    System.out.print("How many of cooking oil do you want to buy? : ");
                    int oil = input.nextInt();
                    oilCount += oil;
                    totalPrice += 30.00 * oil;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitOilSauce1 = input.nextInt();
                    if (exitOilSauce1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (oilSauce == 2) {
                    System.out.print("How many bottle of chili sauce do you want to buy? : ");
                    int sauce = input.nextInt();
                    chiliCount += sauce;
                    totalPrice += 20.00 * sauce;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitOilSauce2 = input.nextInt();
                    if (exitOilSauce2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (oilSauce == 3) {
                    System.out.print("How many bottle of mustard do you want to buy? : ");
                    int mustard = input.nextInt();
                    mustardCount += mustard;
                    totalPrice += 14.30 * mustard;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitOilSauce3 = input.nextInt();
                    if (exitOilSauce3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
            }

            else if (product3 == 5) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\t\t\t\t\t ");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "PRODUCT", "PRICE");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Koko Krunch", "RM 10.50");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Honey Stars", "RM 13.20");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Kellogg's Froot Loops", "RM 10.50");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
                int cereals = input.nextInt();
                if (cereals == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }

                else if (cereals == 1) {
                    System.out.print("How many packet of Koko Krunch do you want to buy? : ");
                    int kokoKrunch = input.nextInt();
                    kokoCount += kokoKrunch;
                    totalPrice += 10.50 * kokoKrunch;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitCereals1 = input.nextInt();
                    if (exitCereals1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (cereals == 2) {
                    System.out.print("How many packet of Honey Stars do you want to buy? : ");
                    int honeyStars = input.nextInt();
                    honeyCount += honeyStars;
                    totalPrice += 13.20 * honeyStars;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitCereals2 = input.nextInt();
                    if (exitCereals2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (cereals == 3) {
                    System.out.print("How many packet of Kellog's Froot Loops do you want to buy? : ");
                    int frootLoops = input.nextInt();
                    kelloggCount += frootLoops;
                    totalPrice += 10.50 * frootLoops;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitCereals3 = input.nextInt();
                    if (exitCereals3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
            }

            else if (product3 == 6) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\t\t\t\t\t ");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "PRODUCT", "PRICE");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Condensed Soup", "RM 20.90");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Canned Beans", "RM 4.00");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Canned Tuna", "RM 6.90");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
                int cannedGoods = input.nextInt();
                if (cannedGoods == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }

                else if (cannedGoods == 1) {
                    System.out.print("How many packet of rice do you want to buy? : ");
                    int soup = input.nextInt();
                    soupCount += soup;
                    totalPrice += 20.90 * soup;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitCannedGoods1 = input.nextInt();
                    if (exitCannedGoods1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (cannedGoods == 2) {
                    System.out.print("How many packet of pasta do you want to buy? : ");
                    int beans = input.nextInt();
                    beanCount += beans;
                    totalPrice += 4.00 * beans;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitCannedGoods2 = input.nextInt();
                    if (exitCannedGoods2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (cannedGoods == 3) {
                    System.out.print("How many packet of mee do you want to buy? : ");
                    int tuna = input.nextInt();
                    tunaCount += tuna;
                    totalPrice += 6.90 * tuna;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitCannedGoods3 = input.nextInt();
                    if (exitCannedGoods3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
            }

            else if (product3 == 7) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\t\t\t\t\t ");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "PRODUCT", "PRICE");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Broccoli", "RM 7.50");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Frozen Shrimp", "RM 10.50");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Carrots", "RM 8.20");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
                int frozen = input.nextInt();
                if (frozen == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                } else if (frozen == 1) {
                    System.out.print("How many packet of broccoli do you want to buy? : ");
                    int broccoli = input.nextInt();
                    broccoliCount += broccoli;
                    totalPrice += 7.50 * broccoli;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitFrozen1 = input.nextInt();
                    if (exitFrozen1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (frozen == 2) {
                    System.out.print("How many packet of frozen shrimp do you want to buy? : ");
                    int shrimp = input.nextInt();
                    shrimpCount += shrimp;
                    totalPrice += 10.50 * shrimp;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitFrozen2 = input.nextInt();
                    if (exitFrozen2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (frozen == 3) {
                    System.out.print("How many packet of carrots do you want to buy? : ");
                    int carrots = input.nextInt();
                    carrotCount += carrots;
                    totalPrice += 8.20 * carrots;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitFrozen3 = input.nextInt();
                    if (exitFrozen3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
            }

            else if (product3 == 8) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\t\t\t\t\t ");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "PRODUCT", "PRICE");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Milk", "RM 7.90");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Fresh Eggs Grade A", "RM 12.00");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Cheese", "RM 8.00");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
                int dairy = input.nextInt();
                if (dairy == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }

                else if (dairy == 1) {
                    System.out.print("How many packet of milk do you want to buy? : ");
                    int milk = input.nextInt();
                    milkCount += milk;
                    totalPrice += 7.90 * milk;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitDairy1 = input.nextInt();
                    if (exitDairy1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
                else if (dairy == 2) {
                    System.out.print("How many packet of fresh eggs do you want to buy? : ");
                    int eggs = input.nextInt();
                    eggsCount += eggs;
                    totalPrice += 12.00 * eggs;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitDairy2 = input.nextInt();
                    if (exitDairy2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (dairy == 3) {
                    System.out.print("How many packet of cheese do you want to buy? : ");
                    int cheese = input.nextInt();
                    cheeseCount += cheese;
                    totalPrice += 8.00 * cheese;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitDairy3 = input.nextInt();
                    if (exitDairy3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
            }

            else if (product3 == 9) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\t\t\t\t\t ");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "PRODUCT", "PRICE");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Whole-grain Crackers", "RM 10.50");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Peanut Butter", "RM 11.40");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Potato Chips", "RM 5.40");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
                int snacks = input.nextInt();
                if (snacks == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }

                else if (snacks == 1) {
                    System.out.print("How many packet of whole-grain crackers do you want to buy? : ");
                    int crackers = input.nextInt();
                    crackerCount += crackers;
                    totalPrice += 10.50 * crackers;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitSnacks1 = input.nextInt();
                    if (exitSnacks1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (snacks == 2) {
                    System.out.print("How many packet of peanut butter do you want to buy? : ");
                    int butter = input.nextInt();
                    peanutCount += butter;
                    totalPrice += 11.40 * butter;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitSnacks2 = input.nextInt();
                    if (exitSnacks2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (snacks == 3) {
                    System.out.print("How many packet of potato chips do you want to buy? : ");
                    int chips = input.nextInt();
                    chipsCount += chips;
                    totalPrice += 5.40 * chips;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitSnacks3 = input.nextInt();
                    if (exitSnacks3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
            }

            else if (product3 == 10) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\t\t\t\t\t ");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "PRODUCT", "PRICE");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Apples", "RM 13.50");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Oranges", "RM 10.00");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Sweet Potatoes", "RM 7.30");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
                int produce = input.nextInt();
                if (produce == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }

                else if (produce == 1) {
                    System.out.print("How many packet of apples do you want to buy? : ");
                    int apple = input.nextInt();
                    appleCount += apple;
                    totalPrice += 13.50 * apple;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitProduce1 = input.nextInt();
                    if (exitProduce1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (produce == 2) {
                    System.out.print("How many packet of oranges do you want to buy? : ");
                    int orange = input.nextInt();
                    orangeCount += orange;
                    totalPrice += 10.00 * orange;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitProduce2 = input.nextInt();
                    if (exitProduce2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (produce == 3) {
                    System.out.print("How many packet of sweet potatoes do you want to buy? : ");
                    int potatoes = input.nextInt();
                    potatoCount += potatoes;
                    totalPrice += 7.30 * potatoes;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitProduce3 = input.nextInt();
                    if (exitProduce3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
            }

            else if (product3 == 11) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\t\t\t\t\t ");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "PRODUCT", "PRICE");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Iced Lemon Tea", "RM 4.50");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Orange Juice", "RM 11.70");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Soft Drinks", "RM 5.20");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
                int drinks = input.nextInt();
                if (drinks == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }

                else if (drinks == 1) {
                    System.out.print("How many packet of iced lemon tea do you want to buy? : ");
                    int tea = input.nextInt();
                    lemonTeaCount += tea;
                    totalPrice += 4.50 * tea;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitDrinks1 = input.nextInt();
                    if (exitDrinks1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (drinks == 2) {
                    System.out.print("How many packet of orange juice do you want to buy? : ");
                    int juice = input.nextInt();
                    juiceCount += juice;
                    totalPrice += 11.70 * juice;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitDrinks2 = input.nextInt();
                    if (exitDrinks2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (drinks == 3) {
                    System.out.print("How many bottle of soft drinks do you want to buy? : ");
                    int softDrinks = input.nextInt();
                    softDrinkCount += softDrinks;
                    totalPrice += 5.20 * softDrinks;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitDrinks3 = input.nextInt();
                    if (exitDrinks3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
            }

            else {
                System.out.print("Invalid input! Enter any number to return to main menu : ");
                int errorGroceries = input.nextInt();
                if (errorGroceries != -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }
            }

        }

        else if (menuChoice == 4) {
            System.out.println(
                    "\n\n*************************************************************************************************************************************************");
            System.out.println("\t\t\t\t\t\t\t\tENTERTAINMENT SECTION");
            System.out.println("\t\t\t\t(below are the entertainment centres available)");
            System.out.println("\t\t\t\t\t1. Cinema");
            System.out.println("\t\t\t\t\t2. Bowling Alleys");
            System.out.println("\t\t\t\t\t3. Arcades");
            System.out.println(
                    "\n*************************************************************************************************************************************************");
            System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
            int entertainment = input.nextInt();
            if (entertainment == -1) {
                menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount, kidsShoeCount,
                        menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount, signatureCount,
                        iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount, americanoCount,
                        breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount, riceCount,
                        pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount, kelloggCount,
                        soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount,
                        cheeseCount, crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                        lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount, adultCount,
                        memberCount, studentCount, bowlShoesCount, socksCount, haloCount, tekkenCount, midnightCount,
                        avengersCount);
            }

            else if (entertainment == 1) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\tbelow are the movies available");
                System.out.printf("\t\t\t\t\t%-30s%-20s%-20s%-20s\n", "TITLE", "GENRE", "DURATION", "TICKET PRICE");
                System.out.printf("\t\t\t\t\t%-30s%-20s%-20s%-20s\n", "1. Godzilla vs. Kong", "Sci-fi/Action", "1h 53m",
                        "RM 15.90");
                System.out.printf("\t\t\t\t\t%-30s%-20s%-20s%-20s\n", "2. Raya and the Last Dragon", "Family/Fantasy", "1h 57m",
                        "RM 11.90");
                System.out.printf("\t\t\t\t\t%-30s%-20s%-20s%-20s\n", "3. Mortal Kombat", "Fantasy/Action", "1h 50m", "RM 14.90");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
                int cinema = input.nextInt();
                if (cinema == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }

                else if (cinema == 1) {
                    System.out.print("How many people are going to watch Godzilla vs. Kong? : ");
                    int godzillaKong = input.nextInt();
                    godzillaCount += godzillaKong;
                    totalPrice += 15.90 * godzillaKong;
                    System.out.println("Your ticket purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitCinema1 = input.nextInt();
                    if (exitCinema1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (cinema == 2) {
                    System.out.print("How many many people are going to watch Raya and the Last Dragon? : ");
                    int rayaDragon = input.nextInt();
                    rayaCount += rayaDragon;
                    totalPrice += 11.90 * rayaDragon;
                    System.out.println("Your ticket purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitCinema2 = input.nextInt();
                    if (exitCinema2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (cinema == 3) {
                    System.out.print("How many people are going to watch Mortal Kombat? : ");
                    int mortalKombat = input.nextInt();
                    mortalCount += mortalKombat;
                    totalPrice += 14.90 * mortalKombat;
                    System.out.println("Your ticket purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitCinema3 = input.nextInt();
                    if (exitCinema3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }
            }

            else if (entertainment == 2) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\tBOWLING RATE (PER GAME)");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "TYPE", "PRICE");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Adult", "RM 8.00");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Member", "RM 6.00");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Student", "RM 5.00");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "4. Shoes Rental (Per Pair)", "RM 2.50");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "5. Socks (Per Pair)", "RM 4.00");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
                int bowling = input.nextInt();
                if (bowling == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }

                else if (bowling == 1) {
                    System.out.print("How many games do you (adult) wish to play? : ");
                    int adult = input.nextInt();
                    adultCount += adult;
                    totalPrice += 8.00 * adult;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitBowling1 = input.nextInt();
                    if (exitBowling1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (bowling == 2) {
                    System.out.print("How many games do you (member) wish to play? : ");
                    int member = input.nextInt();
                    memberCount += member;
                    totalPrice += 6.00 * member;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitBowling2 = input.nextInt();
                    if (exitBowling2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (bowling == 3) {
                    System.out.print("How many games do you (student) wish to play? : ");
                    int student = input.nextInt();
                    studentCount += student;
                    totalPrice += 5.00 * student;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitBowling3 = input.nextInt();
                    if (exitBowling3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (bowling == 4) {
                    System.out.print("How many pair of shoes do you want to rent? : ");
                    int bowlShoes = input.nextInt();
                    bowlShoesCount += bowlShoes;
                    totalPrice += 2.50 * bowlShoes;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitBowling4 = input.nextInt();
                    if (exitBowling4 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (bowling == 5) {
                    System.out.print("How many pair of socks do want to buy? : ");
                    int socks = input.nextInt();
                    socksCount += socks;
                    totalPrice += 4.00 * socks;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitBowling5 = input.nextInt();
                    if (exitBowling5 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

            }

            else if (entertainment == 3) {
                System.out.println(
                        "\n\n*************************************************************************************************************************************************");
                System.out.println("\t\t\t\tGames available (2 tokens = RM 1) ");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "GAME", "TOKEN");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "1. Halo Firestorm Raven", "8 tokens");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "2. Tekken 7", "4 tokens");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "3. Midnight Maximum Tune 5", "6 tokens");
                System.out.printf("\t\t\t\t\t%-50s%-20s\n", "4. Avengers: Infinity Quest", "2 tokens");
                System.out.println(
                        "\n*************************************************************************************************************************************************");
                System.out.print("Enter your choice (number) or enter -1 to return to menu : ");
                int arcades = input.nextInt();
                if (arcades == -1) {
                    menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                            kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount,
                            signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount,
                            americanoCount, breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount,
                            riceCount, pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount,
                            kelloggCount, soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount,
                            milkCount, eggsCount, cheeseCount, crackerCount, peanutCount, chipsCount, appleCount,
                            orangeCount, potatoCount, lemonTeaCount, juiceCount, softDrinkCount, godzillaCount,
                            rayaCount, mortalCount, adultCount, memberCount, studentCount, bowlShoesCount, socksCount,
                            haloCount, tekkenCount, midnightCount, avengersCount);
                }

                else if (arcades == 1) {
                    System.out.print("How many games do you wish to play? : ");
                    int halo = input.nextInt();
                    haloCount += halo;
                    totalPrice += 4.00 * halo;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitArcades1 = input.nextInt();
                    if (exitArcades1 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (arcades == 2) {
                    System.out.print("How many games do you wish to play? : ");
                    int tekken = input.nextInt();
                    tekkenCount += tekken;
                    totalPrice += 2.00 * tekken;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitArcades2 = input.nextInt();
                    if (exitArcades2 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (arcades == 3) {
                    System.out.print("How many games do you wish to play? : ");
                    int midnight = input.nextInt();
                    midnightCount += midnight;
                    totalPrice += 3.00 * midnight;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitArcades3 = input.nextInt();
                    if (exitArcades3 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

                else if (arcades == 4) {
                    System.out.print("How many games do you wish to play? : ");
                    int avengers = input.nextInt();
                    avengersCount += avengers;
                    totalPrice += 1.00 * avengers;
                    System.out.println("Your purchase is successful!");
                    System.out.print("Enter any number to return to main menu : ");
                    int exitArcades4 = input.nextInt();
                    if (exitArcades4 != -1) {
                        menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount,
                                kidsShoeCount, menWatchCount, womenWatchCount, handbagCount, snackPlateCount,
                                zingerCount, signatureCount, iceCreamCount, cakeCount, bananaCount, milkTeaCount,
                                strawPuddingCount, americanoCount, breadCount, muffinCount, doughnutCount, chickenCount,
                                meatCount, fishCount, riceCount, pastaCount, meeCount, oilCount, chiliCount,
                                mustardCount, kokoCount, honeyCount, kelloggCount, soupCount, beanCount, tunaCount,
                                broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount, cheeseCount,
                                crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                                lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount,
                                adultCount, memberCount, studentCount, bowlShoesCount, socksCount, haloCount,
                                tekkenCount, midnightCount, avengersCount);
                    }
                }

            }
        }

        else if (menuChoice == 5) {
            System.out.println(
                    "\n\t\t\t**********************************************************************************");
            System.out.println("\t\t\t\t\t\t\t\t RECEIPT");
            System.out.println(
                    "\n\t\t\t**********************************************************************************");
            System.out.printf("\t\t\t%-50s%-20s%-20s\n", "ITEM", "QUANTITY", "PRICE");
            if (sweatshirtCount > 0 || hoodieCount > 0 || blouseCount > 0 || menShoeCount > 0 || womenShoeCount > 0
                    || kidsShoeCount > 0 || menWatchCount > 0 || womenWatchCount > 0 || handbagCount > 0) {
                System.out.println(
                        "\n\t\t\t..................................................................................");
                System.out.println("\t\t\tFASHION");
                System.out.println(
                        "\n\t\t\t..................................................................................");
                if (sweatshirtCount > 0) {
                    double sweatshirtPrice = sweatshirtCount * 59.90;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Sweatshirt", sweatshirtCount,
                            (int) (sweatshirtPrice * 100) / 100.0);
                }

                if (hoodieCount > 0) {
                    double hoodiePrice = hoodieCount * 70.0;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Men's Hoodie", hoodieCount,
                            (int) (hoodiePrice * 100) / 100.0);
                }

                if (blouseCount > 0) {
                    double blousePrice = blouseCount * 65.90;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Women's Blouse", blouseCount,
                            (int) (blousePrice * 100) / 100.0);
                }

                if (menShoeCount > 0) {
                    double menShoePrice = menShoeCount * 159.90;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Men's Shoe", menShoeCount,
                            (int) (menShoePrice * 100) / 100.0);
                }

                if (womenShoeCount > 0) {
                    double womenShoePrice = womenShoeCount * 129.90;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Women's Shoe", womenShoeCount,
                            (int) (womenShoePrice * 100) / 100.0);
                }

                if (kidsShoeCount > 0) {
                    double kidsShoePrice = kidsShoeCount * 95.50;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Kids' Shoe", kidsShoeCount,
                            (int) (kidsShoePrice * 100) / 100.0);
                }

                if (menWatchCount > 0) {
                    double menWatchPrice = menWatchCount * 499.00;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Men's Watch", menWatchCount,
                            (int) (menWatchPrice * 100) / 100.0);
                }

                if (womenWatchCount > 0) {
                    double womenWatchPrice = womenWatchCount * 449.90;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Women's Watch", womenWatchCount,
                            (int) (womenWatchPrice * 100) / 100.0);
                }

                if (handbagCount > 0) {
                    double handbagPrice = handbagCount * 600.00;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Women's Handbag", handbagCount,
                            (int) (handbagPrice * 100) / 100.0);
                }
            }

            if (snackPlateCount > 0 || zingerCount > 0 || signatureCount > 0 || iceCreamCount > 0 || cakeCount > 0
                    || bananaCount > 0 || milkTeaCount > 0 || strawPuddingCount > 0 || americanoCount > 0) {
                System.out.println(
                        "\n\t\t\t..................................................................................");
                System.out.println("\t\t\tFOOD AND BEVERAGES");
                System.out.println(
                        "\n\t\t\t..................................................................................");
                if (snackPlateCount > 0) {
                    double snackPlatePrice = snackPlateCount * 16.90;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Snack Plate", snackPlateCount,
                            (int) (snackPlatePrice * 100) / 100.0);
                }

                if (zingerCount > 0) {
                    double zingerPrice = zingerCount * 15.5;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Zinger Combo", zingerCount,
                            (int) (zingerPrice * 100) / 100.0);
                }

                if (signatureCount > 0) {
                    double signaturePrice = signatureCount * 19.90;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Signature Box", signatureCount,
                            (int) (signaturePrice * 100) / 100.0);
                }

                if (iceCreamCount > 0) {
                    double iceCreamPrice = iceCreamCount * 11.0;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Single-scoop Ice Cream", iceCreamCount,
                            (int) (iceCreamPrice * 100) / 100.0);
                }

                if (cakeCount > 0) {
                    double cakePrice = cakeCount * 155.0;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Rainbow Tuxedo Cake", cakeCount,
                            (int) (cakePrice * 100) / 100.0);
                }

                if (bananaCount > 0) {
                    double bananaPrice = bananaCount * 28.50;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Banana Split", bananaCount,
                            (int) (bananaPrice * 100) / 100.0);
                }

                if (milkTeaCount > 0) {
                    double milkTeaPrice = milkTeaCount * 7.50;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Signature Brown Sugar Pearl Milk Tea", milkTeaCount,
                            (int) (milkTeaPrice * 100) / 100.0);
                }

                if (strawPuddingCount > 0) {
                    double strawPuddingPrice = strawPuddingCount * 8.50;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Strawberry Pudding", strawPuddingCount,
                            (int) (strawPuddingPrice * 100) / 100.0);
                }

                if (americanoCount > 0) {
                    double americanoPrice = americanoCount * 7.50;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Americano", americanoCount,
                            (int) (americanoPrice * 100) / 100.0);
                }
            }

            if (breadCount > 0 || muffinCount > 0 || doughnutCount > 0 || chickenCount > 0 || meatCount > 0
                    || fishCount > 0 || riceCount > 0 || pastaCount > 0 || meeCount > 0 || oilCount > 0
                    || chiliCount > 0 || mustardCount > 0 || kokoCount > 0 || honeyCount > 0 || kelloggCount > 0
                    || soupCount > 0 || beanCount > 0 || tunaCount > 0 || broccoliCount > 0 || shrimpCount > 0
                    || carrotCount > 0 || milkCount > 0 || eggsCount > 0 || cheeseCount > 0 || crackerCount > 0
                    || peanutCount > 0 || chipsCount > 0 || appleCount > 0 || orangeCount > 0 || potatoCount > 0
                    || lemonTeaCount > 0 || juiceCount > 0 || softDrinkCount > 0) {
                System.out.println(
                        "\n\t\t\t..................................................................................");
                System.out.println("\t\t\tGROCERIES");
                System.out.println(
                        "\n\t\t\t..................................................................................");
                if (breadCount > 0) {
                    double breadPrice = breadCount * 4.50;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Whole wheat Bread", breadCount,
                            (int) (breadPrice * 100) / 100.0);
                }

                if (muffinCount > 0) {
                    double muffinPrice = muffinCount * 2.50;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Muffins", muffinCount,
                            (int) (muffinPrice * 100) / 100.0);
                }

                if (doughnutCount > 0) {
                    double doughnutPrice = doughnutCount * 7.90;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Donuts (6 per pack)", doughnutCount,
                            (int) (doughnutPrice * 100) / 100.0);
                }

                if (chickenCount > 0) {
                    double chickenPrice = chickenCount * 6.90;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Chicken", chickenCount,
                            (int) (chickenPrice * 100) / 100.0);
                }

                if (meatCount > 0) {
                    double meatPrice = meatCount * 10.0;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Meat", meatCount, (int) (meatPrice * 100) / 100.0);
                }

                if (fishCount > 0) {
                    double fishPrice = fishCount * 12.0;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Fish", fishCount, (int) (fishPrice * 100) / 100.0);
                }

                if (riceCount > 0) {
                    double ricePrice = riceCount * 13.5;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Rice", riceCount, (int) (ricePrice * 100) / 100.0);
                }

                if (pastaCount > 0) {
                    double pastaPrice = pastaCount * 4.00;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Pasta", pastaCount, (int) (pastaPrice * 100) / 100.0);
                }

                if (meeCount > 0) {
                    double meePrice = meeCount * 3.00;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Mee", meeCount, (int) (meePrice * 100) / 100.0);
                }

                if (oilCount > 0) {
                    double oilPrice = oilCount * 30.00;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Cooking Oil", oilCount,
                            (int) (oilPrice * 100) / 100.0);
                }

                if (chiliCount > 0) {
                    double chiliPrice = chiliCount * 20.00;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Chilli Sauce", chiliCount,
                            (int) (chiliPrice * 100) / 100.0);
                }

                if (mustardCount > 0) {
                    double mustardPrice = mustardCount * 14.30;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Mustard", mustardCount,
                            (int) (mustardPrice * 100) / 100.0);
                }

                if (kokoCount > 0) {
                    double kokoPrice = kokoCount * 10.50;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Koko Crunch", kokoCount,
                            (int) (kokoPrice * 100) / 100.0);
                }

                if (honeyCount > 0) {
                    double honeyPrice = honeyCount * 13.20;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Honey Stars", honeyCount,
                            (int) (honeyPrice * 100) / 100.0);
                }

                if (kelloggCount > 0) {
                    double kelloggPrice = kelloggCount * 10.50;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Kellogg's Froot Loops", kelloggCount,
                            (int) (kelloggPrice * 100) / 100.0);
                }

                if (soupCount > 0) {
                    double soupPrice = soupCount * 20.90;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Condensed Soup", soupCount,
                            (int) (soupPrice * 100) / 100.0);
                }

                if (beanCount > 0) {
                    double beanPrice = beanCount * 4.00;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Canned Beans", beanCount,
                            (int) (beanPrice * 100) / 100.0);
                }

                if (tunaCount > 0) {
                    double tunaPrice = tunaCount * 6.90;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Canned Tuna", tunaCount,
                            (int) (tunaPrice * 100) / 100.0);
                }

                if (broccoliCount > 0) {
                    double broccoliPrice = broccoliCount * 7.50;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Broccoli", broccoliCount,
                            (int) (broccoliPrice * 100) / 100.0);
                }

                if (shrimpCount > 0) {
                    double shrimpPrice = shrimpCount * 10.50;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Frozen Shrimp", shrimpCount,
                            (int) (shrimpPrice * 100) / 100.0);
                }

                if (carrotCount > 0) {
                    double carrotPrice = carrotCount * 8.20;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Carrots", carrotCount,
                            (int) (carrotPrice * 100) / 100.0);
                }

                if (milkCount > 0) {
                    double milkPrice = milkCount * 7.90;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Milk", milkCount, (int) (milkPrice * 100) / 100.0);
                }

                if (eggsCount > 0) {
                    double eggsPrice = eggsCount * 12.00;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Fresh Eggs Grade A", eggsCount,
                            (int) (eggsPrice * 100) / 100.0);
                }

                if (cheeseCount > 0) {
                    double cheesePrice = cheeseCount * 8.00;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Cheese", cheeseCount,
                            (int) (cheesePrice * 100) / 100.0);
                }

                if (crackerCount > 0) {
                    double crackerPrice = crackerCount * 10.50;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Whole-grain Crackers", crackerCount,
                            (int) (crackerPrice * 100) / 100.0);
                }

                if (peanutCount > 0) {
                    double peanutPrice = peanutCount * 11.40;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Peanut Butter", peanutCount,
                            (int) (peanutPrice * 100) / 100.0);
                }

                if (chipsCount > 0) {
                    double chipsPrice = chipsCount * 5.40;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Potato Chips", chipsCount,
                            (int) (chipsPrice * 100) / 100.0);
                }

                if (appleCount > 0) {
                    double applePrice = appleCount * 13.50;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Apple", appleCount, (int) (applePrice * 100) / 100.0);
                }

                if (orangeCount > 0) {
                    double orangePrice = orangeCount * 10.00;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Orange", orangeCount,
                            (int) (orangePrice * 100) / 100.0);
                }

                if (potatoCount > 0) {
                    double potatoPrice = potatoCount * 7.30;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Sweet Potatoes", potatoCount,
                            (int) (potatoPrice * 100) / 100.0);
                }

                if (lemonTeaCount > 0) {
                    double lemonTeaPrice = lemonTeaCount * 4.50;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Iced Lemon Tea", lemonTeaCount,
                            (int) (lemonTeaPrice * 100) / 100.0);
                }

                if (juiceCount > 0) {
                    double juicePrice = juiceCount * 11.70;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Orange Juice", juiceCount,
                            (int) (juicePrice * 100) / 100.0);
                }

                if (softDrinkCount > 0) {
                    double softDrinkPrice = softDrinkCount * 5.20;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Soft Drink", softDrinkCount,
                            (int) (softDrinkPrice * 100) / 100.0);
                }
            }

            if (godzillaCount > 0 || rayaCount > 0 || mortalCount > 0 || adultCount > 0 || memberCount > 0
                    || studentCount > 0 || bowlShoesCount > 0 || socksCount > 0 || haloCount > 0 || tekkenCount > 0
                    || midnightCount > 0 || avengersCount > 0) {
                System.out.println(
                        "\n\t\t\t..................................................................................");
                System.out.println("\t\t\tENTERTAINMENT");
                System.out.println(
                        "\n\t\t\t..................................................................................");
                if (godzillaCount > 0) {
                    double godzillaPrice = godzillaCount * 15.90;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Godzilla vs Kong ticket", godzillaCount,
                            (int) (godzillaPrice * 100) / 100.0);
                }

                if (rayaCount > 0) {
                    double rayaPrice = rayaCount * 11.90;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Raya and The Last Dragon ticket", rayaCount,
                            (int) (rayaPrice * 100) / 100.0);
                }

                if (mortalCount > 0) {
                    double mortalPrice = mortalCount * 14.90;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Mortal Kombat ticket", mortalCount,
                            (int) (mortalPrice * 100) / 100.0);
                }

                if (adultCount > 0) {
                    double adultPrice = adultCount * 8.0;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Bowling - Adult", adultCount,
                            (int) (adultPrice * 100) / 100.0);
                }

                if (memberCount > 0) {
                    double memberPrice = memberCount * 6.0;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Bowling - Member", memberCount,
                            (int) (memberPrice * 100) / 100.0);
                }

                if (studentCount > 0) {
                    double studentPrice = studentCount * 5.00;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Bowling - Student", studentCount,
                            (int) (studentPrice * 100) / 100.0);
                }

                if (bowlShoesCount > 0) {
                    double bowlShoesPrice = bowlShoesCount * 2.50;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Bowling - Shoe Rental", bowlShoesCount,
                            (int) (bowlShoesPrice * 100) / 100.0);
                }

                if (socksCount > 0) {
                    double socksPrice = socksCount * 4.00;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Bowling - Socks", socksCount,
                            (int) (socksPrice * 100) / 100.0);
                }

                if (haloCount > 0) {
                    double haloPrice = haloCount * 4.00;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Arcade - Halo Firestorm Raven ", haloCount,
                            (int) (haloPrice * 100) / 100.0);
                }

                if (tekkenCount > 0) {
                    double tekkenPrice = tekkenCount * 2.00;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Arcade - Tekken 7 ", tekkenCount,
                            (int) (tekkenPrice * 100) / 100.0);
                }

                if (midnightCount > 0) {
                    double midnightPrice = midnightCount * 3.00;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Arcade - Midnight Maximum Tune 5 ", midnightCount,
                            (int) (midnightPrice * 100) / 100.0);
                }

                if (avengersCount > 0) {
                    double avengersPrice = avengersCount * 1.00;
                    System.out.printf("\t\t\t%-50s%-20s%-20s\n", "Arcade - Avengers Infinity Quest ", avengersCount,
                            (int) (avengersPrice * 100) / 100.0);
                }
            }

            System.out.printf("\n\n\t\t\t%-50s%-20s%-20s\n", "TOTAL PRICE", "",
                    "RM " + (int) (totalPrice * 100) / 100.0);
        }

        else {
            System.out.print("Invalid input! Enter any number to return to main menu : ");
            int errorEntertainment = input.nextInt();
            if (errorEntertainment != -1) {
                menu(totalPrice, sweatshirtCount, hoodieCount, blouseCount, menShoeCount, womenShoeCount, kidsShoeCount,
                        menWatchCount, womenWatchCount, handbagCount, snackPlateCount, zingerCount, signatureCount,
                        iceCreamCount, cakeCount, bananaCount, milkTeaCount, strawPuddingCount, americanoCount,
                        breadCount, muffinCount, doughnutCount, chickenCount, meatCount, fishCount, riceCount,
                        pastaCount, meeCount, oilCount, chiliCount, mustardCount, kokoCount, honeyCount, kelloggCount,
                        soupCount, beanCount, tunaCount, broccoliCount, shrimpCount, carrotCount, milkCount, eggsCount,
                        cheeseCount, crackerCount, peanutCount, chipsCount, appleCount, orangeCount, potatoCount,
                        lemonTeaCount, juiceCount, softDrinkCount, godzillaCount, rayaCount, mortalCount, adultCount,
                        memberCount, studentCount, bowlShoesCount, socksCount, haloCount, tekkenCount, midnightCount,
                        avengersCount);
            }
        }
    }
}
