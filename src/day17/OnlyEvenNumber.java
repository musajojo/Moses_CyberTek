package day17;

public class OnlyEvenNumber {
    public static void main(String[] args) {

        //       Create a new class called BackwardEvenNumberFinder
        //       Print all the even numbers backward from 100-0
        //       try to use if statement rather than -2
        //       100 - .... - 0


        int x = 100;


        while (x >= 0) {

            if (x % 2 == 0) {
                System.out.println(x + " is even number");
            }
            --x;

        }


    }

}