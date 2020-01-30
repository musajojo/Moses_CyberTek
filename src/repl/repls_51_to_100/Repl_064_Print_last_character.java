package repl.repls_51_to_100;

import java.util.Scanner;

public class Repl_064_Print_last_character {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.charAt(word.length()-1));
    }
}
/*
064. Print last character

Instructions from your teacher:

Write a program that will print out last letter of the word (string).
 */
/*
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    //DO NOT CHANGE
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //WRITE YOUR CODE HERE
  }
}
 */
