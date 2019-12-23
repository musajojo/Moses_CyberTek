package day20;

public class PalindromeTest {
    public static void main(String[] args) {

        // if you reverse a string it does its meaning
        // the string is called a Palindrome
        // level. kayak. elle. madam, aziza

        // Home Work
        // MAKE THIS CODE DOES NOT CARE ABOUT SPACES WHILE CHECKING

        String name = "Nurses run";
        String reversedName = "";

        for (int x = name.length()-1; x >=0 ; x--) {
            reversedName = reversedName + name.charAt(x);
        }
        System.out.println("reversedName = " + reversedName);
        if (name.equalsIgnoreCase(reversedName)){
            System.out.println("Palindrome Test Has Passed");
        }else {
            System.out.println("Palindrome Test Has Failed");
        }



    }
}
