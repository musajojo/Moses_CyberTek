package office_hour.oh_20200319;

import java.util.HashMap;
import java.util.Map;
public class MapPractice {
    public static void main(String[] args) {
        // Take home task : create a Map of ProductName, Price --
        // using selenium to get all the data
        // and store it into Your Map
        // Also try to create Map of Product name and name length
        //
        // Is Map Iterable (does Map interface extend Iterable , Collection interface) : NO!!!!!!
        // anything not iterable we can not use foreach loop
        Map<String,String> nameStatePair = new HashMap<>(); // LinkedHashMap for keeping insertion order
        nameStatePair.put("Faitih","FL");
        nameStatePair.put("Zhibeckchach","IL");
        nameStatePair.put("Vlad","SC");
        nameStatePair.put("Hasan","NY");
        nameStatePair.put("Omer","TX");
        nameStatePair.put("Atakan","GA");
        System.out.println("nameStatePair = " + nameStatePair);
        //
    }
}