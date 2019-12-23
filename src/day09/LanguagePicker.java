package day09;

public class LanguagePicker {
    public static void main(String[] args) {


        int langCode = 5;
        //String dayName;
        String langName = ""; // assigning String value is recommended even if its empty

        if (langCode == 1) {
            langName = "Hello ";
        } else if (langCode == 2) {
            langName = "Salam ";
        } else if (langCode == 3) {
            langName = "Hola ";
        } else if (langCode == 4) {
            langName = "Privet ";
        } else if (langCode == 5) {
            langName = "Merhaba ";
        } else if (langCode == 6) {
            langName = "Szia ";
        } else if (langCode == 7) {
            langName = "bonjour ";
        } else {
            langName = "Default ";
            //System.out.println("Day is Unknown");

    }
        System.out.println(langName + "STED");

    }
}
