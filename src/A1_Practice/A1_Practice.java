package A1_Practice; import javax.swing.*;
import java.util.*; public class A1_Practice
{ public static void main(String[] args) {Scanner scan = new Scanner(System.in);
    // above stays all the time //


    int maxPrice = 100; //one dollar
    int minPrice = 25; //25 cents
    boolean err = false; //iniialize error to be false
    int itemPrice = 0; //initialize price to be zero

    //Greeting user
    JOptionPane.showMessageDialog(null, "Welcome to the Moses Vending Machine.");

    //Get item price
    String userInput = JOptionPane.showInputDialog(null, "Enter price of item (from 25 cents to a dollar, in 5 cent increments");

    //checks when "X" or "Cancel" is clicked
    if (userInput == null) {

        System.exit(0); //exits program
    }

    //test for non-integer error
    try {

        itemPrice = Integer.parseInt(userInput);//covert string number to integer

    } catch (NumberFormatException e) {

        err = true;//error is set true once it is a non-integer
    }

    //loop for when no valid input is entered
    while ((userInput.isEmpty()) || (err != false) || (itemPrice > maxPrice) || (itemPrice < minPrice) || ((itemPrice % 5) != 0)) {

        //Invalid price
        JOptionPane.showMessageDialog(null, "Invalid Price!", "ERROR", JOptionPane.ERROR_MESSAGE);

        //Get item price
        userInput = JOptionPane.showInputDialog(null, "Enter price of item (from 25 cents to a dollar, in 5 cent increments");

        //checks when "X" or "Cancel" is clicked
        if (userInput == null) {

            System.exit(0);//exits program
        }

        //test for string error
        try {

            itemPrice = Integer.parseInt(userInput);//covert string number to integer
            err = false;// error is set false once it is an integer value

        } catch (NumberFormatException e) {

            err = true; //error is set true once it is a non-integer
        }
    }

    //Determine change
    int quarters = ((maxPrice - itemPrice) / 25);
    int dimes = ((maxPrice - itemPrice - (quarters * 25)) / 10);
    int nickles = ((maxPrice - itemPrice - (quarters * 25) - (dimes * 10)) / 5);

    //Display results to user
    JOptionPane.showMessageDialog(null, "You bought an item for " + itemPrice + " and inserted a dollar.\n"
            + "So your change is:\n"
            + quarters + " Quarters\n"
            + dimes + " Dimes\n"
            + nickles + " Nickels");



    }
}
