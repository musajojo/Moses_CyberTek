package onlineCaveOfProgramming.cave01_Programming_Core_Java;

class Frog {
    private String name;
    private int age;

    public void setName(String name){ // this name is the parameter
        // the this.name is the String (class name) instance variable. the other two are local variables
        this.name = name;
    }

    // this was the original newName and name are two different labels,
    // because you can't make name = name itself basically,
    // so by putting this (above) new name can be named just regular name and be assigned

//    public void setName(String newName){
//        name = newName;
//    }

    public void setAge(int age){
        // the this refers to the object itself like frog1
        this.age = age;
    }
    public String getName(){ return name;}
    public int getAge () {return age;}

    // the this isn't necessarily necessary I could work with name, age directly.
    // It is only an option. In some instances it helps clear ambiguity as above.
    // above there are several variables with the same name (name),
    // so we use this to pick out the instance variable.
    public void setInfo (String name, int age){
        setName(name);
        setAge(age);
    }
}
public class Cave_21_Setters_and_this {
    public static void main(String[] args) {

        Frog frog1 = new Frog();

        // Here the name is set with an = sign
        // now that private is before the String above. This can no longer access it (name)
        // frog1.name = "Bertie";
        // now that private is before the int above. This can no longer access it (age)
        // frog1.age = 1;

        // Here the name is set with a method and it is assigned to the instance variable name
        frog1.setName("Frankie");
        frog1.setAge(2);

        System.out.println(frog1.getName());
        System.out.println(frog1.getAge());
    }
}
/*
class Frog {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }
}

public class App {

    public static void main(String[] args) {

        Frog frog1 = new Frog();

        //frog1.name = "Bertie";
        //frog1.age = 1;

        frog1.setName("Bertie");
        frog1.setAge(1);

        System.out.println(frog1.getName());
    }

}
 */
