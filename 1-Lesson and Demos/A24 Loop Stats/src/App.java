//Program name: (Assignment #24 Loop Stats)

//Student name: (Luke Filipchuk)

//Date: (Nov 12)

//Program Description: Run a loop from a provided start number to a provided stop number. 
//Total up all numbers in the group, determine all odds in the group, and determine all evens in the group.
public class App {
public int evens, odds, total;    
public void Count(int num, int end){
            for (int x=num; x <= end; x++){
                total = total + x;
                if (x % 2 == 0){
                    evens++;
                }
                else{
                    odds++;
                }
            }
            System.out.println("total: " + total);
            System.out.println("even count: " + evens);
            System.out.println("odd count: " + odds);

        }
}
    

