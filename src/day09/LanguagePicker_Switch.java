package day09;

public class LanguagePicker_Switch {
    public static void main(String[] args) {

        int langCode = 1;

        switch (langCode){
            case 1 :
                System.out.println("Hello ");
                break; // used to get out of this branch
            case 2 :
                System.out.println("Salam ");
                break;
            case 3 :
                System.out.println("Hola ");
                break;
            case 4 :
                System.out.println("Privet ");
                break;
            case 5 :
                System.out.println("Merhaba ");
                break;
            case 6 :
                System.out.println("Szia ");
                break;
            case 7 :
                System.out.println("Bonjour ");
                break;
            default:
                System.out.println("Language is unkown ");
        }

        System.out.println("STED");



    }
}
