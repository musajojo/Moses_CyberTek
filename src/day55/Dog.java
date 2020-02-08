package day55;
// day 55 : Dog blue print for Dog Objects
public class Dog {

    String type;

    public Dog(String type) {
        this.type = type;
    }

    public void bark() {
        System.out.println(type + " Dog is barking");
    }

}