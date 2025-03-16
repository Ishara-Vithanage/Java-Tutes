import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        try {
            Scanner getInput = new Scanner(System.in);

            // Input for a number
            System.out.print("Enter a number: ");
            int value = getInput.nextInt();

            // Calculate factorial
            if (value > 0) {
                int factorial = 1;
                String txtDisplay = "";
                for (int i = value; i > 0; i--) {
                    factorial *= i;
                    if (i == 1) {
                        txtDisplay += String.valueOf(i) + " = ";
                        break;
                    }
                    txtDisplay += String.valueOf(i) + " x ";
                }
                System.out.println("Factorial for " + value + " = " +txtDisplay + factorial);

            } else if (value == 0) {
                System.out.println("Factorial for 0 = 1");

            } else {
                System.out.println("Try again with a positive number");
            }


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
