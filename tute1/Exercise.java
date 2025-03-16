import java.util.*;

public class Exercise {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter value in Celsius: ");
		double value = scanner.nextDouble();
		double fValue = (9.0/5)*value + 32;
		System.out.println("Value in Fahrenheit: " + fValue);
	}
}