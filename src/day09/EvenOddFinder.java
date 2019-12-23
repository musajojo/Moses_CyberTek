package day09;

public class EvenOddFinder {
    public static void main(String[] args) {
        /*
        // Task 1
        Create a class called EvenOddFinder with main method


                Write a program to find out a number is even or odd
                Create a int variable called myNumber and assign a value

        If the number is even then says  this is a even number
        If the number is odd then says  this is a odd number


        optionally use Scanner
        */

        int myNumber = 301;

        System.out.println(myNumber/2);
        System.out.println(myNumber%2);

        int remainder = myNumber%2;

        //if (remainder == 0)
        if (myNumber%2 == 0){
            System.out.println("Even number!!!");
        }else {
            System.out.println("Odd Number !!!");

            System.out.println("End");
        }
    }
}
