package repl.repls_51_to_100;

import java.util.Scanner;

public class Repl_066_Merge_them {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        String s = "";
        int i = 0;

        if (word1.length() != 3 || word2.length() != 3){
            System.out.println("cannot merge");
        }else{
        while (i < word1.length() && i < word2.length()){
            s += word1.charAt(i) +""+ word2.charAt(i);
            i++;
        }
        while (i < word1.length() ){
            s += word1.charAt(i);
            i++;
        }
        while (i < word2.length()){
            s += word2.charAt(i);
            i++;
        }
        System.out.println(s);
        }
    }
}
/*
066. Merge them

Instructions from your teacher:

You have 2 words, both of them have 3 characters.
If either of them does not have exactly 3 characters, print "cannot merge"
Merge their characters one by one and print together like below:

aok
lol
alookl

ear
pie
epaire

java
wow
cannot merge

hint:
by inserting +""+ (empty string) between chars,
you can concatenate char values.
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