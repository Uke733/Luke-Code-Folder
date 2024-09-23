/*Program name: (input Demo)

Student name: (Luke Filipchuk)

Date: (Sept 23)

Program Description: Teaches inputs.*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner (System.in);
        System.out.print("What is your name? ");
        String name = keys.next();
        System.out.println("Your name is: " + name);
    }
}
