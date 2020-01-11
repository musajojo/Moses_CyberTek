package A1_Practice;
import javax.swing.*;
import java.util.*;
public class OtherPractice {
    public static void main(String[] args) {
        int maxPrice = 100; //one dollar
        int minPrice = 25; //25 cents

        //Greeting user
        JOptionPane.showMessageDialog(null, "Welcome to the Moses Vending Machine.");

        //Get item price
        String userInput = JOptionPane.showInputDialog(null, "Enter price of item (from 25 cents to a dollar, in 5 cent increments");

        while ((userInput.isEmpty())) {
            //Invalid price
            JOptionPane.showMessageDialog(null, "Invalid Price!", "ERROR", JOptionPane.ERROR_MESSAGE);
            //Get item price
            userInput = JOptionPane.showInputDialog(null, "Enter price of item (from 25 cents to a dollar, in 5 cent increments");
        }

        int itemPrice = Integer.parseInt(userInput); //parse to an integer

        while ((itemPrice == 0) || (itemPrice > maxPrice) || (itemPrice < minPrice) || ((itemPrice % 5) != 0)) {
            //Invalid price
            JOptionPane.showMessageDialog(null, "Invalid Price!", "ERROR", JOptionPane.ERROR_MESSAGE);
            //Get item price
            userInput = JOptionPane.showInputDialog(null, "Enter price of item (from 25 cents to a dollar, in 5 cent increments");
            itemPrice = Integer.parseInt(userInput); //parse to an integer
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
