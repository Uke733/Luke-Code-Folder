//Program name: (Area of a Triangle)

//Student name: (Luke Filipchuk)

//Date: (Oct 22)

//Program Description: Calculate the area of a triangle given the values for all three sides.
import java.util.Scanner;

public class App {
    private Scanner keyboard = new Scanner(System.in);
    private double P,S,A;
    public void SolveS(){
        System.out.print("Enter side length #1: ");
        double len1 = keyboard.nextDouble();
        System.out.print("Enter side length #2: ");
        double len2 = keyboard.nextDouble();
        System.out.print("Enter side length #3: ");
        double len3 = keyboard.nextDouble();
        P = len1 + len2 + len3;
        S = P / 2.0;
        A = Math.sqrt(S*((S-len1)*(S-len2)*(S-len3)));
        //Use print f to include number to a certain amount of digits
        System.out.printf("%.3f", A);
        System.out.print(", is the area of this triangle to three decimal places");
    }
}
