//Program name: (Assignment 31 Array Fun House)

//Student name: (Luke Filipchuk)

//Date: (Dec 4)

//Program Description: Write several array manipulation methods. 
//One method will sum up a section of a provided array, another 
//method will count up how many of a certain number occur in the 
//array, and the last method will remove all of a certain value from the array.
import java.util.Arrays;
public class App {
        //Prints the array being used
        public static void PrintSet(int[] ArraySet){
            System.out.println(Arrays.toString(ArraySet));
        }
        //Adds the sum between two numbers in an array
        public static void AddSum(int[] ArraySet, int start, int end){     
            int PrintSum = 0;
            for(int i = 0; i < ArraySet.length; i++){
                if (start <= i && i <= end){
                    PrintSum += ArraySet[i];
                }
            }
            System.out.println("The sum of spots " + start + "-" + end + " = " + PrintSum);
        }
        //Counts the number of times that a number occurs in an array
        public static void Count(int[] ArraySet, int number){
            int total = 0;
            for(int i = 0; i < ArraySet.length; i++){
                if (number == ArraySet[i]){
                    total++;
                }
        }
        System.out.println("# of  " + number + " 's = " + total);
    }
    public static void main(String[] args){
        int[] array = {7,4,10,0,1,7,6,5,3,2,9,7};
        PrintSet(array);
        AddSum(array,3,6);
        AddSum(array,2,9);
        Count(array,4);
        Count(array,9);
        Count(array,7);
    }
}
