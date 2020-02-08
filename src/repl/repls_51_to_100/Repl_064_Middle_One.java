package repl.repls_51_to_100;
import java.util.*;

public class Repl_064_Middle_One {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int position;
        int length;

        if (word.length() % 2 == 1 ) {
            position = word.length() / 2;
            length = 1;
        }else {
            position = word.length() / 2 - 1;
            length = 2;
        }
        String result = word.substring(position, position + length);

        System.out.println(result);



    }
}
/*
064. Middle One

Instructions from your teacher:

You have a word, do the following:

1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
 */
/*
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //YOUR CODE HERE
  }
}
 */
