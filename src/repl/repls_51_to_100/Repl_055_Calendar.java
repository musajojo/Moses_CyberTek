package repl.repls_51_to_100;

import java.util.Scanner;

public class Repl_055_Calendar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month number:");
        int monthNumber = scan.nextInt();

        switch (monthNumber){

            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid number!");
                break;
        }
    }
}
/*
055. Calendar (058. Calendar)

Instructions from your teacher:

Write a program that will print out month name by receiving a number.
Use switch statement for conditions.

Example:
Display message: "Enter month number:"
input: 5
Display message: "May"
 */
/*
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //WRITE YOUR CODE HERE
  }
}
 */