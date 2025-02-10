import java.util.*;

class Section1Q1 {
	public static void main(String[] args) {
		Scanner getInput = new Scanner(System.in);

		System.out.print("Enter first value: ");
		double num1 = getInput.nextDouble();
		System.out.print("Enter second value: ");
		double num2 = getInput.nextDouble();
		
		double sum = num1 + num2;
		System.out.println(sum);
	}
}