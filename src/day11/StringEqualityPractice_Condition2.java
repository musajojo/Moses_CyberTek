
package day11;
public class StringEqualityPractice_Condition2 {
    public static void main(String[] args) {

        /*
         *check the value of myStr
         * if it is Java -->> correct word
         * if it is Cava -->> Pumpkin!!
         */

        String myString ="cava";
        if (myString.equals("java")) {
            System.out.println(" Say correct word");
        } else if ( myString.equals("cava")){
            System.out.println(" Say Pumpkin ");
        } else {
            System.out.println(" Say not Java nor pumpkin");
        }
    }
}
