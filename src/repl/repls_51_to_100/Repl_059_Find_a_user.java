package repl.repls_51_to_100;

import java.util.Scanner;

public class Repl_059_Find_a_user {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String firstName = scan.next();
        String lastName = scan.next();

        if (firstName.equalsIgnoreCase("Max") && lastName.equalsIgnoreCase("Payne")){
            System.out.println("User found!");
        }else if (firstName.equalsIgnoreCase("Alan") && lastName.equalsIgnoreCase("Wake")){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }
    }
}
/*
059. Find a user

Instructions from your teacher:

Write a program that will look up for user.

Assume that you have only 2 users: Max Payne and Alan Wake.
First, ask user to enter full name. Display message: "Enter full name:".
Then take input from user.
If name is equals to either "Max Payne" or "Alan Wake",  display message:
"User found!". Otherwise,  display message: "User not found!".
Please make your search case insensitive!

Example:
Display message: Enter full name:
input: Max Payne
Display message: User found!
 */
/*
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //WRITE YOUR CODE HERE
  }
}
 */
/*
// This is another way to do this. Had help.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");

        String name = scan.nextLine();
        int cmp1, cmp2;
        cmp1 = name.compareToIgnoreCase("Max Payne");
        cmp2 = name.compareToIgnoreCase("Alan Wake");
        if((cmp1 == 0)||(cmp2 == 0)){
            System.out.println("User found!");
        } else{
            System.out.println("User not found!");
        }
    }
}
 */
