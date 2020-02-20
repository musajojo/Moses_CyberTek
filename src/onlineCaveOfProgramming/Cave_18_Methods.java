package onlineCaveOfProgramming;

class PersonTwo {

    // Instance variable (data or "state")
    String name;
    int age;

    // Class can contain

    // 1. Data
    // 2. Subroutines (methods)
    void speak(){
        for (int i = 0; i < 3; i++) {
        System.out.println("My name is: " + name + " and I am " + age + " years old ");
        }
    }
    void sayHello(){
        System.out.println("Hello there!");
    }
}

public class Cave_18_Methods {
    public static void main(String[] args) {

        // Create a Persons object using the Persons class
        PersonTwo personTwo1 = new PersonTwo();
        personTwo1.name = "Joe Bloggs";
        personTwo1.age = 37;
        personTwo1.sayHello();
        personTwo1.speak();

        // Create a second Persons object
        PersonTwo personTwo2 = new PersonTwo();
        personTwo2.name = "Sarah Smith";
        personTwo2.age = 20;
        personTwo2.sayHello();
        personTwo2.speak();

        System.out.println(personTwo1.name);
    }
}
