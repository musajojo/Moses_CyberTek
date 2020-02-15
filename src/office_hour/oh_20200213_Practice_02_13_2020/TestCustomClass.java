package office_hour.oh_20200213_Practice_02_13_2020;
// Practice_02_13_2020: Exceptions practice
public class TestCustomClass {

    public static void main(String[] args) throws NoBreakTimeException {

        boolean studentAskForBreak = true;

        if (studentAskForBreak) {
            //  throw new NoBreakTimeException();  // unchecked
        } else {
            System.out.println("Continue");
        }
    }
    public static void method1() throws NoBreakTimeException {

    }
}