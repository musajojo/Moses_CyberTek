package repl.repls_01_to_50;

import java.util.Scanner;

public class Repl_046_Conditional_Statement_Practice_1 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();

        if (num == 0){
            System.out.println();
        }else if (num >= 0){
            System.out.println(num + " is positive");
        }else if (num <= 0){
            System.out.println(num + " is negative");
        }
    }
}
/*
046. Conditional Statement Practice 1

Instructions from your teacher:

The variable "num" holds an integer user input
Write a conditional statement starting on line 9 that does the following:
If num is positive, print "__ is positive"
If num is negative, print "__ is negative"
Examples:
In: 5
5 is positive
In: -2
-2 is negative
In: 0
(no output for zero)
 */
/*
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  	Scanner inp = new Scanner(System.in);
  	System.out.print("In:");
  	int num = inp.nextInt();
  	//DO NOT CHANGE ABOVE CODE!  Write your code below
  }
}
 */