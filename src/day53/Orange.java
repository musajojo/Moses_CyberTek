package day53;
// Day 53 : Polymorphism Practice : FruitShop | Only Reference Type Decide what you can access at compile time
public class Orange extends Fruit {

    int vcLevel;

    public Orange(String taste, String color, int vcLevel) {
        super(taste, color);
        this.vcLevel = vcLevel;
    }

    @Override
    public void getDigested() {

        System.out.println("Orange with Vitamin C level " + vcLevel
                + " has color " + color
                + " and it has " + taste + " taste when you digest");

    }

    @Override
    public String toString() {
        return "Orange{" +
                "vcLevel=" + vcLevel +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}