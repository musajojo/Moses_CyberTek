package day59;

public class CodeNote01 {
    public static void main(String[] args) {
        /*
package day59;

import java.util.Scanner;

public class ExceptionPractice {


    public static void main(String[] args) {

        // This simple program will get certain character from furkan's name
        // according to the index user provided

        System.out.println("The Start" );
        String name = "Furkan";

        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkan's name ? ");
        int targetIndex = scan.nextInt();

        System.out.println(name.charAt( targetIndex  ));

        System.out.println("name = " + name);
        System.out.println("The End" );


        // Exceptions are object , so it has it's own class
        // and we can create object ourselves just like we did from any other classes
        //StringIndexOutOfBoundsException e1 = new StringIndexOutOfBoundsException();
        //System.out.println( e1.toString() );




    }


}
Show less

Akbar  1:10 PM
Exception :
	scan.nextInt() -->> expect number
	if we pass String --->> execption at run time
	str.charAt(100)  --->> execption at run time
	String str2 = null
	str2.charAt(0)  --->> execption at run time
	int[] arr = {1,2,4} ;
	print( arr[100]  ) -->> execption at run time
String str = "a" ;
	print(9/0) ;  -->> execption at run time
	Shape a1 = new Circle();
	Rectangle r1 = (Rectangle) a1 ;
	// above code compile but Throw ClassCastException at run time
	// Because Circle is NOT-A Rectangle
	The process of dealing with the unexpected event is called
	Exception Handling
	All different types of exceptions have its own class
	to be the blueprint for the exceptions object happen at run time
	Throwable is the super class type of all the exceptions classes
	Just like everything else :
	Exceptions are object !!!!!!!
	Exceptions in Java is categorized using Exception Hierarchy
		try to recover from it
		or report it
		dignose it / debug
	How do you handle exceptins :
		try catch block
		try{
			// code that might throw an exception
		}catch(Exception e){
			// just like method parameter :
			// Exception e  is a variable with type Exception
			// when java throw exception at run time
			// it will assign the exception object to variable e
			// for example if StringIndexOutOfBoundException happen in try block
			// it will do below
			// Exception e = new StringIndexOutOfBoundException("some message here");
			// if it's NullPointerException it will do below
			// Exception e = new NullPointerException(...);
			// since it's an object , we can call a method just like any other object
			// getMessage is useful method from Exception class
					// to get some more information about the exception object
					// created at run time
			// if the exception happen the flow of program will come here
			// take action to recover or just report or notify
		}
		// some more code
		// by handling the exception might occure during the program
		// our program will not shut down abruptly
		// we can end or continue the program gracefully.
		or declare it .    public void doSomething() throws Exception{}
--- WHAT ABOUT COMPILER ERROR ????   NO ----
THIS IS SYNTAX ERROR THAT DOES NOT LET YOUR CODE COMPILER
         */
    }
}
