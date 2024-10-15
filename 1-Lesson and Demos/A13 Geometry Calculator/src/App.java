//Program name: (Assignment 13 Geometry Calculator)

//Student name: (Luke Filipchuk)

//Date: (Oct 15)

//Program Description: Calculates perimeter of a rectangle, surface area of a cube, and area of a circle
import java.util.Scanner;

public class App {
    private Scanner keyboard = new Scanner(System.in);
    private double P, SA, A; 
    public void Perimeter(){
        System.out.print("Enter Length of a Rectangle: ");
        double length = keyboard.nextDouble();

        System.out.print("Enter Width of a Rectangle: ");
        double width = keyboard.nextDouble();
        P = 2*(length * width);
        System.out.println(P + " unrounded units, is the perimeter of this rectangle");
    }

    public void SurfaceArea(){
        System.out.print("Enter the side length of a cube: ");
        double side = keyboard.nextDouble(); 
        SA = 6*(Math.pow(side,2));
        System.out.println(SA + " unrounded units, is the surface area of this cube");
    }

    public void Area(){
        System.out.print("Enter the radius of a circle: ");
        double radius = keyboard.nextDouble();
        A = Math.PI * (Math.pow(radius,2));
        System.out.println(A + " unrounded units, is the area of this circle");
    }
    public void Decide(){
        System.out.print("1 for perimeter of a rectangle, 2 for surface area of a cube, 3 for area of a circle: ");

        int resp = keyboard.nextInt();

        if (resp == 1) {
            Perimeter();
        }
        else if (resp == 2) {
            SurfaceArea();    
        }
        else if (resp == 3) {
            Area();
    }

}
    



    
}
