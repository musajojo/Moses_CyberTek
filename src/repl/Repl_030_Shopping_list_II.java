package repl;
import java.util.*;
public class Repl_030_Shopping_list_II {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;
        int count1, count2, count3;

        System.out.println("Enter Item1, count and its price:");
        item1 = scan.next();
        count1 = scan.nextInt();
        price1 = scan.nextDouble()*count1;

        System.out.println("Enter Item2, count and its price:");
        item2 = scan.next();
        count2 = scan.nextInt();
        price2 = scan.nextDouble()*count2;

        System.out.println("Enter Item3, count and its price:");
        item3 = scan.next();
        count3 = scan.nextInt();
        price3 = scan.nextDouble()*count3;

        report = ("Item1: "+item1+" Price: "+price1+", "+
                "Item2: "+item2+" Price: "+price2+", "+
                "Item3: "+item3+" Price: "+price3+", ");
        if (price2==0){
            report="Item1: "+item1+" Price: "+price1+", "+
                    "Item3: "+item3+" Price: "+price3;
        }else if (price3==0){
            report="Item1: "+item1+" Price: "+price1+", "+
                    "Item2: "+item2+" Price: "+price2;
        }
        System.out.println(report);

        totalPrice = price1+price2+price3;

        System.out.println("Total price: " + totalPrice);
    }
}

/*
030. Shopping list II
Instructions from your teacher:

In this assignment you will write a program to create a shopping list, count and prices.

Please read carefully!
If you do not fully understand the requirement ask your classmates in Slack or ask your instructor!

You will use Scanner object and ask user to enter 3 items followed by its count,
price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Declare int variables count1, count2, count3

-Create a Scanner object named scan.

Execution flow using with example:

Use scanner to read all 3 values.

-Display prompt "Enter Item1, count and its price:"
Tomatoes
2
5.4
Explanation: (Item1 is "Tomatoes", count is 2, price is 5.4)


-Display prompt "Enter Item2, count and its price:"
Cheese
0
3.5
Explanation: (Item2 is "Cheese", count is 0, price is 3.5)


-Display prompt "Enter Item3, count and its price:"
Apples
5
6.3
Explanation: (Item3 is "Apples", count is 5, price is 6.3)


-calculate totalPrice for all items only if the item's count is more than 0!
- Hint :
  The unit test assumes that item1 count is always more than 0
  The only situations you need to handle are either item2 count is 0 or item3 count is 0.
  Think simple and just handle the only item2 is 0 or  only item3 is 0 branches

-build the report variable by concatenating Strings and double price values:
-do not include items that have count 0, use if statement !
-Calculate total price for the item and concatenate like below

"Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
Explanation: (Item2 "Cheese" is not included since its count is 0)

- Print the value of report variable

- Print total Price:
"Total price: 42.3"
 */
/*
public class Main {
  public static void main(String[] args) {
    //WRITE YOUR CODE HERE:
  }
}
 */