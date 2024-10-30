public class App {
    public static void main(String[] args) throws Exception {
        int x = 2;
        int y = 5;
        if (x < 0 ){
            System.out.println("x is negative");
        }
        else if (x == 0) {
            System.out.println("x is zero ");
        }
        else {
            System.out.println("x is postive");
        }
        //if (x > 0) {
        //   System.out.println("x is pos+ and greater than "  + y);
        }
        //if (x > 0 && x > y) {
        //    System.out.println("x is pos+ and greater than " + y);
        if (x > 0) {
            System.out.println("Not a winner");
        }
        else if (x > 5) {
            System.out.println("Not a winner");
        else {
            System.out.println("This is a winning number");
        }
        //equivalent
        if (x < 0 || x > 5){
            System.out.println("Not a winner");
            else {
                System.out.println("Winner");
            }
        }
        }
    }