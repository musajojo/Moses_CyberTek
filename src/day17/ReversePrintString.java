package day17;

public class ReversePrintString {
    public static void main(String[] args) {
        // get your name printed in reversed order
        // assuming we dont know the length

        // find out the location of your last character of your name
        // pick your last character of your name accordiing yo the location
        // then keep shifting the location to pick until first chracter

        //             01234567    index = count - 1
        String name = "Birnigar";
        //             12345678    count = name.length()

        //int lastCharacterIndex = name.length()-1 ;
        int x = name.length()-1 ;

        while (x >=0){
            System.out.println("index "+ x+" : "+name.charAt(x));
            --x;
        }

    }
}
