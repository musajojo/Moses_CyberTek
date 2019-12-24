package day32;

public class NumComparison {

    public static String numberComparison(int num1, int num2){

 // Practice Comparison. Not mien

        if(num1 > num2) {
            return num1 + " is greater than " + num2;
        } else if (num2 > num1) {
            return  num2 + " is greater than " + num1;
        } else if(num1 == num2) {
            return num1 + num2 + " are equal ";
        }
        return "Nothing to compare";
    }

    public static void main(String[] args){

        System.out.print(numberComparison(5,6));

    }
}
