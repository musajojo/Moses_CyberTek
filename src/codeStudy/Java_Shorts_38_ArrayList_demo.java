package codeStudy;
import java.util.ArrayList;
import java.util.List;
public class Java_Shorts_38_ArrayList_demo {
    public static void main(String[] args) {

        //Creating an ArrayList object
        ArrayList<String> lst = new ArrayList<>();
        //List<String> lst1 = new ArrayList<>();

        // adding elements
        lst.add("Apple"); lst.add("Orange"); lst.add("Bannana");
        System.out.println(lst);
        // getting elements
        System.out.println("fist element "+ lst.get(0));
        System.out.println("second element "+ lst.get(1));

        //checking if item exists in the list
        System.out.println("Does list contain Apple? "+lst.contains("Apple"));
        System.out.println("Does list contain Pear? "+lst.contains("Pear"));

        // getting the index of an item by value indexOf(item)
        System.out.println("index of Apple "+lst.indexOf("Apple"));

        // checking how many item in the list size()
        System.out.println("item count "+lst.size());

        // checking if the list is empty isEmpty()
        System.out.println("list is empty ? "+lst.isEmpty());

        // setting value for certain index
        lst.set(1, "Pear");
        System.out.println("new list items "+lst);

        // remove item by index
        lst.remove(0);
        System.out.println("new list items after deleting"+lst);

        // remove item by value
        lst.remove("Bannana");
        System.out.println("new list items after deleting "+lst);

        // remove all the items in the list
        lst.clear();
        System.out.println("new list items after clearing "+lst);

        //checking if the list is empty or not
        System.out.println("list is empty "+lst.isEmpty());
    }
}
