package day03;

public class PrimitivesPractice {

    public static void main(String[] args) {

        byte letterCount = 26;
        System.out.println("The letter line is " + letterCount);

        short sheepCount = 300;
        System.out.println("The sheep count " + sheepCount);

        int catCount = 20;
        System.out.println("The Cat count " + catCount);

        long mileTomoon = 5000000l;
        System.out.println("Miles to moon " + mileTomoon);

        long mileToSun = 10000000L;


        //----floating point----
        //you must add f or F at the front of the number to indicate this is a float data type

        float priceOfBanana = 1.99f;
        float priceOfPotato = 2.49F;

        //-----larger floating point numbers----

        double priceOfIpad1 = 355.99d;
        double priceOfIpadPro = 1024.99D;

        // compiler automatically assumes it is a double so it is not reqired to have a d

        double priceOfMac = 2299.99;

        // If you have a whole number by itself, compiler automatically assumes it's an int
        // If you have a fraction number by itself, compiler automatically assumes it's a double




    }
}
