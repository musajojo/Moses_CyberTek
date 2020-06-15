package A1_Practice;

public class OtherPractice1 {
    private int b;
    private String name;

    //empty constructor
    public OtherPractice1() {
    }

    //constructor to set values for b and name
    public OtherPractice1(int b2, String name2){
        setB(b2);
        setName(name2);
    }

    public int getB() {
        return b;
    }

    public String getName() {
        return name;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setName(String name) {
        this.name = name;
    }

    //method for calculating the sum
    public int S (int a, int b){
       return a + b;
    }

    @Override
    public String toString(){

       return "B: " + getB() + "\n Name: " + getName();
    }






}
