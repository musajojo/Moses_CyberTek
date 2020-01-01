package repl;
import java.util.*;
public class Repl_032_Seconds_Converter {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int inputSeconds, hours, minutes, seconds;
        System.out.println("Enter seconds:");
        inputSeconds = scan.nextInt();

        hours = inputSeconds/3600;
        minutes = (inputSeconds%3600)/60;
        seconds = inputSeconds%60;

        System.out.println(hours+" hours, "+minutes+" minutes,"+" and "+seconds+" seconds");

    }
}
/*
032. Seconds Converter

Instructions from your teacher:

Enter*seconds:20394
5*hours,*39*minutes,*and*54*seconds.

Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total seconds.

-create a Scanner object
- declare int variables inputSeconds, hours, minutes, seconds
-Ask user enter seconds by printing:
"Enter seconds:"

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.

Example run:
Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds



 */
/*
import java.util.*;
class Main {
  public static void main(String[] args) {
    //YOUR CODE HERE:
  }
}
 */