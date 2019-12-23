package myPractice;
import java.util.Scanner;

public class Scanner_If_NestedIf {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Which terminal do you work at?");
        String term = scan.next();
        if (term.equalsIgnoreCase("A")){
                System.out.println("Me too");
            }else if (term.equalsIgnoreCase("B")){
                System.out.println("Not for me");
            }else if (term.equalsIgnoreCase("C")){
                System.out.println("North or Center?");
            String pier1 = scan.next();
            if (pier1.equalsIgnoreCase("North")){
                    System.out.println("Its big");
            }else if (pier1.equalsIgnoreCase("Center")){
                    System.out.println("Its Small");
            }
            }else{
                System.out.println("Not DCA");       }





    }
    }
