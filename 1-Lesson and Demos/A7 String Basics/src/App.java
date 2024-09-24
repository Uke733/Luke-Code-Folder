/*Program name: (String Basics Assignment)

Student name: (Luke Filipchuk)

Date: (Sept 24)

Program Description: Taught me how to manipulate strings.*/
public class App {
    public static void main(String[] args) throws Exception {
    String message1 = "I am very happy!";
    String target1 = "very";
    String message2 = "That was great - lol.";
    String target2 = "lol";
    int pos = message1.indexOf(target1);
    int tlen = target1.length();
    System.out.println(message1.substring(0,pos) + message1.substring((pos+tlen) + 1));

    int pos2 = (message2.indexOf(target2));
    System.out.println(message2.substring(0,pos2) + "laugh out loud");
    }
}
