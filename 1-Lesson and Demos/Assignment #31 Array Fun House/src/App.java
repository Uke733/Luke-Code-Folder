//Program name: (Assignment 31 Array Fun House)

//Student name: (Luke Filipchuk)

//Date: (Nov 29)

//Program Description: Write several array manipulation methods. 
//One method will sum up a section of a provided array, another 
//method will count up how many of a certain number occur in the 
//array, and the last method will remove all of a certain value from the array.
//import java.util.Scanner;
import java.util.Arrays;
public class App {
        //Scanner keys = new Scanner(System.in); 
        public static void AddSum(int[] ArraySet, int start, int end){     
            Arrays.toString(ArraySet);
            int PrintSum = 0;
            for(int i = 0; i < ArraySet.length; i++){
                if (start <= i && i <= end){
                    PrintSum += ArraySet[i];
                }
            }
            System.out.println("The sum of spots " + start + "-" + end + " = " + PrintSum);
        }
    public static void main(String[] args){
        int[] array = {7,4,10,0,1,7,6,5,3,2,9,7};
        AddSum(array,3,6);
        AddSum(array,2,9);
    }
}
