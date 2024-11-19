public class App {
    public static void main(String[] args) throws Exception {
       //declare the array
        //int[] scores = null;
        //String[] names = null;

        //create or initialize array
        //scores = new int[10];
        //names = new String[10];

        //Assign Values of Array
        //list of data (soltion set)
        String[] names = {"wolf", "Sutter", "Cook", "Fox", "Golden"};
        int[] scores = {9000, 7001, 1337, 2048, 4096};

        //individual postions
        names[0] = "wolf";
        scores[0] = 9000;

        //Array Length Property
        System.out.println("Scores length is " + names.length);

        //outputting or accessing arrays
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ") " + names[i] + ": " + scores[i]);
        }

        //output in reverse order
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(i + ") " + names[i] + ": " + scores[i]);
        }

        //find the sum of the array
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        System.out.println("The sum is " + sum);

        //count elements of an array (eg. even numbers)
        int count = 0;
        for (int i = 0; i<scores.length; i++) {
            if(scores[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("There are " + count +" even numbers");
       System.out.println(scores[5]);
    }
}
