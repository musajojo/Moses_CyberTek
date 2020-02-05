package codeStudy;

import java.util.Arrays;
import java.util.List;

public class Loops {
    public static void main(String[] args) {

        System.out.println("While Loops");
        int counter = 0;
        while (counter < 10) {
            System.out.println(counter);
            counter++;
        }
        System.out.println("......................");
        System.out.println("do While Loops");

        counter = 5;
        do{
            System.out.println(counter);
            counter++;
        }while (counter <= 10);

        System.out.println("......................");
        System.out.println("do While Loops continued");

        counter = 15;
        do{
            System.out.println(counter);
            counter++;
        }while (counter <= 10);

        System.out.println("......................");
        System.out.println("for loops");

        for (int forLoopCounter = 1; forLoopCounter <= 10; forLoopCounter++){
            System.out.println(forLoopCounter);
        }


        System.out.println("......................");
        System.out.println("for loops counting by 3s or what ever number you want");

        for (int forLoopCounter = 1; forLoopCounter <= 10; forLoopCounter+=3){
            System.out.println(forLoopCounter);
        }

        System.out.println("......................");
        System.out.println("for loops starting from 6 or what ever number you want");

        for (int forLoopCounter = 6; forLoopCounter <= 21; forLoopCounter+=3){
            System.out.println(forLoopCounter);
        }

        System.out.println("......................");
        System.out.println("for each loop or enhanced for loop");
        // this is used with Arrays

        int array1 []= {3,4,5,6,7,};
        int total = 0;

        for ( int x : array1){
            total+=x;
        }
        System.out.println(total);

        System.out.println("......................");
        System.out.println("for each loop another example");

        List <Integer> grades = Arrays.asList(5,3,2,6,3);

        // traditional for loop
        for (int i = 0; i < grades.size(); i++) {
            System.out.print(grades.get(i));
        }
        System.out.println("\n.. .. .. .. .. .. .. .. .. ..");

        // for each loop same outcome
        for (int grade : grades) {
            System.out.print(grade);
        }

        System.out.println("\n......................");

    }
}