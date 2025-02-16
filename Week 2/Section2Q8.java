import java.util.*;

class Section2Q8 {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        // Get user input
        System.out.print("0: Rock\n1: Paper\n2: Scissor\nEnter number: ");
        int userInput = getInput.nextInt();

        // Get a random number as pc input
        int random_number = new Random().nextInt(3);

        // Conditions
        try {
            if (userInput == random_number) {
                System.out.println("tie");
            }
            else if ((userInput == 0 && random_number == 1) || (userInput == 1 && random_number == 2)) {
                System.out.println("Pc Wins !!");
            }

            else {
                System.out.println("User Wins !!");
            }

        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
    }
}