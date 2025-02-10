import java.util.*;

class Section1Q2 {
	public static void main(String[] args) {
		Scanner getInput = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = getInput.nextInt();

		if (age >= 18) {
			System.out.println("Over 18");
		}
		else if (age < 18 && age > 0) {
			System.out.println("Under 18");
		}
		else {
			System.out.println("The age entered is incorrect");
		}
	}
}