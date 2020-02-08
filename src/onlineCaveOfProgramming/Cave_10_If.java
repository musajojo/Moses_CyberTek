package onlineCaveOfProgramming;

public class Cave_10_If {
    public static void main(String[] args) {

        int myInt = 20;

        boolean cond1 = 3 > 8;
        boolean cond2 = 5 != 5; // ! means Not equal to
        boolean cond3 = 5 == 5; // == is for equality. testing equality
        // a single = is for assignment and setting something equals something
        boolean cond4 = 3 == 8;

        System.out.println(cond1);
        System.out.println(cond2);
        System.out.println(cond3);
        System.out.println(cond4);

        System.out.println("If Statement");

        if (4 == 4){
            System.out.println("Yes, it's true");
        }
        if (5 != 5){ // nothing prints since it is false in this case
            System.out.println("Yes, it's true");
        }

        if (myInt < 30){
            System.out.println("Yes, it's true");
        }

        System.out.println("If Statement along with else");

        if (myInt < 10){
            System.out.println("Yes, it's true");
        }else{
            System.out.println("No, its's false");
        }

        System.out.println("If Statement along with else if");

        if (myInt == 10){
            System.out.println("Yes, it's true");
        }else if(myInt == 20){
            System.out.println("Correct");
        }
        System.out.println("If Statement along with else if and else");

        if (myInt > 20){
            System.out.println("Yes, it's true");
        }else if(myInt < 20){
            System.out.println("No, its's false");
        }else{
            System.out.println("None of the above");
        }
        System.out.println();
        System.out.println("Using Loop\n");

        int loop = 0;
        while(true){ // this is an infinite loop since its always true
            System.out.println("Looping: " + loop);
            if (loop == 5) {
                break; // break means stop.
                // in this situation the criteria has been met
                // and the program hit break and stopped the infinite loop,
                // nothing after it can run anymore.
            }
            loop++;
            System.out.println("Running");
        }

    }
}
