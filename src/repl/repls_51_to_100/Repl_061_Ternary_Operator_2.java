package repl.repls_51_to_100;

import java.util.Scanner;

public class Repl_061_Ternary_Operator_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan.nextInt();

        num1 = (num1 > num2) ? num1 : num2;
        System.out.println(num1);
    }
}
/*
061. Ternary Operator 2
Instructions from your teacher:

Write an expression using the conditional operator (? :)
that compares the values of the variables num1 and num2.
The result (that is the value) of this expression
should be the value of the larger of the two variables.
The larger value should be printed out.

watch this short for more info
https://learn.cybertekschool.com/courses/278/pages/20-ternary-conditional-statement?module_item_id=14151

 */
/*
import java.util.*;
class Main {
  public static void main(String[] args) {
    //DO NOT CHANGE
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number1:");
		int num1 = scan.nextInt();
		System.out.println("Enter number2:");
		int num2 = scan.nextInt();
		//WRITE YOUR CODE HERE
  }
}
 */