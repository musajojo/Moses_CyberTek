package day54.interface_as_reference;
// Day 54 : Polymorphic method parameter and return type , List with Interface as data type Wearable
import java.util.Arrays;
import java.util.List;

public class Utility2 {


    public static void main(String[] args) {


        Wearable w1 = new Clothes();
        Wearable w2 = new Makeups();
        Wearable w3 = new Watch();
        Wearable w4 = new Perfume();

        List<Wearable> myList = Arrays.asList(w1, w2, w3, w4);

        for (Wearable each : myList) {

            each.wear();

        }


    }


}