package A1_Practice;
import java.util.*;
public class ReplWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int itemtPrice;
        int maxPrice = 100; //one dollar
        int lowestPrice = 25; //25 cents
        //greet moses dee
        System.out.println("Welcome to the Moses Vending Machine.");

        //Get cost of the item
        System.out.print("Enter price of item (from 25 cents to a dollar, only in 5 cent increments: ");
        itemtPrice = scanner.nextInt();

        while ((itemtPrice > maxPrice) || (itemtPrice < lowestPrice) || ((itemtPrice % 5) != 0)) {

            System.out.println("Invalid Price!");
            System.out.print(" Please enter price of item (from 25 cents to a dollar, only in 5 cent increments: ");
            itemtPrice = scanner.nextInt();

        }

        //Determine how much change
        int changeInQuarters = ((maxPrice - itemtPrice) / 25);
        int changeInDimes = ((maxPrice - itemtPrice - (changeInQuarters * 25)) / 10);
        int changeInNickles = ((maxPrice - itemtPrice - (changeInQuarters * 25) - (changeInDimes * 10)) / 5);
        //int changeInPennies = ((maxPrice - itemtPrice - (changeInQuarters * 25) - (changeInDimes * 10)) % 5);

        System.out.println("Moses bought an item for " + itemtPrice + " and gave vending machinge a dollar.\n"
                + "Moses your change is:\n"
                + changeInQuarters + " Quarters\n"
                + changeInDimes + " Dimes\n"
                + changeInNickles + " Nickels\n");

    }
}

/*

 */
/*

 */