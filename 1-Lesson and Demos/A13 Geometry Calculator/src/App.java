//Program name: (Assignment 13 Geometry Calculator)

//Student name: (Luke Filipchuk)

//Date: (PLEASE CHANGE)

//Program Description:
import java.util.Scanner;

public class App {
    private Scanner keyboard = new Scanner(System.in);
    private double P;

    public void Perimeter(){
        System.out.println("Enter Length of a Rectangle: ");
        int length = keyboard.nextInt();

        System.out.println("Enter Width of a Rectangle: ");
        int width = keyboard.nextInt();
        P = 2*(length * width);
        System.out.println(P);
        
    }



    
}
