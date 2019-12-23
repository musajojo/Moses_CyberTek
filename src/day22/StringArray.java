package day22;

public class StringArray {
    public static void main(String[] args) {

        // create an String array with size that you define
        // and store all your household member names

        String [] houseNames = new String [5];

        houseNames [0] = "Moses";
        houseNames [1] = "Walaa";
        houseNames [2] = "Taita";
        houseNames [3] = "Ahmed";
        houseNames [4] = "Asiya";

        System.out.println(houseNames[0]);
        System.out.println(houseNames[1]);
        System.out.println(houseNames[2]);
        System.out.println(houseNames[3]);
        System.out.println(houseNames[4]);

        // immutable means you can not change the internal structure of the object
        // if you have String abc = "Hello"
        // if you do abc.toUppercase -->> it will create new String object "HELLO"
        // and it does not change original hello at all !!

        // not resizable --> specifically for array
        // we can not change the size of array once we create them with certain size
        // However , we can change the elements inside this array
        // and it means : IT IS NOT IMMUTABLE
    }
}
