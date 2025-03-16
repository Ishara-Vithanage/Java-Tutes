import java.util.*;

class Section2Q7 {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        //Get acc balance as input
        System.out.print("Enter current account balance: ");
        float accBalance = getInput.nextFloat();

        
        while (true) {
            System.out.println("Press 1 for deposit\nPress 2 for withdraw\nPress 3 for quit:");

            int trxType = getInput.nextInt();
            if (trxType == 1) {
                System.out.print("Enter deposit amount: ");
                float depositAmt = getInput.nextFloat();
                accBalance += depositAmt;
                System.out.print("Remaining balance: " + accBalance + "\n");
            }

            else if (trxType == 2) {
                System.out.print("Enter withdraw amount: ");
                float withdrawAmt = getInput.nextFloat();
                if (withdrawAmt > accBalance) {
                    System.out.println("Warning!! Insufficient account balance");
                    continue;
                }
                accBalance -= withdrawAmt;
                System.out.print("Remaining balance: " + accBalance + "\n");
            }

            else if (trxType == 3) {
                System.out.print("Have a nice day!");
                break;
            }

            else {
                System.out.print("Invalid input. Please try again" + "\n");
            }
        }
    }
}