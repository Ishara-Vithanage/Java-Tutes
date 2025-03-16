import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int value = getInput.nextInt();

        int result = 1;
        int oldResult = 1;
        int temp;

        for (int i = 0; i < value; i++) {
            if (i == 0) {
                result += oldResult;
            }
            temp = result;
            result += oldResult;
            oldResult = temp;
        }
        System.out.println(result);
    }
}
