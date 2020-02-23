package day64;

public class Notes {
    public static void main(String[] args) {


    }
}
/*
File: /src/day64/MapKeySetView.java, Line(s): 1-53
package day64;

import java.util.*;

public class MapKeySetView {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
        // Map view :
            // keySet view , values view , entrySet view
    // How do I store all the keys into a Collection ?
        // what do you think the data type will be to store such collection ?
        // --- Set  because keys are unique

        // we can use keySet() method of Map to get Set of Keys
        // this Set is strictly connected to thr original map
        // if you remove an item , map entry with this key will be also removed
        Set<String> allNames = groceryPriceMap.keySet();
//        System.out.println("allNames = " + allNames);
//        allNames.remove("Tomato");
//        System.out.println("allNames no tomato = " + allNames);
//
//        System.out.println("groceryPriceMap after = " + groceryPriceMap);
    // WHAT IF WE DO NOT WANT SUCH RELATIONSHIP AND WE JUST WANT TO USE THE KEYS SOMEWHERE ELSE ?
        // GET A COPY OF THE SET into different Object
        Set<String> namesCopy = new HashSet<>(allNames);
        namesCopy.remove("Tomato");
        System.out.println("namesCopy = " + namesCopy);
        System.out.println("groceryPriceMap = " + groceryPriceMap);
    }
}
 */
/*
File: /src/day64/MapKeySetView_MapIteration.java, Line(s): 1-36
package day64;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapKeySetView_MapIteration {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap.get(\"Apple\") = " + groceryPriceMap.get("Apple") );
        // Map is not iterable so we can not directly iterate over them
        // we can get something iterable out of the map
        // for example keySet view will return a Set<String> and it's iterable

        Set<String> allNames = groceryPriceMap.keySet();

        for(String eachName : allNames){
            System.out.print("eachName = " + eachName);
            System.out.println(" | value is " + groceryPriceMap.get( eachName )   );
        }
    }
}
 */
/*
File: /src/day64/Map_valuesView.java, Line(s): 22-22
Collection<Double> allPrices = groceryPriceMap.values();
 */
/*
// HOMEWORK : FILL UP THIS LIST OF MAP USING FILE DATA
 */