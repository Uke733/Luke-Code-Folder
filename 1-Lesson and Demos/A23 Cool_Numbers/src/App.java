//Program name: (Assignment 23 Cool Numbers)

//Student name: (Luke Filipchuk)

//Date: (Oct 30)

//Program Description:Complete methods isCoolNum( n ) && countCoolNumbers( n ).  isCoolNum( n) will determine if a number is a cool number.  A cool number is any number that has a remainder of 1 when divided by 3,4,5, and 6.  countCoolNumbers will count the number
//of cool numbers between 6 and the parameter passed in.   
import java.util.Scanner;
public class App {
        private Scanner keyboard = new Scanner(System.in);
        public void isCoolNum(){
            System.out.println("Enter a number: ");
            int num = keyboard.nextInt();
            if num % 3 == 1 || num % 4 == 1 || num % 5 == 1 || num % 6 == 1{
                System.out.print("This is the coolest number.");
            }
            else{
                System.out.print("This is not a cool number.");
            }
            
        }
    
        public void countCoolNumbers(){
            for (int x = 6, x < num, x++){
                System.out.print(x);
            }
        }
    }
