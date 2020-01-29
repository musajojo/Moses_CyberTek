package day49;
// Day 49 : interface and abstract class practice
public interface Autonomous {

    void selfDrive();

}
/*
Task

if a class does not explicitly (visibly)
		extends another class ,
	it will implicitly (automatically ) extends Object class
	public class Car { }
	public class SpyCar extends Car{
	}
	Object--Car---SpyCar
---------------------
2 way to achieve abstraction in java
	Abstract class
		can have
		everything a normal class can have
		+ abstract methods
		- no object can be created from abstract class
	Interface
		can have
		public static final field : CONSTANT
		abstract methods
		default methods { HAS BODY : DEFAULT IMPLEMENTATION}
		static methods { HAS BODY : NOT INHERITED, STATIC WAY}
 */