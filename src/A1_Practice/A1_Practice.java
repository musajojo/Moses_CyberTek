package A1_Practice;

import javax.swing.*;
import java.util.*;

public class A1_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // above stays all the time //

        double balance = 1000.75;
        double amountToWithdraw = 250;
        double updatedBalance = balance - amountToWithdraw;
        double amountForEachFriend = updatedBalance / 3;
        boolean canPurchaseTicket = amountForEachFriend == amountForEachFriend;
        System.out.println(canPurchaseTicket);



    }
}
/*
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();

		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
 */
