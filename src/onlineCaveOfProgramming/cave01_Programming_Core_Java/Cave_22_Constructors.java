package onlineCaveOfProgramming.cave01_Programming_Core_Java;

class Machine {
    private String name;
    private int code;

    public Machine() { // Constructor always has same name as class.
        // calling another constructor has to be at the top.
        this("some text", 0); // Im calling 3rd constructor to run here as well.
        System.out.println("Constructor running!");

        name = "Arnie"; // if this was run all names would initially be set to Arnie
        System.out.println(name);
    }
    public Machine(String name) {
        System.out.println("Second constructor running!");
        this.name = name;
    }
    public Machine (String name, int code){
        System.out.println("Third cnstructore running!");
        this.name = name;
        this.code = code;
    }
}

public class Cave_22_Constructors {
    public static void main(String[] args) {
        new Machine(); // new Machine is what is calling the constructor.
        Machine machine1 = new Machine(); // 1st Constructor // also 3rd since we called it as well.

        // since this is a String it will call the constructor that accepts a String
        Machine machine2 = new Machine("Any String"); // 2nd Constructor

        // Java automatically accepts the right constructor depending of the parameters
        Machine machine3 = new Machine("Some String", 7); // 3rd constructor
    }
}
/*
class Machine {
    private String name;
    private int code;

    public Machine() {
        this("Arnie", 0);

        System.out.println("Constructor running!");
    }

    public Machine(String name) {
        this(name, 0);

        System.out.println("Second constructor running");
        // No longer need following line, since we're using the other constructor above.
        //this.name = name;
    }

    public Machine(String name, int code) {

        System.out.println("Third constructor running");
        this.name = name;
        this.code = code;
    }
}

public class App {
    public static void main(String[] args) {
        Machine machine1 = new Machine();

        Machine machine2 = new Machine("Bertie");

        Machine machine3 = new Machine("Chalky", 7);
    }

}
 */
