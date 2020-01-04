package day08;

public class MultiBranchIfStatement2 {

    public static void main(String[] args) {
        /*
    *  //pseudo| sudo code
        /*
        * given your currentSpeed , speedLimit
        *
        * check whether the current speed is
        *
        *   more than 90  -->> jail
        *   more than 80 and less than 90  --> reckless driving
        *   more than 70 and less than 80  --> point taken
         *   more than 60 and less than 70  --> warning
        *   if not speeding keep driving
    *
    * */
         int currentSpeed = 60;

         if (currentSpeed>90) {
             System.out.println("Jail Time");
         }else if (currentSpeed>80) {
             System.out.println("reckless driving");
         }else if (currentSpeed>70){
             System.out.println("Point taken");
         }else if (currentSpeed>60){
             System.out.println("Warning");
         }else {
             System.out.println("Keep Driving");
         }

    }

}