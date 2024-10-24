//Program name: (Assignment 17 Miles per hour)

//Student name: (Luke Filipchuk)

//Date: (Oct 24)

//Program Description: Calculates MPH given distance and hours/minutes
import java.util.Scanner;
public class App {
    private Scanner keyboard = new Scanner(System.in);
    private double H,M,MPH;
    public void Speed(){
        System.out.print("Enter the distance: ");
        double Distance = keyboard.nextInt();
        System.out.print("Enter the hours: ");
        double Hours = keyboard.nextInt();
        System.out.print("Enter the minutes: ");
        double Minutes = keyboard.nextInt();
        M = Minutes/60;
        H = Hours + M;
        MPH = Distance/H;
        int x = (int)Distance;
        int y = (int)Hours;
        int z = (int)Minutes;
        System.out.print(x + " miles in " + y + " hour(s) and " + z + " minutes = " + Math.round(MPH) +" MPH");
    }
}
