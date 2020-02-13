package day58;

public class CodeNotes {
    public static void main(String[] args) {
        /*
        02/12/2020
----------
​
java day 57 / 58
​
Welcome everyone!
​
java classes start:
	11/09/2019
​
java classes end:
	02/23/2020
​
Automation classes will start
	02/25/2020
	..
​
Instructor for Online: Vasyl
Instructor for VA Campus: Marufjon
​
Bye bye Murodil and Akbar!!!!
-----------------------------
​
Exception handling:
Java collections and data structures
------------------
​
Exception handling in Java:
​
The term exception is shorthand for the phrase "exceptional event."
​
Definition: An exception is an event, which occurs during the execution of a program, that disrupts/stops the normal flow of the program's instructions.
​
--------
​
COMPILE TIME:
	COMPILE ERRORS -> normally due to programmer's mistake regarding syntax, data types etc.
​
DURING RUNTIME:
	-> Error -> happens due to environment issues. We do not handle them.
	-> Checked Exceptions -> are exceptions that programmer MUST handle otherwise code will fail to compile
	-> UnChecked Exceptions -> are exceptions that happen during runtime due to programmers mistake, and it is optional to handle them. Most of the time, programmer should do his best to fix his code and avoid UncheckedExceptions
===============================
​
Package day57_exceptions2
​
Add a class RunTimeErrorDemo
=============================
​
Thread.sleep(1000); -> it pauses code execution for given milliseconds.
​
ex:
​
System.out.println("java");
Thread.sleep(5000);//pause for 5 second
System.out.println("selenium");
Thread.sleep(1000); //pause for 1 second and continue to next line
System.out.println("SQL");
​
​
Thread.sleep(1000); -> this line throws a CHECKED EXCEPTION - INTERRUPTEDEXCEPTION.
​
CHECKED EXCEPTIONS MUST BE Handled or Declared For the code to compile.
​
INTERRUPTEDEXCEPTION is a CHECKED exception.
------------
​
When we write a line that might throw a checked exception, programmer must handle or declare that line for the code to compile.
​
CHECKED EXCEPTIONS :
	1) handled using try catch block
	2) declare using throws keyword in method definition line
​
public static void main(String[] args) {

	Thread.sleep(3000); <-- will not compile because of Checked exception. it needs to be handle or declare
​
}
--------
​
1. Handling checked exception -> is done using TRY.. CATCH ... block
​
public static void main(String[] args) {
	try{
		Thread.sleep(3000);
    } catch(Exception e){
    	System.out.println("Exception is caught");
    }
    .....
}
​
If exception happens when code is running, catch block will catch the exception and print the message. Then code will continue to run until end.
​
2. Declaring checked exception using throws keyword:
​
public static void main(String[] args) throws Exception{

	Thread.sleep(3000);
​
}
====================
​
​
Throws keyword in java, is used to declare that a method(or main method) might throw exception. it does not handle the exception.
For handling we need to use try catch block.
​
benefit of throws :
	-> helps our code to compile
Disadvantage:
	-> if exception happens during runtime, code will stop and will not continue running
==================
​
try catch block in java -> is used handle an exception.
​
try block -> we put code that we want to protect from exceptions
​
catch block -> is used to catch an exception if it happens due to some line in try block. if exception happens and gets caught, code in catch block will run.
​
behefit:
	Code will continue running until end without stopping due to exception.
======================
​
A
try{
	B
	C
}catch(Exception e){
	D
}
E
-------
​
1) No exceptions during runtime:
  A, B, C, E
​
2) Exception at B during runtime:
 A, D, E
​
3) Exception at C during runtime:
 A, B, D, E
--------------------------------

​
​
​
​
CHECKED EXCEPTIONS must be HANDLED or DECLARED for code to compile.
​
CHECKED EXCEPTIONS must be HANDLED using try catch block or DECLARED using throws keyword for code to compile.
​
UNCHECKED EXCEPTIONS are optional to be handled. Normally happen during runtime, due to programming mistakes.
​
------------------------------
​
HANDLING EXCEPTIONS:
​
1) try{
	  code you want to protect.
	  code that might throw exception
   }catch(Exception e){
   	   code to run when exception is caught
   }
​
2) try{
	  code you want to protect.
	  code that might throw exception
   }catch(Exception e){
   	   code to run when exception is caught
   }finally{
   	   code that will run, if there is exception or no.
   }
-----------------------
         */
    }
}
