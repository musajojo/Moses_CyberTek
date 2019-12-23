package day14;

public class EmailChecker_MyWork {
    public static void main(String[] args) {


        String email = "moses@gmail.com";

        if (email.contains(" ")) {
            System.out.println("Invalid");
        }else if (!email.contains("@")){     // the ! exclamation mark means NOT as in does NOT contain.
            System.out.println("Invalid");
        } else if (email.endsWith("gmail.com")){
            System.out.println("Gmail");
        }else if (email.endsWith("yahoo.com")){
            System.out.println("Yahoo Mail");
        }else if (email.endsWith("mail.ru")){
            System.out.println("Russian Email");
        }else {
            System.out.println("Email Not Found");
        }


    }
}
