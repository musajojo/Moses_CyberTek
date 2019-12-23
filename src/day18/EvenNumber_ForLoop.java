package day18;

public class EvenNumber_ForLoop {
    public static void main(String[] args) {

        // skip counting by 2
        // starting from 0

//        for (int i = 0 ; i <100 ; i+=2){ // or i = i + 2
//            System.out.println(i+" ");
//        }


        // skip counting by 3
        // starting from 0 -- 100

           for (int i = 0 ; i <100 ; i+=3){
           System.out.print(i+" ");
         }
        System.out.println();
        System.out.println("---------------even number");
        for (int i = 0; i < 100; i++) {
            if (i %2==0){
                System.out.println(i+" is even number");
            }
            System.out.println("----------------");

            // the short cut for generting for loop is : fori enter or tab
            for (int x = 0; x <100 ; x++) {
                if (x % 5==0 && x % 3==0){
                    System.out.println(x + " is fizz buzz number");
                }
        // everything you can do with the for loop ---->> can be done using while loop !!!
            }
        }
    }
}
