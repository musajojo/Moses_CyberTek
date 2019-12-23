package repl;

import java.util.Scanner;

public class Repl_015_Print_variable_6 {
    public static void main(String[] args) {

        //do not change
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        float f = scan.nextFloat();

        System.out.println("i="+i+" "+("f=")+f);

    }
}
/*
015. Print variable 6
Instructions from your teacher:

Given an integer variable i and a floating-point variable f, that have already been given values, write a statement that writes both of their values to console in the following format:

i=value-of-i f=value-of-f

Ex:
Assume i = 9 and f = 33.4

Output should be:
i=9 f=33.4
 */