//Program name: (Assignment #25 Random Numbers Task)

//Student name: (Luke Filipchuk)

//Date: (Nov 13)

//Program Description: Design a program that generates two random integers, 
//stores them into temporary variables, and then compared the two to find the largest and the smallest.
public class App {
    public void Random(){
        for (int x = 1; x <= 10; x++){
            double number1 = (Math.random() * 100);
            int number3 = (int) number1;
            double number2 = (Math.random() * 100);
            int number4 = (int) number2;
            System.out.println("Here are two random numbers: ");
            System.out.println(number3 + " and " + number4);
            if (number3== number4){
                System.out.println("These two numbers are even");
            }
            if (number3 > number4){
                System.out.println("The smallest is: " + number4);
                System.out.println("The largest is: " + number3 + "\n");
            }
            if (number4 > number3){
                System.out.println("The smallest is: " + number3);
                System.out.println("The largest is: " + number4 + "\n");
            }
            }
        }
}