package day49;
// Day 49 : interface and abstract class practice
public interface Chargeable {

    public default void charge() {
        System.out.println("DEFAULT charge, " +
                "You may wanna do on your own");
    }

}