package day51;
// Day 51 : String implements Comparable interface so it has comparedTo method
public class ComparableString {


    public static void main(String[] args) {


        String s1 = "abc";
        String s2 = "xyz";

        // the only thing matter is - or +  or 0
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.compareTo(s1));


    }


}