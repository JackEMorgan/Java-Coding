import java.util.Scanner;

/**
 * drive
 */
public class weather {

    public static void main(String[] args) {

        System.out.println("Good morning user!");
        System.out.println("This program will help you deicde if you should go out or not today.");
        String response = getMsg();

        if (response.equals("sunny") || response.equals("cloudy"))
        {
            System.out.println("Go out and enjoy the weather");
        }
        else if (response.equals ("rain") || response.equals("snowing"))
        {
            System.out.println("Wear a rain coat if you go out.");
        }
        else
        {
            System.out.println("Probably shouldn't go out today or invalid user input.");
        }
    }   

    public static String getMsg() {

        Scanner weather = new Scanner(System.in);
        
        System.out.println("Whats the wheather like today?");
        String response = weather.nextLine();
        return response;
    }
}
