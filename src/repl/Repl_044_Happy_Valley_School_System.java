package repl;
import java.util.*;

public class Repl_044_Happy_Valley_School_System {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        System.out.println("Enter age:");

        if (age < 2){
            System.out.println("ineligible");
        }else if (age == 2 ){
            System.out.println("toddler");
        }else if (age >= 3 && age <= 5){
            System.out.println("early childhood");
        }else if (age >= 6 && age <= 7){
            System.out.println("young reader");
        }else if (age >= 8 && age <= 10){
            System.out.println("elementary");
        }else if (age >= 11 && age <= 12){
            System.out.println("middle");
        }else if (age == 13){
            System.out.println("impossible");
        }else if (age >= 14 && age <= 16){
            System.out.println("high school");
        }else if (age >= 17 && age <= 18){
            System.out.println("scholar");
        }else if (age > 18 ){
            System.out.println("ineligible");
        }
    }
}
/*
044. Happy Valley School System

Instructions from your teacher:

In the Happy Valley School System, children are classified by age as follows:
less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible

Given an int variable age, write an if statement that prints out, on a line by itself, the appropriate label from the above list based on age.

Example:
-Display prompt: Enter age:
8
-Display prompt: elementary
 */
/*
import java.util.*;
class Main {
  public static void main(String[] args) {
    //DO NOT CHANGE
    Scanner scan = new Scanner(System.in);
    //WRITE YOUR CODE HERE
   }
}
 */