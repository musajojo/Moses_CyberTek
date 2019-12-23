package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {

        //Checking for String equality should be always
        // done using equals methos of the String

        // oneString.equals(anotherString) -->> true or false

        // equals method coming from String Class
        //each and every String object you creat will have this functionality

        // Just comparing 2 String literal directly using equals method

        //This is something that you will rarely due
        //System.out.println("Java".equals("java"));

        String myStr = "Java";
        System.out.println(myStr.equals("Java"));
        //IntelliJ displays original as a helper, its not part of your code
        //please ignore and keep trying. do not type original just type your code
        String yourStr = new String ("Java");

        System.out.println("is my string same as your string");
        // how to compare myStr to yourStr for equality
        System.out.println(myStr.equals(yourStr));

        // Create a program to check whether myStr value is Java
        // if true -->> Correct Word !!!
        // If false --- SAY JAVA!!!!

        System.out.println("Is myStr equal to Java? ");
        if (myStr.equals("Java")){
            System.out.println("Correct Word!!!");
        }else{
            System.out.println("Say JAVA!!!");
        }

    }
}
