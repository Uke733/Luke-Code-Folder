//Program name: (Assignment 22 Leap year)

//Student name: (Luke Filipchuk)

//Date: (Oct 25)

//Program Description: Write a program to determine if a year is a leap year.
import java.util.Scanner;
public class App {
    private Scanner keyboard = new Scanner(System.in);
    public void LeapYear(){
        System.out.print("Enter a year: ");
        int year = keyboard.nextInt(); 
        if ((year % 100) == 0){
            if ((year % 400) == 0){
            System.out.print(year + " is a leap year.");
            System.exit(year);
            }
            
        }
        if ((year % 4) == 0){
            System.out.print(year + " is a leap year.");
         }
        else {
            System.out.print(year + " is NOT a leap year.");
        }
 }
}
//FIX 1500 OUTPUT 