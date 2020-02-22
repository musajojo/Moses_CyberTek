package onlineCaveOfProgramming.cave01_Programming_Core_Java;

import java.util.Scanner;

public class Cave_12_Do_While {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
/*
        System.out.println("Enter a number: ");

        int value = scanner.nextInt();

        while (value !=5){
            System.out.println("Enter a number: ");
            value = scanner.nextInt();
        }
        System.out.println("Got 5!");
*/
        int value;
        do {
        System.out.println("Enter a number: ");
         value = scanner.nextInt();
        }while (value != 5 );
        System.out.println("Got 5!");
    }
}
