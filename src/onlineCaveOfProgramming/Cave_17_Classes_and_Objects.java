package onlineCaveOfProgramming;

class Person{

    // Instance variables (data or "state")
    String name;
    int age;

    // Class can contain

    // 1. Data
    // 2. Subroutines (methods)
}

public class Cave_17_Classes_and_Objects {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.age = 37;

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;

        System.out.println(person1.name);
    }
}
