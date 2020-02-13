package day58;

import java.util.*;

public class OutOfMemoryDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(999999999);

        for (int i = 1; i > 0 ; i++) {
            //System.out.println(i);
            nums.add(i);
        }
    }
}
/*
package day57_exceptions2;
import java.util.*;

public class OutOfMemoryDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(999999999);

        for (int i = 1; i > 0 ; i++) {
            //System.out.println(i);
            nums.add(i);
        }
    }
}
 */