package office_hour.oh_20200212_Practice_02_12_2020;

public class ExceptionsPractice {
    public static void main(String[] args) {

        try {
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println("Interrupted exception is handled");
        }
        System.out.println("Step 2");
        try {
            // System.out.println(9 / 0);
            int[] arr = {1,2,3};
            System.out.println(arr[50]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception is handled");
        } catch (IndexOutOfBoundsException e){
            System.out.println("index out of bondException is handled");
        } catch (ArithmeticException e){
            System.out.println("Airthmatic exception is handled");
        } catch(IllegalStateException e){
            System.out.println("Illigal State exception");
        }catch (RuntimeException e){
            System.out.println("Runtime ");
        } catch( Exception e){
            System.out.println("Exception");
        }
        System.out.println("Test Completed");
        /*
        step 1
        step 2
        step 3
         */
    }
}
class Testing{
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40};
        System.out.println(numbers[0]);
        try {
            System.out.println(numbers[100]);
        } catch (RuntimeException e){
            System.out.println("Runtime exception is occured");
        }
        System.out.println(numbers[2]);
        System.out.println("test completed");
    }
}
