package day58;
// Day 58 : Exception Hierarchy , Try Catch Finally
public class RunTimeErrorDemo {
    static int num = 0;
    public static void main(String[] args) {
        num++;
        System.out.println("num = " + num);
        //call main method again
        main(null);
    }
}
/*
package day57_exceptions2;

public class RunTimeErrorDemo {
    static int num = 0;
    public static void main(String[] args) {
        num++;
        System.out.println("num = " + num);
        //call main method again
        main(null);
    }
}
 */