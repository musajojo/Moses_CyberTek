package day05;
import java.text.DecimalFormat;
public class RoundingToTwoDecimalsOrMore {
    public static void main(String[] args) {
        //This was not part of our lessons as of day05. I added this one myself from youtube (TanUv90)

        // How to round to the nearest two digits or what ever you want.
        // Java only goes to about 16 digits even if there are more

        System.out.println("Example 1");
        double numbers1 = 3.14159265358979323846264338;
        System.out.println(numbers1);
        double rounded1 = Math.round(numbers1);
        // this method only rounds to the nearest whole.
        System.out.println("numbers1 = " + rounded1);

        // To show decimals some multiplication and division is needed
        // Multiply inside by 100 than devid outside my 100.0 that will give you the decimals
        // For more decimal places add more zeros 0000 in and outside the parenthesis.
        double rounded2 = Math.round(numbers1 * 100)/100.0;
        System.out.println("numbers1 = " + rounded2);


        System.out.println(" ");

        System.out.println("Example 2");
        double numbers2 = 3.14159265358979323846264338;
        System.out.println(numbers2);
        // note printf f is for float number. int is d the youtube guy was not sure.
        // System.out.printf("%F" + "\n", numbers2); add .2 (for two decimals) between the %f
        // This allows you to format
        System.out.printf("%f" + "\n", numbers2); // notice we got 6 decimals by default
        System.out.printf("%.2f" + "\n", numbers2); // her we get 2 decimals. change number as needed.

        System.out.println(" ");

        System.out.println("Example 3");
        double numbers3 = 3.14159265358979323846264338;
        System.out.println(numbers3);

        // imported DecimalFormat above
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        // ("#.##") would also work.
        // for more decimals add more zeros 000
        String formatted = decimalFormat.format(numbers3);
        System.out.println("formatted = " + formatted);
    }
}
