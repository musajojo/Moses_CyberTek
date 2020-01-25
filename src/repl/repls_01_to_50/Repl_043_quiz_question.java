package repl.repls_01_to_50;

import java.util.Scanner;

public class Repl_043_quiz_question {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = s.nextLine();

        if (a.equalsIgnoreCase("a")){
            System.out.println("a is wrong");
        }else if(a.equalsIgnoreCase("b")){
            System.out.println("b is correct");
        }else if(a.equalsIgnoreCase("c")){
            System.out.println("c is wrong");
        }else{
            System.out.println(a + " is not a valid answer");
        }
    }
}
/*
043. quiz question

Instructions from your teacher:

Automated tests are the future.

in the given program you have a quiz question and a scanner to catch user input which will be stored on string a.

after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, valid answer.

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
a
a is wrong

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
b
b is correct

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
c
c is wrong

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
z
z is not a valid answer

 */
/*
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("what is the farthest planet in the solar system:" );
    System.out.println("a)venus" );
    System.out.println("b)pluto" );
    System.out.println("c)neptune" );

    String a = s.nextLine();
    //your code here
  }
}
 */