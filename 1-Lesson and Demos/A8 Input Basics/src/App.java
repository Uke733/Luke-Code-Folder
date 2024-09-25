/*Program name: (Input Basics Assignment)

Student name: (Luke Filipchuk)

Date: (Sept 25)

Program Description: Takes the input of two integers and provides a sum. Then, the sum of two doubles.*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
Scanner numba1 = new Scanner(System.in);
System.out.print("Enter a integer: ");
int IntOne;
IntOne = numba1.nextInt();
System.out.print("Enter a different integer: ");
int IntTwo;
IntTwo = numba1.nextInt();

System.out.print("Enter a double: ");
double DubOne;
DubOne = numba1.nextDouble();
System.out.print("Enter a different double: ");
double DubTwo;
DubTwo = numba1.nextDouble();

System.out.println("\ninteger one = " + IntOne);
System.out.println("integer two = " + IntTwo);
System.out.println("double one = " + DubOne);
System.out.println("double two = " + DubTwo);

int IntTotal;
IntTotal = (int)IntOne + (int)IntTwo;
System.out.println("\nThe sum of your two integers are: " + IntTotal);

double DubTotal;
DubTotal = (double)DubOne + (double)DubTwo;
System.out.println("The sum of your two doubles are: " + DubTotal);
numba1.close();
    }
}
