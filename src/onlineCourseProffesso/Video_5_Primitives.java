package onlineCourseProffesso;

public class Video_5_Primitives {
    static int i; // default value is 0. Instance variable.
    // By placing the int i in class section and making it static it will initialize and become 0 by default.
    // works with other primitives as well
    static int i1 = 1;
    static Integer i2; // The wrapper class shows up as null. No default value.
    static Integer i3 = 1;
    static String i4 = "1";
    static double d;
    static Double d2;
    static char c;
    static Character c2;
    static boolean b;
    static Boolean b2;
    static String s;

    public static void main(String[] args) {
        // int i; // Just placing the variable here locally without initializing it will give an error
        // inorder to get it to work with the default of 0, it must be places in the class section
        System.out.println("Primitive int " + i);
        System.out.println("Wrapper Integer " + i2);
        System.out.println("Primitive double " + d);
        System.out.println("Wrapper Double " + b2);
        System.out.println("Primitive char " + "-->" + c + "<--" + " Blank Character shows up");
        System.out.println("Wrapper Character " + c2);
        System.out.println("Primitive boolean " + b);
        System.out.println("Wrapper Boolean " + b2);
        System.out.println("Object String " + s);


        System.out.println("Integer 1 .toString() prints as --> " + i3.toString());
        System.out.println("int 1 .toString() creates an error");

    } public static void output (String output) {

        output(i2.toString()); // I can turn the Integer into a String since it is a Wrapper Class.
                               // int (Primitive) cannot do this.
                               // There aee many other benefits as well.
        outPut(Integer.parseInt(i4)); // This was a String and has been changed into an Integer.
                                      // It works either way.

    } public static void outPut (Integer outPut) {
    }
}
/*
package net.javavideotutorials.example;


public class Primitives
{
  static int i;
  static Integer i2;
  static double j;
  static Double j2;
  static char k;
  static Character k2;
  static boolean l;
  static Boolean l2;

	public static void main(String[] args)
	{
		System.out.println(j);
		System.out.println(j2);
		System.out.println(k);
		System.out.println(k2);
		System.out.println(l);
		System.out.println(l2);
	}
}
 */
