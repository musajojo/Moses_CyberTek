package day49;
// Day 49 : interface and abstract class practice
public abstract class Vehicle {

    int year;

    public Vehicle() {
    }


    public Vehicle(int year) {
        this.year = year;
    }

    public abstract void start();

    public void goForward() {
        System.out.println("Vehicle going forward");
    }


}