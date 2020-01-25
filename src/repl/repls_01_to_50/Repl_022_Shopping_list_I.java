package repl.repls_01_to_50;

import java.util.Scanner;

public class Repl_022_Shopping_list_I {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String item1;
        String item2;
        String item3;
        String report;

        double price1;
        double price2;
        double price3;
        double totalPrice;

        System.out.println("Enter Item1 and its price:");
        item1 = scan.next();
        price1 = scan.nextDouble();
        System.out.println("Enter Item2 and its price:");
        item2 = scan.next();
        price2 = scan.nextDouble();
        System.out.println("Enter Item3 and its price:");
        item3 = scan.next();
        price3 = scan.nextDouble();

        totalPrice = price1 + price2 + price3;

        report = "Item1: "+item1 +" Price: " +price1 +", "+"Item2: " +item2 + " Price: "+price2 + ", "+"Item3: "
                +item3 +" Price: " +price3 +"\nTotal price: " +totalPrice;



        System.out.println(report);

    }
}
/*
022. Shopping list I
Instructions from your teacher:

In this assignment you will write a program to create a shopping list and prices.

You will use Scanner object and ask user to enter 3 items followed by its price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Create a Scanner object named scan.

Execution flow with example:

-Display prompt "Enter Item1 and its price:"
Tomatoes
5.5

-Display prompt "Enter Item2 and its price:"
Cheese
3.5

-Display prompt "Enter Item3 and its price:"
Apples
6.3

-calculate totalPrice for all items

-build the report variable by concatenating Strings and double values:

"Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3"
"Total price: 15.3"

- Print the value of report variable
 */