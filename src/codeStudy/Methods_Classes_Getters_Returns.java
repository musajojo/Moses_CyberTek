package codeStudy;

public class Methods_Classes_Getters_Returns {
    public static void main(String[] args) {

        speak(); // Hello

        greeting(); // Hi

        add(5, 2); // 7

        System.out.println();

        Car car1 = new Car();
        car1.fuel = "gas";
        System.out.println(car1.fuel); // gas
        car1.gallons = 15;
        System.out.println(car1.gallons); // 15
        car1.color();

        System.out.println();

        Bicycle bicycle1 = new Bicycle();
        bicycle1.power = "Peddle";
        System.out.println(bicycle1.power); // Peddle
        bicycle1.wheels = 2;
        System.out.println(bicycle1.wheels); // 2

        Bicycle bicycle2 = new Bicycle();
        bicycle2.wheels = 4;
        System.out.println(bicycle2.wheels); // 4

        System.out.println();

        String power = bicycle1.getPower();
        System.out.println(power); // Peddle
        int wheels = bicycle1.getWheels();
        System.out.println(wheels); // 2

        System.out.println();

        String fuel = car1.getFuel();
        System.out.println(fuel); // gas
        int gallons = car1.getGallons();
        System.out.println(gallons); // 15

        System.out.println();

        Rocket rocket1 = new Rocket();
        System.out.println(rocket1.getDestination()); // Space (Original)
        System.out.println(rocket1.destination.toUpperCase()); // SPACE
        rocket1.destination = "Moon";
        System.out.println(rocket1.destination); // Moon
        rocket1.fuel = "Jet Fuel";
        System.out.println(rocket1.fuel); // Jet Fuel
        System.out.println(rocket1.getFuel()); // Jet Fuel // new initialization.
        System.out.println(rocket1.astronautCount); // 6
        System.out.println(rocket1.getAstronautCount()); // 6

    }

    public static void speak() {
        System.out.println("Hello");
    }

    public static String greeting() {
        System.out.println("Hi");
        return null;
    }

    public static int add(int a, int b) {

        int add = a + b;
        System.out.println(add);
        return add;
    }
    static class Bicycle { // static allows it to be in the main method
        String power;
        int wheels;

        String getPower () {return power;}
        int getWheels () {return wheels;}
    }
}

class Car { // this exists outside main method
    String fuel;
    int gallons;

    String getFuel () {return fuel;}
    int getGallons() {return gallons;}

    void color () { // it seems that void only goes on a class
        String red = "red";
        System.out.println(red);
    }
}

class Rocket {
    String destination = "Space";
    String fuel;
    int astronautCount = 6;

    String getDestination () {return destination;}
    String getFuel () {return fuel;}
    int getAstronautCount () {return astronautCount;}
}