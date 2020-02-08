package onlineCaveOfProgramming;

import java.util.Scanner;

public class Cave_11_Getting_User_Input_Scanner {
    public static void main(String[] args) {
        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Output the prompt
        System.out.println("Enter a line of text: ");

        // Wait for the user to enter a line of text
        String line = input.nextLine();

        // Tell them what they entered.
        System.out.println("You entered: " + line);

        // Output the prompt
        System.out.println("Enter an integer: ");

        // Wait for the user to enter something.
        int valueInt = input.nextInt();

        // Tell them what they entered.
        System.out.println("You entered: " + valueInt);

        // Output the prompt
        System.out.println("Enter a Double: ");

        // Wait for the user to enter something.
        double valueDouble = input.nextDouble();

        // Tell them what they entered.
        System.out.println("You entered: " + valueDouble);







    }
}
