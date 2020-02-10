
import java.util.Scanner;

public class CookieCalories {

    public static void main(String[] args) {
        System.out.println("This is the cookie calories problem");
        Scanner keyboard = new Scanner(System.in);

        //Prompt use for cookies eaten
        System.out.println("Please enter number of cookies eaten");
        //Get NumberOfCookies variable as a double
        Double NumberOfCookies = keyboard.nextDouble();
        
        //Display number of cookies eaten
        System.out.println("Number of cookies eaten is " + NumberOfCookies);

        //Set CaloriePerCookie variable as double
        //40 / 10 = 4 cookies per serving, 1 serving = 300 calories, 300/4 = 75 calories per cookie
        // Calories per cookie = 75 calories
        Double CaloriePerCookie = NumberOfCookies * 75;
        //Display calories per cookie
        System.out.println("Total number of calories consumed is " + CaloriePerCookie);

    }

}
