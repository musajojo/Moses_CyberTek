package repl.repls_51_to_100;

import java.util.*;

public class Repl_053_Vehicle_recall {
    public static void main(String[] args) {
// Different approach than for repl 45. Had help with this:
        ArrayList<Integer> vehicleYears = new ArrayList<>(); //array list to store vehicle years
        int vehicleYear; //storing user input
        Scanner scan = new Scanner(System.in);
        //add vehicle years to ArrayList
        vehicleYears.add(1995);
        vehicleYears.add(1996);
        vehicleYears.add(1997);
        vehicleYears.add(1998);
        vehicleYears.add(2000);
        vehicleYears.add(2001);
        vehicleYears.add(2002);
        vehicleYears.add(2004);
        vehicleYears.add(2005);
        vehicleYears.add(2006);
        vehicleYears.add(2015);
        vehicleYears.add(2016);
        vehicleYears.add(2017);
        System.out.println("Enter vehicle's year:");
        vehicleYear = scan.nextInt();
        //for loop for searching the aray list for vehicle years
        for (int i = 0; i < vehicleYears.size(); i++) {
            if (vehicleYears.contains(vehicleYear)) {
                System.out.println("Your vehicle needs to be recalled!");
                System.exit(0);
            } else {
                System.out.println("Your vehicle is fine, enjoy!");
                System.exit(0);
            }
        }
    }
}
/*
053. Vehicle recall

Instructions from your teacher:

SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017.

In this assignment you will write a program that will find vehicle for recall.
-Create a scanner object
-Create int variable named vehicleYear

-Display prompt: "Enter vehicle's year:"
input: 1996

 if the value of modelYear does fall within the four recall ranges, display output:
"Your vehicle needs to be recalled!"

Otherwise, display message:
"Your vehicle is fine, enjoy!"
 */
/*
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //WRITE YOUR CODE HERE
  }
}
 */