package office_hour.oh_20200213_Practice_02_13_2020;
// Practice_02_13_2020: Exceptions practice
public class ExceptionPractoce_Throws {

    public static void main(String[] args) throws Exception {
        System.out.println("Step 1");

        Thread.sleep(4000);

        System.out.println("Step 3");

        System.out.println("Step 4");

        Thread.sleep(4000);

        System.out.println("Step 5");
    }
    public static void method1() throws Exception {

        main(new String[]{"A"});
    }
    public static void method2() {
        try {
            method1();
        } catch (Exception e) {

        }
    }
    public static void method3() {
        // method2();
    }
}