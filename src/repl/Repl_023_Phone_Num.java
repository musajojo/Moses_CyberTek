package repl;

import java.util.Scanner;

public class Repl_023_Phone_Num {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int areaCode;
    int localNumber;

    String phoneNumber = "Calling number";

    areaCode = scan.nextInt();
    localNumber = scan.nextInt();

    System.out.println(phoneNumber+" (" + areaCode + ")-" + localNumber);

}
}
/*
023. Phone Num
Instructions from your teacher:

Write a program that asks user to input int values: areaCode and localNumber.

-Using concatenation put together in this format and assign to String phoneNumber  variable:

-(222)-3334444

-Write a print statement that displays (use phoneNumber variable ):
Calling number (222)-3334444
 */

