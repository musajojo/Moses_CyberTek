package office_hour.OH_20200113_office_hour_1_13_2020;
// Day 41 : OFFICE HOUR PRACTICE
public class Person {
    String firstName;
    String lastName;
    String DOB;

    public void printInfo() {
        System.out.println(String.format("String first name = %s, " +
                        "last name = %s, " +
                        "date of birth = %s",
                firstName, lastName, DOB));
    }

}