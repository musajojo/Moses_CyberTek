package repl;

import java.util.Scanner;

public class Repl_051_if_statement_largest_among_three_numbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
    }
}
/*
051. if statement largest among three numbers

Instructions from your teacher:

its like bigger among two numbers where :
if(n1 > n2)
{
       System.out.print("n1 is bugger" );
}
in this problem you need to write a program that checks for the bigger of 3 numbers.
you get 3 int variables: n1 , n2 and n3
if n1 is biggest output: "n1 is bigger"if n2 is biggest output: "n2 is bigger"if n4 is biggest output: "n3 is bigger"

for example:

n1 = 1
n2  = 2
n3  = 1
output: "n2 is bigger"

n1 = 3
n2  = 2
n3  = 1
output: "n1 is bigger"

n1 = 3
n2  = 2
n3  = 30
output: "n3 is bigger"

hint: this can be done with 3 ifs and && operator (and operator).
like: if n1>2 and n1>3
 */
/*
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n1 = s.nextInt();
    int n2 = s.nextInt();
    int n3 = s.nextInt();
    //your code here
  }
}
 */