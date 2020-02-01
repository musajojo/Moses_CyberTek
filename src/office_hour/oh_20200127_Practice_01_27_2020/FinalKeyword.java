package office_hour.oh_20200127_Practice_01_27_2020;
// Practice_01_27_2020: final, this, super
class data {

    private final String password = "123456";

    public String getPassword() {
        return password;
    }
/*
    public void setPassWord(String password ){
        this.password =password;
    }
*/


    public final void printName() {
        System.out.println("Hasan");
    }

    public int printName(int a) {

        return 10;
    }

}


public class FinalKeyword extends data {
// Practice_01_27_2020: final, this, super
    /*
    @Override
    public void printName(){
        System.out.println("Mohammed");
    }
*/

    final static double b = 100;
    // final long l;
    final int a = 200;

    public static void main(String[] args) {
        final int num = 100;
        //  num = 300;
        System.out.println(num);

        final String username;

        System.out.println(b);


    }

}