package office_hour.oh_20200219_Practice_02_19_2020;

public class Note {
    public static void main(String[] args) {
/*
package office_hour.Practice_02_19_2020;

import java.util.*;

public class IteratorPractice {

    public static void main(String[] args) {

//        -- Iterator -- see it as a tool to iterate over a collection
//        -- with basic functionality
//
//        in order to get an Iterator object we can call the method

        List<Integer> lst = new ArrayList<>(Arrays.asList(20,10,44,3,11));

        Iterator<Integer> numIter = lst.iterator();
        // 3 methods available : hasNext() , next() , remove
    }
}
 */
    }
}
/*
ArrayList VS LinkedList
ArrayList is backed by array
For get operation its faster
it can just directly jump into that index
add or remove , its slower
because we are resizing the array and shifting elements
LinkedList is backed by Node
	Node is an object that store value
	along with the address of neighbours
For get operation its slower
since it has to go through each and every node until it comes to the correct index
add or remove , its faster
because we just need to change the pointers
Big O notation is used to
 describe the performance(time complexity) of an algorithm
Array VS ArrayList
Array is fixed in size , can not be resized once being created
ArrayList can grow and shrink anytime
Array can store primitives and object
ArrayList can only store Object !!!!
		-- any primitive values will be wrapped into wrapper type object
		-- AUTOBOXED
Array can not be printed directly (need to use Arrays.toStirng(arrObject))
ArrayList (along with every other collection type in java)
	  can be printed directly to see whats inside(toStirng method overriden)
ArrayList has its own class and lots of ready method we can use
to easily manipulate data
Array :  it does not have convinient methods ready like ArrayList
			we can use Arrays utility class instead
  we use length property of Array object to count the items
  we use size() method of ArrayList to count the items
---------
List is the only ordered collection in entire collection framework
with index : NON OF THE OTHER COLLECTION TYPE PROVIDE INDEXED ACCESS!!!

-- Iterator -- see it as a tool to iterate over a collection
		-- with basic functionlity

in order to get an Iterator object we can call the method

		List<Integer> lst = new ArrayList<>(Arrays.asList(20,10,44,3,11));

		Iterator<Integer> numIter = lst.iterator();
		// 3 methods available : hasNext() , next() , remove
 */