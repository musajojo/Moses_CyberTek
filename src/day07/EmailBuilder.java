package day07;

import java.util.Scanner;

public class EmailBuilder {

    public static void main(String[] args){

        // create a class called EmailBuilder with main method

        Scanner scan = new Scanner(System.in);
        System.out.println("Email your first name , last name , company seperated by space :");
        String firstName, lastName, company, email;
        firstName = "Moses";
        lastName = "Dee";
        company = "Verizon";
        email = firstName +"_"+lastName+"@"+company+".com";

        System.out.println("My name is " + firstName + " " + lastName + " and I work for " + company + " " + "and my email is " + email);
// create 3 String variable for first name  last name , company
// create another variable for email
// create email in this format firstName_lastName@company.com

// print out the result as , my name is <your full name> and I work for <company> and my email is <email>


    }
}
