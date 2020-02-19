package A1_Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type in Length in Double");

        double length = input.nextDouble();
        System.out.println("Type in Width in Double");

        double width = input.nextDouble();

        double area;

        double perimeter = length * 2 + width * 2;

        area = length * width;

        String printOut;

        printOut = "Length:\t" + length;
        printOut += "\nWidth:\t" + width;
        printOut += "\nArea:\t" + area;

        System.out.println(printOut);
        System.out.printf("and the perimeter of the rectangle is " + "%.1f", perimeter);



    }
}

