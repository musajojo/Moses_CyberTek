package day21;

public class NameBreaker {
    public static void main(String[] args) {

        //             012345678
        String name = "Nursultan";

        for (int x = 0; x < name.length(); x++) {
            char currentChar = name.charAt(x);

            if (currentChar == 'l'){
                System.out.println("Found it!!!");
                break;
            }
            System.out.println(currentChar);
        }





    }
}
