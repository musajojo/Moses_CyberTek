package day62;

public class Note {
    public static void main(String[] args) {


    }
}
/*
package day62;

import java.util.*;

public class SetInterface2 {

    public static void main(String[] args) {

        // Creating a HashSet with items already inside

        List<Integer> numList = Arrays.asList(10,10,20,20,20,30,30,30,30);

        Set<Integer> myNums = new HashSet<>();
    }
}
 */
/*
package day62;

import java.util.*;

public class SetInterface2 {

    public static void main(String[] args) {

        // Creating a HashSet with items already inside

        List<Integer> numList = Arrays.asList(10,10,20,20,20,30,30,30,30);
        System.out.println("numList = " + numList);

        Set<Integer> myNumSet = new HashSet<>( numList  );
        System.out.println("myNumSet = " + myNumSet);
    }
}
 */
/*
 // Set is a data structure to store unique elements :
        // HashSet implements Set interface and always default choice
        // IT DOES NOT KEEP INSERTION ORDER
        // IT DOES NOT HAVE INDEX
 */
/*
// REMEMBER : In HashSet THERE IS NO DEFINED ORDER !!!!!!!!!!!!!!!!!!!!!!
        //  YOUR OUTPUT CAN BE IN ANY ORDER JAVA DESIRE
        // You can use all the methods coming from Collection interface
 */
/*
package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOfUniqueStates_Deleting {

    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("GA", "NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));
        System.out.println("states before = " + states);
        states.remove("GA");
        System.out.println("states after  = " + states);
    }
}
 */
/*
package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfUniqueStates_Deleting {

    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("GA", "NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));
        System.out.println("states before = " + states);
//        states.remove("GA");
//        System.out.println("states after  = " + states);

//      remove all the states with letter A
        Iterator<String> stIter = states.iterator();
        // Iterator has 3 methods hasNext() next() remove() works together
        // to remove item while iterating over a collection

        while (stIter.hasNext()) {

            // PLEASE DO NOT CALL NEXT METHOD TWICE IN ONE ITERATION OR IT WILL SKIP TO NEXT ITEM
            if (stIter.next().contains("A")) {
//                System.out.println("removing = " + stIter.next());
                stIter.remove();
            }

        }
        System.out.println("states after   = " + states);
        //        while (stIter.hasNext() ){
////
////            String each = stIter.next();
////            if(each.contains("A") ){
////                System.out.println("removing = " + each);
////                stIter.remove();
////            }
////
////        }
//        System.out.println("states after   = " + states);
//
//        System.out.println("stIter.hasNext() = " + stIter.hasNext() );
        // IF YOU TRY TO GET THE NEXT ITEM THAT YOU DO NOT HAVE USING ITERATOR
        // YOU WILL GET NoSuchElementException
//        System.out.println("stIter.next() = " + stIter.next());


//        // The Lambda expression way of removing
//        states.removeIf( each -> each.contains("A")  );
//        System.out.println("states after   = " + states);
    }
}
 */
/*
Set<Integer> myNums = new LinkedHashSet<>();
        myNums.add(10);
        myNums.add(10);
        myNums.add(22);
        myNums.add(13);
        myNums.add(13);
        myNums.add(30);
        myNums.add(30);
 */
/*
package day62;

import java.util.*;

// primary difference between HashSet and LinkedHashSet is LinkedHashSet keep insertion order
// HashSet is always way faster since it has less responsibility

public class LinkedHashSetImplementation {

    public static void main(String[] args) {

        // If you want to keep insertion order( first come first serve )
        // and it also remove duplicates
        // It's sub class of HashSet
        Set<Integer> myNums = new LinkedHashSet<>();
        myNums.add(10);
        myNums.add(10);
        myNums.add(22);
        myNums.add(13);
        myNums.add(13);
        myNums.add(30);
        myNums.add(30);

        System.out.println("myNums LinkedHashSet = " + myNums);

        Set<Integer> myNums2 = new HashSet<>();
        myNums2.add(10);
        myNums2.add(10);
        myNums2.add(22);
        myNums2.add(13);
        myNums2.add(13);
        myNums2.add(30);
        myNums2.add(30);

        System.out.println("myNums2 HashSet = " + myNums2);
    }
}
 */
/*
package day61;

// Comparable interface is coming from java.lang package
// in order to sort a type , it has to be Comparable
// so the class of that type must implements Comparable<Type>
// to provide comparing logic , this will become natural order for sorting

// POJO : Plain Old Java Object | Usually used to represent data
public class Job implements Comparable<Job> {

    private String location;
    private double salary;
    private String companyName;

    public Job(String location, double salary, String companyName) {
        this.location = location;
        this.salary = salary;
        this.companyName = companyName;
    }
    @Override
    public int compareTo(Job other) {

        if (this.salary > other.salary) {
            return 1;
        } else if (this.salary < other.salary) {
            return -1;
        } else {
            return 0;
        }
    }
    @Override
    public String toString() {
        return "Job{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
 */
/*
How does HashSet know what's duplicate? HOT INTERVIEW QUESTION
 */
