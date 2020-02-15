package onlineCourseProffesso;

import java.util.Calendar;
import java.util.Date;

public class Video_4_Control_Structures_Part_II {
    public static void main(String[] args) throws InterruptedException {

        // for loops are used -> finite data
        // loop 10 times
        // for (start ; end ; increment)
        // i = i + 1 exact same thing as i++
        for (int i = 0; i < 10; i++ ){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Nested For loop");
        // will run 100 times
        for (int i = 0; i < 10; i++ ){
            for (int j = 0; j < 10; j++){
                System.out.println(j);
            }
        }
        // will run 81 times
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                System.out.println(j);
            }
        }
        // will run 225 times
        for (int i = 0; i < 15; i++){
            for (int j = 0; j < 15; j++ ){
                System.out.println(j);
            }
        }

        System.out.println();
        System.out.println("While Loops");
        // while loops
        // not finite
        // import java.util.Date;
        // this will be date/time right when it's executed

        // this is current date and will be different time every time it is run
        Date today = new Date();
        System.out.println(today);

        Calendar cal = Calendar.getInstance();
        // change time according to current date and time
        cal.set(2020, 0, 15, 13, 10);
        while (today.before(cal.getTime())){
            System.out.println("Waiting");
                // this slows down the runtime printout by how ever much time is in the () below: Thread.sleep(1000);
            Thread.sleep(1000);
            today = new Date();
            System.out.println(today);
        }
        System.out.println("Done");
    }
}
