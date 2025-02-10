import java.util.*;

class Section1Q5 {
	public static void main(String[] args) {
		Scanner getInput = new Scanner(System.in);

		// Input first value
		System.out.print("Enter first value: ");
		float value1 = getInput.nextFloat();

		// Input second value
		System.out.print("Enter second value: ");
		float value2 = getInput.nextFloat();

		// Input operator
		System.out.print("Enter operator: ");
		String operator = getInput.next();
		
		float output = 0;

		switch (operator) {
			case "+":
			output = value1 + value2;
			break;
			case "-":
			output = value1 - value2;
			break;
			case "/":
			output = value1 / value2;
			break;
			case "*":
			output = value1 * value2;
			break;
		}
		System.out.println("Output: " + output);
	}
}