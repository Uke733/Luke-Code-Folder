/*Program name: (Chicken Wing Price Calculator)

Student name: (Luke Filipchuk)

Date: (Sept 23)

Program Description: Calculates how many chicken wings you can buy with $4.75.*/
public class App {
    public static void main(String[] args) throws Exception {
        double chicken;
        chicken = 0.75;
        double money;
        money = 4.75;
        double HowManyChickens;
        HowManyChickens = money / chicken;
        int total = (int)HowManyChickens;
        System.out.println("You can buy " +  total + " chicken wings!");
    }
}
