package onlineCaveOfProgramming.cave01_Programming_Core_Java;

class PersonOne {

    // Instance variables (data or "state")
    String name;
    int age;

    // Class can contain

    // 1. Data
    // 2. Subroutines (methods)
}

public class Cave_17_Classes_and_Objects {
    public static void main(String[] args) {

        PersonOne personOne1 = new PersonOne();
        personOne1.name = "Joe Bloggs";
        personOne1.age = 37;

        PersonOne personOne2 = new PersonOne();
        personOne2.name = "Sarah Smith";
        personOne2.age = 20;

        System.out.println(personOne1.name);
    }
}
