package repl.repls_01_to_50;
import java.util.*;
public class Repl_025_greater_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        //WRITE YOUR CODE HERE:
        if (a>b){
            System.out.println(a + " is greater");
        }else{
            System.out.println(b+ " is greater");
        }
    }
}
/*
025. greater number
Instructions from your teacher:

using an if statement check which int is larger a or b, and then output:
"number is greater".

for example:
a=1
b=2

output:
2 is greater

a=5
b=7

output:
7 is greater
*/
/*
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    //WRITE YOUR CODE HERE:
 }
}
 */