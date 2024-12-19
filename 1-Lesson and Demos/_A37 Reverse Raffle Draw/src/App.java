// Program name: (Reverse Raffle Draw)

// Student name: (Luke Filipchuk)

// Date: (Dec 11)

// Program Description:Create a reverse raffle draw using 
//an array or ArrayList with the following requirements:

// At least 10 names start in the "hat"
// There is an output explaining the game before it starts
// There is an output listing the names that have been removed each pick
// There is an output listing the winner when there is only one name left.
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        List <String> myList = new ArrayList<String>();
        myList.add("Alex");
        myList.add("Bob");
        myList.add("Cole");
        myList.add("Dale");
        myList.add("Edward");
        myList.add("Fred");
        myList.add("Greg");
        myList.add("Harold");
        myList.add("Isaac");
        myList.add("Jerome");
        System.out.println("A reverse raffle is a raffle draw where the name drawn from a hat they DOES NOT win. The last name drawn is the actual winner.");
        
    }
}
