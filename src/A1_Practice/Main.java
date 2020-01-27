package A1_Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");

        String name = scan.nextLine();
        int cmp1, cmp2;
        cmp1 = name.compareToIgnoreCase("Max Payne");
        cmp2 = name.compareToIgnoreCase("Alan Wake");
        if((cmp1 == 0)||(cmp2 == 0)){
            System.out.println("User found!");
        } else{
            System.out.println("User not found!");
        }
    }
}

