package onlineCaveOfProgramming.cave01_Programming_Core_Java;

class Robot {
    public void speak (String someText){
        // it does not matter what the label (text) here is called it still uses it.
        // it is all the same string as greeting which in this case what it is called.
        // the important thing is that is is all a String
        System.out.println(someText);
    }
    public void jump (int height){
        System.out.println("Jumping: " + height);
    }
    public void move (String direction, double distance){
        System.out.println("Moving " + distance + " meters in direction " + direction);
    }
}

public class Cave_20_Method_Parameters {
    public static void main(String[] args) {

        Robot sam = new Robot();
        sam.speak("Hi I'm Sam.");
        sam.jump(7);
        sam.move("West", 12.2);
        // greeting here is like a label referring to this string
        String greeting = "Hello there.";
        sam.speak(greeting);

        int value = 14;
        // in the case of a primitive it works almost the same as the String
        // except it hold some memory instead of just being a label
        sam.jump(value);
    }
}
