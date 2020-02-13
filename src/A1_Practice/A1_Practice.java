package A1_Practice; import javax.swing.*;
import java.util.*; public class A1_Practice
{ public static void main(String[] args) {Scanner scan = new Scanner(System.in);
    // above stays all the time //

    int [] nums = new int[] {2, 3, 5, 10, 54, 26};
    int [] otherNums = {5, 2, 7};
    int [] busNumbers = new int[5];

    busNumbers [0] = 27;
    busNumbers [1] = 68;
    busNumbers [2] = 03;
    busNumbers [3] = 16;
    busNumbers [4] = 56;

    System.out.println(nums[3]);
    System.out.println(busNumbers[1]);

    System.out.println();

    for (int otherNum:otherNums) {
        System.out.println(otherNum);
    }
    System.out.println();



}
}
