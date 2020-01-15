package onlineCourseUdemy;

public class S03_FirstSteps3_28 {
    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = "+myMinFloatValue);
        System.out.println("Float maximum value = "+myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = "+myMinDoubleValue);
        System.out.println("Double maximum value = "+myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5.00/3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds*0.45359237d;
        System.out.println(numberOfPounds+" Pound is equal to "+convertedKilograms+" kgs");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

        System.out.println();
        System.out.println("String Lesson:");
        System.out.println();

        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a String";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        double doubleNumber = 12.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);


    }
}
