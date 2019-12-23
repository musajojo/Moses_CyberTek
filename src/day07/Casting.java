package day07;

public class Casting {

    public static void main(String[] args) {

      //int num = 10;

        //run is 10.0 - int 10 is implicitly ()automatically converted to double 10.0
        // and stored inside bigNum behind scene
      double bigNum = 10;
        System.out.println(bigNum);

        // 12.99 is double , double has much bigger range than int
        // so it just does not fit
        // int num = 12.99 ; // compiler error!!!!

        //double num = 12.99;
        int num = (int) 12.99; //storing large data type in a smaller data type
        System.out.println(num);

        //create a long variable and store int
        long earthToMoon = 10000; // --->> 10000L

        // create a int variable and try to store above long value
        int earthToMoonIn_ship = (int) earthToMoon; //with out (int) it turns red. hover over and cast into int.

        System.out.println(earthToMoonIn_ship);








    }
}



