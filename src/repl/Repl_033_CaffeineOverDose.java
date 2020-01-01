package repl;
import java.util.*;
public class Repl_033_CaffeineOverDose {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int drinkCount;
    int overDose = 10000;

        System.out.println("Enter number of milligrams in drink:");
        int caffeineMil = scan.nextInt();
        drinkCount = overDose/caffeineMil;

        System.out.println("It would take about "+drinkCount+" drinks for a lethal overdose.");
    }
}
/*
033. CaffeineOverDose
Instructions from your teacher:

Enter*number*of*milligrams*in*drink:500
It*would*take*about*20*drinks*for*a*lethal*overdose.

Scientists estimate that roughly 10 grams of caffeine consumed at one time is a  lethal overdose.  Write a program with a variable that holds the number of milligrams of caffeine in a drink and outputs how many drinks it takes to kill a person. In one gram, there is 1000 mg. Please refer to the image above as an example and use any number of variables you want. Dots mean space in the picture.

Formula to get drink count to cause an overdose is
10*1000 / drinkCount
 */
/*
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //WRITE YOUR CODE HERE:



  }
}
 */