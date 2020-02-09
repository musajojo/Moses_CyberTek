package onlineCaveOfProgramming;

import java.util.Arrays;

public class Cave_15_Arrays_of_Strings {
    public static void main(String[] args) {

        String [] words = new String [3];

        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";

        System.out.println(words[2]);

        String[] fruits = {"apple", "banana", "pear", "kiwi"};
        // for each loop
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
        // value here is a container that holds the int
        int value = 123;
        // text here is more like an address showing where the Array is located its a reference.
        String text = null;
        System.out.println(text);

        String[] texts = new String[2];

        System.out.println(texts[0]);
        // This is the actual memory where the Array element is stored.
        texts[0] = "one";

        // for printing out and viewing contents of Array
        int [] numbers = new int[] {1,2,3};

        System.out.println(Arrays.toString(numbers));
    }
}
/*

 */
