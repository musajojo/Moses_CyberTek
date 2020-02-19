package day61;

public class Note {
    public static void main(String[] args) {
        /*
        LinkedList VS ArrayList
	Internally
		ArrayList is backed by array
		LinkedList is backed by Node
		Node : an object that contains value
			plus the pointer to its neighbour
	getting random item by index
			ArrayList is better
	adding removing items
			LinkedList is better
Big O(read as oh) Notation :
	this is a way programmers describe
	the performace of an algorithm
	time complexity
	O(1) means the more elements you have
	in the list , it does not change
	the performance
	O(N) means the more elements you have
	in the list , it takes more time
	performance-wise
         */
        /*
        package day61;

// Comparable interface is coming from java.lang package
// in order to sort a type , it has to be Comparable
// so the class of that type must implements Comparable<Type>
// to provide comparing logic , this will become natural order for sorting

// POJO : Plain Old Java Object | Usually used to represent data
public class Job implements Comparable<Job>{

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

        if(this.salary> other.salary){
            return 1 ;
        }else if (this.salary< other.salary){
            return -1 ;
        }else{
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
        TASK:

        Please create Job class
	location
	salary
	companyName
	encapsulate all the fields
	add constructor to set all the filedd value
	add toStirng method
Let this class implements Comparable interface
	and add comparing logic of by salary
Create a class called JobHunter with main method
Create a LinkedList of Jobs
and store your favorite 5 Jobs
assign it to jobList varibale with List<Job> reference
sort them and print out before and after
         */
        /*
        LinkedList VS ArrayList
	Internally
		ArrayList is backed by array
		LinkedList is backed by Node
		Node : an object that contains value
			plus the pointer to its neighbour
	getting random item by index
			ArrayList is better
	adding removing items
			LinkedList is better
Big O(read as oh) Notation :
	this is a way programmers describe
	the performace of an algorithm
	time complexity
	O(1) means the more elements you have
	in the list , it does not change
	the performance
	O(N) means the more elements you have
	in the list , it takes more time
	performance-wise
--------------------
Please create Job class
	location
	salary
	companyName
	encapsulate all the fields
	add constructor to set all the fileds value
	add toStirng method
Let this class implements Comparable interface
	and add comparing logic of by salary
Create a class called JobHunter with main method
Create a LinkedList of Jobs
and store your favorite 5 Jobs
assign it to jobList varibale with List<Job> reference
sort them and print out before and after
How do you Compare 2 Person objects with name and age
by both age and name :
{Hasan , 34 }
{Nelishan , 18 }
{Fatih , 34 }
{Mohammed , 21 }
lets sort them by age asc then by name asc
{Nelishan , 18 }
{Mohammed , 21 }
{Fatih , 34 }
{Hasan , 34 }
lets sort them by name desc then by age asc
{Nelishan , 18 }
{Mohammed , 21 }
{Hasan , 34 }
{Fatih , 34 }
         */
    }
}
