package day11;

public class StringEquality {
    public static void main(String[] args) {

        String name = "Rabia"; //String literal
        String name2 = new String("Rabia"); //
        String name3 = "Rabia";

        System.out.println(name);
        System.out.println(name2);

        System.out.println("Using == Methods");
        System.out.println(name==name2);
        System.out.println(name==name3);

        // The correct way of comparing String to get consistant result is
        // using one of the String object behaviour / method called
        // equals method
        // strl.equals(str2)

        System.out.println("Using Equals Methods");
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));

        // Bottom Line Is: Do not ever use == To Check String Equality
    }
}
