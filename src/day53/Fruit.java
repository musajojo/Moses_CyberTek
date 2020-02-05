package day53;
// Day 53 : Polymorphism Practice : FruitShop | Only Reference Type Decide what you can access at compile time
public abstract class Fruit {

    String taste;
    String color;

    public Fruit(String taste, String color) {
        this.taste = taste;
        this.color = color;
    }

    public abstract void getDigested();

    @Override
    public String toString() {
        return "HELLO FROM FRUIT";
    }
}