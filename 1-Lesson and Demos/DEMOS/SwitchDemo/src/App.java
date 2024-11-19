import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner luke = new Scanner(System.in);
        int option = luke.nextInt();
        luke.close();
        switch (option) {

            case 7:
                System.out.println("You picked 7");
                break;

            case 6:
            System.out.println("You picked 6");

            case 5:
            System.out.println("You picked 5");

            default:
            System.out.println("You picked a weird number");
            break;
        }
        
    }

}
