package day51;
// 	Day 51 : Interface Practice
public interface Flyable {

    public abstract void fly();

}

// An interface can extend another interface
// to inherit it's members for reusability
// This is also a inheritance relationship
// in this example
// // Flyable is super type of UprightFlyable
// so it inherit the methods of Flyable