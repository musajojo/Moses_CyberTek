package day07;

import java.util.Scanner;

public class EmailBuilderScan {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstName, lastName, location;

        System.out.println("What is your first name? ");
        firstName = scan.next();
        System.out.println("What is your last name? ");
        lastName = scan.next();
        System.out.println("Where do you live? ");
        location = scan.next();
        System.out.println("Your name is " + firstName + " " + lastName + " and you live in " + location);

/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Email your first name , last name , company seperated by space :");
        String firstName, lastName, company, email;
        firstName = scan.next();
        lastName = scan.next();
        company = scan.next();
        email = firstName + "_" + lastName + "@" + company + ".com";

        System.out.println("My name is " + firstName + " " + lastName + " and I work for "
                + company + " " + "and my email is " + email);

        // create a class called EmailBuilder with main method


        // create 3 String variable for first name  last name , company
// create another variable for email
// create email in this format firstName_lastName@company.com

// print out the result as , my name is <your full name> and I work for <company> and my email is <email>

*/
    }
}
