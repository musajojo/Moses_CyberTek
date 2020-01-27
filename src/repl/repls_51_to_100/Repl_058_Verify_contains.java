package repl.repls_51_to_100;

import java.util.Scanner;

public class Repl_058_Verify_contains {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        if (sentence.contains(word)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
/*
058. Verify contains

Instructions from your teacher:

Write a program that will verify if word contains in the sentence.
Print out the result as boolean value.
 */
/*
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    String sentence = scan.nextLine();
    //WRITE YOUR CODE HERE
  }
}
 */