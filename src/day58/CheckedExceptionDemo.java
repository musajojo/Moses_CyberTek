package day58;
// Day 58 : Exception Hierarchy , Try Catch Finally
public class CheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Checked Exception in next line");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Exception is caught!");
        }

        System.out.println("After Thread.sleep");
    }
}
/*
package day57_exceptions2;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Checked Exception in next line");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Exception is caught!");
        }

        System.out.println("After Thread.sleep");
    }
}
 */