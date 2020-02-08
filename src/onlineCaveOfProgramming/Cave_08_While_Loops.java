package onlineCaveOfProgramming;

public class Cave_08_While_Loops {
    public static void main(String[] args) {
        int value = 0;
        boolean loop = value < 20;
        System.out.println(loop);

        while (value < 10){
            System.out.println("Hello " + value);
            value = value + 1;
        }
    }
}
