import java.util.*;

class Q1 {
	public static void main(String[] args){
		int[] marks = new int[6];
		Scanner getInput = new Scanner(System.in);

		// Get user inputs
		for (int i = 1; i < 7; i++) {
			System.out.println("Enter mark " + i);
			int getMark = getInput.nextInt();
			marks[i-1] = getMark;
		}
	}
}