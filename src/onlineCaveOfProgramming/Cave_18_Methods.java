package onlineCaveOfProgramming;

class Persons {

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
        Persons persons1 = new Persons();
        persons1.name = "Joe Bloggs";
        persons1.age = 37;
        persons1.sayHello();
        persons1.speak();

        // Create a second Persons object
        Persons persons2 = new Persons();
        persons2.name = "Sarah Smith";
        persons2.age = 20;
        persons2.sayHello();
        persons2.speak();

        System.out.println(persons1.name);
    }
}
