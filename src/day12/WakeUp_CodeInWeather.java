package day12;

public class WakeUp_CodeInWeather {
    public static void main(String[] args) {
/*
WAKE UP TASK :
Create a variable to store the weather of your city right now :
And write a if else if else statement to do following
 If Weather Sunny ——>>  Code in Sunny weather
 If Weather Rainy ——>>  Code in Rainy weather
 If Weather Cloudy  ——>>  Code in Cloudy weather
 If Weather Snowy  ——>>  Code in Snowy weather
Else   —>> rain or shine just keep coding anyway !!!
 */
        String weather = "Rainy";

        if (weather.equals("Sunny")) {
            System.out.println("Code in Sunny weather ");
        } else if (weather.equals("Rainy")) {
            System.out.println("Code in Rainy weather ");
        } else if (weather.equals("Cloudy")) {
            System.out.println("Code in Cloudy weather ");
        } else if (weather.equals("Snowy")) {
            System.out.println("Code in Snowy weather ");
        } else {

            System.out.println("rain or shine just keep coding anyway !!! ");
        }
    }
}








