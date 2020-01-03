package repl;
import java.util.*;
public class Repl_034_VendingMachine {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int itemPrice;
    int quarters, dimes, nickels;

        System.out.println("Enter price in cents:");
    itemPrice = scan.nextInt();


    /* Change Calculator
        double quarters = 10*total/25;
        double dimes = 10*(total%25)/1025;
        double nickels = 10*((total%)%10)/5;
        double pennies = 10*(((total%25)%10)%5)/1
     */

        if (itemPrice < 25 || itemPrice > 100){
            System.out.println("Invalid price!");
        }else if (itemPrice % 5 == 0){
            System.out.println("Invalid price!");
        }




    }
}
/*
034. VendingMachine

Instructions from your teacher:

Enter*price*in*cents:95
Your*change*is*0*quarter,*0*dimes,*and*1*nickels.

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