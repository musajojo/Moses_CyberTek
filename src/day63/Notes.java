package day63;

public class Notes {
    public static void main(String[] args) {


    }
}
/*
File: /src/day63/FindingUnique.java, Line(s): 8-11
String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";
 */
/*
File: /src/day63/FindingUnique.java, Line(s): 1-39
package day63;

import java.util.HashSet;
import java.util.Set;

public class FindingUnique {

    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        // How many unique character showed up in above sentence
        // Basically we are looking for all the non-repeating character to make up this sentense

        // ONE WAY TO DO IT
        // first find a data structure that automatically remove duplicate ( create a HashSet object with type Character)
        // iterate over each character in above String
        // then add it to the object (HashSet) so it can remove the duplicate for us

        Set<Character> charSet = new HashSet<>();

        for (int x = 0; x < str.length(); x++) {
            charSet.add( str.charAt(x)  );
        }
        System.out.println("How many character overall ? "  + str.length()  );
        System.out.println("How many Unique Characters ?  " + charSet.size() );
        System.out.println("charSet = " + charSet);
    }
}
 */
/*
File: /src/day63/GroceryActions.java, Line(s): 11-22
Map< String, Double > groceryPriceMap =new HashMap<>();
        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Patato",1.99);
        groceryPriceMap.put("Tomato",3.00);
        groceryPriceMap.put("Grape",3.99);
        groceryPriceMap.put("Banana",0.69);
        groceryPriceMap.put("Apple",1.89);
        groceryPriceMap.putIfAbsent("Fish",12.99);
        groceryPriceMap.putIfAbsent("Apple",100.0);

        System.out.println("groceryPriceMap.size() = " + groceryPriceMap.size() );
        System.out.println("groceryPriceMap = " + groceryPriceMap);
 */
/*
File: /src/day63/WordFrequency.java, Line(s): 1-20
package day63;

public class WordFrequency {

    public static void main(String[] args) {

        String str = "Finding Words Frequency Sounds Fun Because Fun Comes in When you count Words" +
                " But How do I count the Words with what I already know previously " +
                "Do it and find out Words Words Words";
    }
}
 */
/*
File: /src/day63/WordFrequencyFromTheFile.java, Line(s): 14-20
try {
            List<String> allLines = Files.readAllLines(Paths.get("src/day63/map.txt"));
            System.out.println("allLines = " + allLines);

        } catch (IOException e) {
            System.out.println("ERROR@@@!!!!!");
        }
 */
/*
File: /src/day63/ListToMapPractice.java, Line(s): 23-33
List<String> names = new ArrayList<>();
        names.add("Abraham Hope");
        names.add("Zeliha Sezer");
        names.add("Tugba Bekar");
        names.add("Birnigar Ozyurt");
        names.add("Seda Civan");
        names.add("Nuran Demir");
        names.add("Murat Kilinc");
        names.add("Hakan Durmus");
        names.add("Nuran Demir");
        names.add("Mariia Lukianenko");
 */