package repl.repls_01_to_50;
import java.util.*;
public class Repl_035_Gift_Card {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        String item = scan.nextLine();

        if (item.equalsIgnoreCase("Smartphone")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if (item.equalsIgnoreCase("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if (item.equalsIgnoreCase("Charger")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 15)+"$");
        }else if (item.equalsIgnoreCase("USB Cable")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 10)+"$");
        }else if (item.equalsIgnoreCase("Headphones")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 30)+"$");
        }else if (item.equalsIgnoreCase("Pants")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 50)+"$");
        }else if (item.equalsIgnoreCase("Hat")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 25)+"$");
        }else if (item.equalsIgnoreCase("Socks")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 5)+"$");
        }else if (item.equalsIgnoreCase("Blanket")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 60)+"$");
        }else if (item.equalsIgnoreCase("Pillow")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 40)+"$");
        }else {
            System.out.println("Invalid Item!");
        }



    }
}
/*
035. Gift Card
Instructions from your teacher:

Let's say I've got a 100$ gift card and you want to buy something in your online store .
Write a program that will help me to buy something and display leftover balance after purchase.
If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".

Hint
Use if/ else if / else
CODE EXAMPLE:
Example #1
input: Hat
output: Thank you for your purchase!
output: Your current balance is: 75$

Example #2
input: Pants
output: Thank you for your purchase!
output: Your current balance is: 50$

Example #3
input: Laptop
output: Sorry, not enough funds on your gift card!

Example #4
input: Cupcake
output: Invalid item!
List of items

Item          Price

Smartphone    $300.00
Laptop        $400.00
Charger       $15.00
USB cable     $10.00
Headphones    $30.00
Pants         $50.00
Hat           $25.00
Socks         $5.00
Blanket       $60.00
Pillow        $40.00
 */
/*
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String item = scan.nextLine();

    //WRITE YOUR CODE HERE
  }
}
 */
/*
package repl;
import java.util.*;
public class Repl_035_Gift_Card {
    public static void main(String[] args) {

        String Smartphone = "Smartphone";
        String Laptop = "Laptop";
        String Charger = "Charger";
        String USB = "USB cable";
        String Headphones = "Headphones";
        String Pants = "Pants";
        String Hat = "Hat";
        String Socks = "Socks";
        String Blanket = "Blanket";
        String Pillow = "Pillow";

        Scanner scan = new Scanner (System.in);
        double giftCard = 100;
        String item = scan.nextLine();
        double price = scan.nextDouble();

        if (price > giftCard){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if (item.equalsIgnoreCase(Smartphone)){
            System.out.println("Thank you for your purchase!");
            double balance = giftCard - price;
            System.out.println("Your current balance is: "+ balance + "$");
        }else if (item.equalsIgnoreCase(Laptop)){
            System.out.println("Thank you for your purchase!");
            double balance = giftCard - price;
            System.out.println("Your current balance is: "+ balance + "$");
        }else if (item.equalsIgnoreCase(Charger)){
            System.out.println("Thank you for your purchase!");
            double balance = giftCard - price;
            System.out.println("Your current balance is: "+ balance + "$");
        }else if (item.equalsIgnoreCase(USB)){
            System.out.println("Thank you for your purchase!");
            double balance = giftCard - price;
            System.out.println("Your current balance is: "+ balance + "$");
        }else if (item.equalsIgnoreCase(Headphones)){
            System.out.println("Thank you for your purchase!");
            double balance = giftCard - price;
            System.out.println("Your current balance is: "+ balance + "$");
        }else if (item.equalsIgnoreCase(Pants)){
            System.out.println("Thank you for your purchase!");
            double balance = giftCard - price;
            System.out.println("Your current balance is: "+ balance + "$");
        }else if (item.equalsIgnoreCase(Hat)){
            System.out.println("Thank you for your purchase!");
            double balance = giftCard - price;
            System.out.println("Your current balance is: "+ balance + "$");
        }else if (item.equalsIgnoreCase(Socks)){
            System.out.println("Thank you for your purchase!");
            double balance = giftCard - price;
            System.out.println("Your current balance is: "+ balance + "$");
        }else if (item.equalsIgnoreCase(Blanket)){
            System.out.println("Thank you for your purchase!");
            double balance = giftCard - price;
            System.out.println("Your current balance is: "+ balance + "$");
        }else if (item.equalsIgnoreCase(Pillow)){
            System.out.println("Thank you for your purchase!");
            double balance = giftCard - price;
            System.out.println("Your current balance is: "+ balance + "$");
        }else{
            System.out.println("Invalid Item!");
        }
    }
}
 */