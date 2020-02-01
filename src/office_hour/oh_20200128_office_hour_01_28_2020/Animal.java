package office_hour.oh_20200128_office_hour_01_28_2020;
// Day 49 : office hour 1_28_2020
public abstract class Animal implements Zoo {

    //1. no object creation

    int age;


    //infomation --> variable

    //variables ==> local , instance , static
    String color;
    String breed;

    //default constructor
    public Animal() {

    }


    //Actions --> method
    //method --> instance , constructor

    //concrete method
    public void eat() {
        System.out.println("The animal is eating ");
    }

    public void call() {
        System.out.println("The animal is calling .. ");
    }


    //what if we just declare a method that should be in child class, and they have different
    //body

    //abstract method == I want this method will be appear in both cat
    //and dog classes , yet they should have dofferent body
    public abstract void run();

}