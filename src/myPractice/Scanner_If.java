package myPractice;
import java.util.Scanner;

public class Scanner_If {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Which terminal do you work at?");
        String term = scan.next();
        if (term.equalsIgnoreCase("A")){
                System.out.println("Me too");
            }else if (term.equalsIgnoreCase("B")){
                System.out.println("Not for me");
            }else if (term.equalsIgnoreCase("C")){
                System.out.println("I used too");
            }else{
                System.out.println("Not DCA");       }





    }
    }
