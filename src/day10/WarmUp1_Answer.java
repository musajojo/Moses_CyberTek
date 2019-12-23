package day10;

public class WarmUp1_Answer {

    public static void main(String[] args) {

        String myAnswer = "";
        int myNumber = 46;

        if (myNumber % 5 == 0) {
            myAnswer = "Fizz Number";
        } else {
            myAnswer = "not a Fizz Number";
        }

        System.out.println("print my number is " + myNumber + " , It is  " + myAnswer);

        /*
        Create a class called Answer with main
Create a variable called myAnswer as String with value of empty string
Create a variable called myNumber and assign any value
If the number can be divided by 5 without remainder
Assign myAnswer value to Fizz Number
If not assign the value to not a Fizz Number
Outside if else statement :
print my number is <> , It is  <value of myAnswer here>
         */
    }
}