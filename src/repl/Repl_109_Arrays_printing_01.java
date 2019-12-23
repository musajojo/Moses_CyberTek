package repl;
import java.util.Scanner;
public class Repl_109_Arrays_printing_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 5 items
        //write your code below

        System.out.println(arr[0].substring(0,3));
        System.out.println(arr[1].substring(0,3));
        System.out.println(arr[2].substring(0,3));
        System.out.println(arr[3].substring(0,3));
        System.out.println(arr[4].substring(0,3));
    }
}
/*
109. Arrays - printing 01
Instructions from your teacher:

The code provided in your main method will take in five Strings and save them into an array called arr.
Print out the first three letters of each element of arr, one per line.
You can assume that every element of arr is at least 3 letters long.

Example:
arr -> ["apple", "banana"]
 prints: app
         ban

Hint: How do you get the first 3 letters of any String starting from index 0 till right before index 3?
 */
/*
import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
		}
		//leave above alone! :)
		//assume you have String array of 5 items
		//write your code below
	}
}
 */