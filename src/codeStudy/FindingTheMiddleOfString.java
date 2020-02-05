package codeStudy;

import java.util.Scanner;

public class FindingTheMiddleOfString {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a String: ");
        String str = scan.next();

        int position;
        int length;

        if (str.length() % 2 == 1) {
            position = str.length() / 2;
            length = 1;
        }else{
            position = str.length() / 2 - 1;
            length = 2;
        }
        String result = str.substring(position, position + length);

        System.out.println("Middle: " + result);
    }
}
