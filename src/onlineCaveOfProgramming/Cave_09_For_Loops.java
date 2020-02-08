package onlineCaveOfProgramming;

public class Cave_09_For_Loops {
    public static void main(String[] args) {

        for ( int i = 0 ; i < 5 ; i++ /*i = i + 1*/){
            System.out.println("Hello");
            System.out.println("The Value of i is: " + i);
            System.out.printf("The Value of i is: ", i);
        }
        System.out.println( );
        for ( int i = 0 ; i < 5 ; i++){
            System.out.printf("The Value of i is: %d", i);
            // in this line the %d is replaced by the argument which is i in this case.
            // the f is for formatting. Use the desired formatting code as needed. Format Specifier.
//            System.out.println(format, arguments);
//            System.out.println(locale, format, arguments);
        }
        System.out.println( );
        for ( int i = 0 ; i < 5 ; i++){
            System.out.print("The Value of i is: " + i);
        }
        System.out.println( );
        for ( int i = 0 ; i < 5 ; i++){
            System.out.printf("The Value of i is: %d\n", i);
            // the \n is added to put the different iterations on a separate line. It mean New Line.
        }
    }
}
