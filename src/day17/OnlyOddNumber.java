package day17;

public class OnlyOddNumber {
    public static void main(String[] args) {
        //       Create a new class called BackwardOddNumberFinder
        //       Print all the odd numbers backward from 100-0
        //       try to use if statement
        //       100 - .... - 0

        int x = 100;


        while (x > 0) {
            // if x divided by 2 have remainder
            // for example 5/2=2 1 remain   5%2=1  1!=0
            if (x % 2 != 0) { // x % 2 == 1 does same thing
                System.out.println(x + " is odd number");
            }
            --x;
        }

    }


}