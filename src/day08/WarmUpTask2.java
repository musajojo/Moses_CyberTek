package day08;

import java.util.Scanner;

public class WarmUpTask2 {

    public static void main(String[] args) {
/*
//if statement practice
        int age = 27;

        System.out.println( age >= 18);

        // no semi colon ; at the end of the if statement. we need curly braces instead
        if (age >=18 ) {

            System.out.println("You are ready yo vote !!!"); }
        else {
            System.out.println("Wait until you are 18! ");
            */

        Scanner scan = new Scanner(System.in);
        System.out.println("Guess My Favorite Number : ");

        int myFavoriteNumber = scan.nextInt();

        if (myFavoriteNumber==300) {
            System.out.println("Bingo");
        }


        System.out.println();

    }
    }
