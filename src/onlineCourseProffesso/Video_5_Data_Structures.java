package onlineCourseProffesso;
import java.util.*;
public class Video_5_Data_Structures {
    public static void main(String[] args) {

        System.out.println("Array:");
        // size needs to be defined in Array. Array is immutable.
        char [] charArray = new char [5];

        charArray[0] = 'H';
        charArray[1] = 'E';
        charArray[2] = 'L';
        charArray[3] = 'L';
        charArray[4] = 'O';

        // for each loop.
        // for (char c : charArray ) {
        // System.out.print(c);}

         // for loop
         for (int i = 0; i < charArray.length; i++){
            System.out.print(charArray[i]);}

        System.out.println("\n"+ charArray[4]);
         // 5 is out of bounds will cause error upon running code
        // System.out.println(charArray[5]);

        // sort Array. Java has many different operations it can do just look for them and have fun.
        Arrays.sort(charArray);
        System.out.print("Array sorted: ");
        for (char c : charArray){
            System.out.print(c);
        }



        System.out.println("\n"+"---------------------------------------------------------");
        System.out.println("List or Array List:");
        // size does not need to be defined from the list. Is mutable.
        //ArrayList arrayList = new ArrayList();
        // No primitive type in Array list only Objects

        List<Character> arrayList = new ArrayList<Character>();
        arrayList.add('H');
        arrayList.add('E');
        arrayList.add('L');
        arrayList.add('L');
        arrayList.add('0');
        arrayList.add('!');
        // The ! is removed from list
        arrayList.remove(5);
        for (Character c : arrayList) {
            System.out.print(c);
        }


//        List<String> arrayList = new ArrayList<String>();
//        arrayList.add("H");
//        arrayList.add("E");
//        arrayList.add("L");
//        arrayList.add("L");
//        arrayList.add("0");
//        arrayList.add("!");
//        for (String s : arrayList) {
//            System.out.print(s);
//        }
        System.out.println("\n"+"---------------------------------------------------------");
        System.out.println("Map:");
        // Map has a --> Key : Value.
        // Car Example: Key --> Make of car (Toyota) and Value --> is Model of car (Rav4)
        Map<String, List<String>> makeModel = new HashMap<String, List<String>>();
        List<String> hondaList = new ArrayList<String >();
        hondaList.add("Civic");
        hondaList.add("Prelude");
        //Key
        makeModel.put("Honda", hondaList);

        List<String> toyotaList = new ArrayList<String>();
        toyotaList.add("Corolla");
        toyotaList.add(("Rav4"));
        //Key
        makeModel.put("Toyota", toyotaList);

        // empty list just comes back as null.no errors
        System.out.println(makeModel.get("Honda"));
        System.out.println(makeModel.get("Toyota"));
        // asking if Ford is contained in the Map true/false
        System.out.println(makeModel.containsKey("Ford"));
        System.out.println(makeModel.get("Audi"));

        // many more things can be just type is --> makeModel. --> and look through list of operations Java does

        System.out.println("\n"+"---------------------------------------------------------");


    }
}
/*
package net.javavideotutorials.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStructures
{
	public static void main(String[] args)
	{
		Map<String, List<String>> makeModel = new HashMap<String, List<String>>();

		List<String> hondaList = new ArrayList<String>();
		hondaList.add("Civic");
		hondaList.add("Prelude");

		List<String> toyotaList = new ArrayList<String>();
		toyotaList.add("Corolla");
		toyotaList.add("Rav 4");

    makeModel.put("Honda", hondaList);
    makeModel.put("Toyota", toyotaList);

    System.out.println(makeModel.get("Honda"));
    System.out.println(makeModel.get("Toyota"));
    System.out.println(makeModel.get("Ford"));
    System.out.println(makeModel.get("Audi"));

    // Uncomment next line if you want to execute the arrayList code
    //arrayListMethod();

    // Uncomment next line if you want to execute the arrayList code
    //arrayMethod();
	}

	public static void arrayListMethod ()
	{
	  List<Character> arrayList = new ArrayList<Character>();

    arrayList.add('H');
    arrayList.add('E');
    arrayList.add('L');
    arrayList.add('L');
    arrayList.add('O');
    arrayList.add('!');

    arrayList.remove(5);

    for (Character s : arrayList)
    {
      System.out.print(s);
    }
	}

	public static void arrayMethod ()
	{
    char[] charArray = new char[5];

    charArray[0] = 'H';
    charArray[1] = 'E';
    charArray[2] = 'L';
    charArray[3] = 'L';
    charArray[4] = 'O';

    for (char c : charArray)
    {
      System.out.print(c);
    }
	}
}
 */