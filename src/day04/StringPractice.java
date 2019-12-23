package day04;

public class StringPractice {

    public static void main(String[] args) {

        String firstName = "Moses ";
        String lastName = "Dee ";

        String fullName = firstName + "" + lastName;

        System.out.println( "my first name is " + firstName);
        System.out.println( "my last name is " + lastName);

        String productName = "Fire ";
        String model = "HD";
        int version = 8;
        float price = 79.99f;
        System.out.println("I saw "+ productName + model + version + " " + "It costs "+ price);

    }
}
