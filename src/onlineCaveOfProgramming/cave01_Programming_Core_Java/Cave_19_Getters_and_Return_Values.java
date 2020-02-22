package onlineCaveOfProgramming.cave01_Programming_Core_Java;

class PersonThree {
    String name;
    int age;
    void speak (){
        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
    }
    // void calculateYearsToRetirment () { // This is a method to calculate
    // a void does not return anything. in order to return I need to change.
    // If I want it to return I change method to an int in this case
    int calculateYearsToRetirment () { // This method returns a value of type int
        int yearsLeft = 65 - age; // this is the value yearsLeft
        // System.out.println(yearsLeft); // commented out with the int calculateYearsToRetirment () {

        return yearsLeft; // this is the return. It leaves the method when you put return.
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
}
public class Cave_19_Getters_and_Return_Values {
    public static void main(String[] args) {

        PersonThree personThree1 = new PersonThree();
        personThree1.name = "Joe";
        personThree1.age = 25;
        personThree1.speak(); // This one acquires the info from the class PersonThree

        System.out.println(".........");
        // This originally was made for the void void calculateYearsToRetirment () {. It does the calculating already.
        personThree1.calculateYearsToRetirment();
        System.out.println();
        int years = personThree1.calculateYearsToRetirment(); // years is = to the return value not the method itself
        System.out.println("Years till retirement " + years);

        System.out.println(".........");

        int age = personThree1.getAge(); // these get info from the get methods that return things
        String name = personThree1.getName(); // these get info from the get methods that return things

        System.out.println("Name is: " + name);
        System.out.println("age is: " + age);
    }
}
/*
class Person {
    String name;
    int age;

    void speak() {
        System.out.println("My name is: " + name);
    }
    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;

        return yearsLeft;
    }
    int getAge() {
        return age;
    }
    String getName() {
        return name;
    }
}
public class App {

    public static void main(String[] args) {
        Person person1 = new Person();

        person1.name = "Joe";
        person1.age = 25;

        // person1.speak();

        int years = person1.calculateYearsToRetirement();

        System.out.println("Years till retirements " + years);

        int age = person1.getAge();
        String name = person1.getName();

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }
}
 */
