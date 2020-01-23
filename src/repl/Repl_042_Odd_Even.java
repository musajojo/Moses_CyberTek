package repl;

import java.util.Scanner;

public class Repl_042_Odd_Even {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number:");
            int number = input.nextInt();

            if (number % 2 == 0){
                System.out.println(number + " is even");
            }else if (number % 2 == 1){
                System.out.println(number + " is odd");
            }else {
                // I need clarification on this line even though submit was correct. It doest work. Should it even work?
                System.out.println(number + " is even");

 /*             From StockOverFlow:
                if (number % 2 == 0) numberIsEven
                if (number % 2 != 0) numberIsOdd
 */
            }
        }
    }
/*
042. Odd | Even

Instructions from your teacher:

U have an Integer number already declared and assigned value.

Using conditional statements, check if number is odd or even. Please follow the below examples and print message accordingly:

Enter a number:
10
10 is even

Enter a number:
33
33 is odd

Enter a number:
0
0 is even
 */
/*
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = input.nextInt();
    //CODE HERE
  }
}
 */