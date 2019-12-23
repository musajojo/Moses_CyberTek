package extraTasks;
import java.util.*;
public class YearlySalary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* Task 4 from day05:
        Create an interactive program to ask user for hourly wage
        and generate yearly salary
        assume that he works 2080 hour for a year. */

        System.out.println("What is your hourly wage? ");
        double hourlyWage = scan.nextDouble();
        System.out.println("You make $" + hourlyWage + " per hour. ");
        System.out.println("You work 2080 hours a year");
        double yearlyWage = hourlyWage * 2080;
        System.out.println("So that means you make $" + yearlyWage + " a year!");
    }
}