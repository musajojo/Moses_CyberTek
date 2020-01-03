package day07;

public class CastingTheCharacter {

    public static void main(String[] args) {

        char grade = 'B';
        System.out.println(grade);

        int letterInNumber = 'B';
        //'B' is represented by 66 in the ascii table
        // here type char is automatically widened to int
        // and stored as number
        System.out.println(letterInNumber);

        int letterInNumber2 = 'b';
        System.out.println(letterInNumber2);

        // must use '' single character "" is for string

        //----------------------

        // saving the number as a char so we can get character representation
        // of the number in ascii table.

        char myFirstChar = (char) 100;
        System.out.println(myFirstChar);

        // find out your number of each character in your first name

        int M1 = 'M';
        int o2 = 'o';
        int s3 = 's';
        int e4 = 'e';
        int s5 = 's';

        System.out.println(M1);
        System.out.println(o2);
        System.out.println(s3);
        System.out.println(e4);
        System.out.println(s5);

        char letterA = 'a';
        //adding a character ti a int number will result in int
        System.out.println( letterA + 1);

        //this is a string if you want the 1 added to the a add "" to make it a string
        System.out.println(" " + letterA + 1);


    }
}





