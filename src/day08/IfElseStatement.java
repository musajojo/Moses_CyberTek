package day08;

public class IfElseStatement {
    public static void main(String[] args) {

        int speedLimit = 60;

        int yourCurrentSpeed = 45;

        // if the yourCurrentSpeed is over more than speed limit
        // get pulled over by the police
        // given a ticket by the police
        // taken away some points on your license
        // go to court

        boolean iAmSpeeding = yourCurrentSpeed > speedLimit;
        // Instead Parenthesis we can only put
        // Boolean Value : true false
        // Boolean Variable
        // Any Expression that return boolean value

        //if (iAmSpeeding) {
        //if (true) {
        if (yourCurrentSpeed > speedLimit) {
            System.out.println("get pulled over by the police");
            System.out.println("given a ticket by the police");
            System.out.println("taken away some points on your license");
            System.out.println("go to court");
        } else {
            System.out.println("go shopping");
            System.out.println("buy ice cream");
            System.out.println("enjoy your day");
        }
        System.out.println("The End");
        // if not ove the limit
        // go shopping !!

        // outside iff statement , say the end




    }
}
