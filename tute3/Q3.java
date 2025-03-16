import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        try {
            // First input for a number
            System.out.print("Enter a number: ");
            int number = getInput.nextInt();

            // Second input for a letter
            System.out.print("Enter a letter: ");
            String letter = getInput.next();

            //Print output
            for (int i = 0; i < number; i++) {
                System.out.print(letter);
            }

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
