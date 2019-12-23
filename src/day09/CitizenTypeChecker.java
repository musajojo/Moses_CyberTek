package day09;

public class CitizenTypeChecker {
    public static void main(String[] args) {
/*        // Task 2
        Create a class called CitizenTypeChecker with main method
                Create a variable called cityzenType as String
                And create a variable with age
                If the age  is more than 65 , assign value of  cityzenType to Senior
        If not , assign value of  cityzenType to Not-Senior
Scanner optional
*/

String citizenType ;
int age = 60;
if (age > 65){
    citizenType = "Senior";
}else {
    citizenType = "Not Senior";
}
        System.out.println("The citizen age is " + age + " and, he is a " + citizenType);
// what can you do inside each part of if statement inside curly braces
    }
}
