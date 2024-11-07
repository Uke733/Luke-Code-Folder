//Program name: (Assignment 23 Cool Numbers)

//Student name: (Luke Filipchuk)

//Date: (Nov 4 & edited Nov 7)

//Program Description:Complete methods isCoolNum( n ) && countCoolNumbers( n ).  isCoolNum( n) will determine if a number is a cool number.  A cool number is any number that has a remainder of 1 when divided by 3,4,5, and 6.  countCoolNumbers will count the number
//of cool numbers between 6 and the parameter passed in.   

public class App {

        public boolean isCoolNum(int num){ 

            if(num % 3 == 1 && num % 4 == 1 && num % 5 == 1 && num % 6 == 1){
                return true;
            }

            else{
                return false;
                }
        }
        
        public void countCoolNumbers(int end){
            int total = 0;
            for (int x = 6; x < end; x++){

                if (isCoolNum(x)){
                    total++;                
                }

            }
            System.out.println(total + " cool numbers between 6 - " + end);
        }
    }
