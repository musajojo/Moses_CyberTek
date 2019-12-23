package day22;

public class ArrayIntro_Task {
    public static void main(String[] args) {

        // create an byte array with size 4
        // and store it into a variable called data
        // assign value for each index location
        // print out the values at each index
        // update last index value
        // then print it out

        byte [] data = new byte[4];
        data [0] = 20;
        data [1] = 5;
        data [2] = 100;
        data [3] = 76;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        data[3] = 127;
        System.out.println(data[3]);

    }
}
