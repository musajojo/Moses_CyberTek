package repl.repls_51_to_100;

import java.util.Scanner;

public class Repl_065_Duplicate_it {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();


        int numOfDuplicate = 2;

        for (int i = 1; i <= numOfDuplicate; i++) {
            if (i % 2 == 0) {
                System.out.print(word2 + word1);
            }
            else{

                System.out.print(word1 + word2);

            }
    }
  }
}
/*
065. Duplicate it

Instructions from your teacher:

You have 2 words
Print the first word, second word, second word, first word

Input:
one
two
Output:
onetwotwoone
 */
/*
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word1 = scan.next();
    String word2 = scan.next();
    //YOUR CODE HERE
  }
}
 */
/*
package repl.repls_51_to_100;

import java.util.Scanner;

public class Repl_065_Duplicate_it {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        System.out.println(word1+word2+word2+word1);
    }
}
 */