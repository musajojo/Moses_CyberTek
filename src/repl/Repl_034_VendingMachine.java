package repl;
import java.util.*;

import static java.lang.System.exit;

public class Repl_034_VendingMachine {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

    int itemPrice;
    int quarters, dimes, nickels;
    int dollar = 100;
    int change;
        System.out.println("Enter price in cents:");

    itemPrice = scan.nextInt();

        if (itemPrice < 25 || itemPrice > 100 || itemPrice % 5 != 0) {
            System.out.println("Invalid price!");
            return;
            //System.exit(0); Better way to stop program after
        }
        change = dollar-itemPrice;

        quarters = change/25;
        change = change%25;

        dimes = change/10;
        change = change%10;

        nickels = change/5;
        change = change%5;

        System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");
    }
}
/*
034. VendingMachine

Instructions from your teacher:

Enter*price*in*cents:95
Your*change*is*0*quarters,*0*dimes,*and*1*nickels.

Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.

- int variable itemPrice
- int variables quarters, dimes, nickels
- Scanner object

The program accepts itemPrice, which is a price for the item you would like to purchase.

Positive behavior:

Please follow the example in the image. dots mean empty space.
-Since the item price was entered 95, change is 1 nickel

Negative behavior:

If itemPrice is less than 25 or more than 100 cents, then display an error message:
Invalid price!

If itemPrice is not divisible by 5, then also display an error message:
Invalid price!

use (itemPrice % 5 == 0) expression to find it is divisible by 5.

Do not display anything else.

 */
/*
import java.util.*;
public class Main {
  public static void main(String[] args) {
    //ENTER CODE HERE
  }
}
 */
/* Change Calculator - The Web
        double quarters = 10*total/25;
        double dimes = 10*(total%25)/1025;
        double nickels = 10*((total%)%10)/5;
        double pennies = 10*(((total%25)%10)%5)/1
 */
/*    Scanner scan = new Scanner (System.in);

    int itemPrice;
    // int itemPrice = 91;

        int quarters, dimes, nickels;
    int dollar = 100;
    int change;
        System.out.println("Enter price in cents:");

        //System.out.println(itemPrice); // this will be deleted for below scan
    itemPrice = scan.nextInt();

        change = dollar-itemPrice;
        System.out.println("Change: "+change);
        quarters = change/25;
        change = change%25;

        dimes = change/10;
        change = change%10;

        nickels = change/5;
        change = change%5;

        if (itemPrice < 25 || itemPrice > 100 || itemPrice % 5 != 0) {
            System.out.println("Invalid price!");
            return;
        }
        System.out.println("Your change is "+quarters+" quarter "+dimes+" dimes, and "+nickels+" nickels");
    }
} */