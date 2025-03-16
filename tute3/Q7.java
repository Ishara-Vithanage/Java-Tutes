import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        int passcode = 486251;

        try {
            for (int i = 3; i >= 0; i--) {
                System.out.print("Enter passcode: ");
                int userInput = getInput.nextInt();

                if (userInput == passcode) {
                    System.out.println("Passcode correct!");
                    break;
                }
                else {
                    System.out.println("Incorret. You only have " + i + " attempts left.");
                }
            }

        } catch (Exception e) {
            System.out.println("Try again with correct input. \n" + e);
        }
    }
}
