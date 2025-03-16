import java.util.*;

class Section2Q6 {
    public static void main(String[] args) {
        // Get inputs
        Scanner getInput = new Scanner(System.in);
        System.out.print("Enter the number of classes held: ");
        float heldCount = getInput.nextInt();
        System.out.print("Enter the number of classes attended: ");
        float attendCount = getInput.nextInt();

        // Calculate percentage
        float percent = (attendCount/heldCount) * 100;
        if (percent >= 75) {
            System.out.println("Attendance test passed! Percent: " + percent + "%");
        }
        else {
            System.out.print("I have medical documents available if needed regarding the issue of unmet attendance requirements. (Enter Y or N): ");
            String medical = getInput.next();
            if (medical.equals("Y") || medical.equals("y")) {
                System.out.println("Percent: " + percent + "%. We will let you know after reviewing the related documents");
            }
            else {
                System.out.println("Attendance test failed! Percent: " + percent + "%");
            }
        }
    }
}