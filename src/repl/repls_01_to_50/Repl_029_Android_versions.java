package repl.repls_01_to_50;

import java.util.*;

public class Repl_029_Android_versions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double version = scanner.nextDouble();

        if (version == 1.5) {
            System.out.println("Cupcake");
        }else if (version == 1.6) {
            System.out.println("Donut");
        }else if  (version == 2.1){
            System.out.println("Eclair");
        }else if (version == 2.2){
            System.out.println("Froyo");
        }else if (version == 2.3){
            System.out.println("Gingerbread");
        }else if (version == 3.1){
            System.out.println("Honeycomb");
        }else if (version == 4.0){
            System.out.println("Ice Cream Sandwich");
        } else if (version == 4.1 || version == 4.31){
            System.out.println("Jelly Bean");
        }else if (version == 4.4 || version == 4.44){
            System.out.println("KitKat");
        }else if (version == 5.0 || version == 5.1){
            System.out.println("Lollipop");
        }else if (version == 8.0 || version == 8.1){
            System.out.println("Oreo");
        }else if (version == 9.0){
            System.out.println("Pie");
        }else{
            System.out.println("Sorry, I don't know this version!");
        }
    }
}
/*
029. Android versions
Instructions from your teacher:

Android is one of the best operating systems in the world that helps the billion of users
who use smart phones and tablets. Also, Android versions always had some funny names related to sweets.
In this assignment, you need to write a program that will print a name of Android version, based on number.
Please refer to the table beneath, in order to develop your if statement.

1. Create an object of Scanner class named scanner.
2. Create double variable named version.
3. Write an if statement that will print android version name based on value of the version variable.

For example:

if version = 1.5, then print "Cupcake"
or, if version = 3.1, then print "Honeycomb"
or, if version is grater or equals to 4.1 and less or equals to 4.3.1 then print "Jelly Bean"

hint:  if(version>=4.1 && version<=4.31)

Otherwise (else), print "Sorry, I don't know this version!"

#################################################

input: 1.5
output: Cupcake

input: 9.0
output: Pie

input: 11.0
output: Sorry, I don't know this version!
 */
/*
import java.util.*;

class Main {
  public static void main(String[] args) {
    //WRITE YOUR CODE HERE

    //Step 1. Create object of Scanner class

    //Step 2. Create and intitialize in variable version. Use scanner.nextDouble() to intitialize.

    //Step 3. Write an if statement
  }
}
 */