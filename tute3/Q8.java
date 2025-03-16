import java.util.Random;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner getInput = new Scanner(System.in);

        // Get a random number
        int secretNumber = random.nextInt(1, 20);

        // Get user input until correct
        while (true) {
            System.out.print("Guess the number: ");
            int userInput = getInput.nextInt();
            if (userInput == secretNumber) {
                System.out.println("Correct!");
                break;

            } else {
                System.out.println("Incorrect. Try again");
            }
        }
    }
}
