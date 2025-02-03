import java.util.*;

public class MyFirstJava {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please insert your name: ");
		String name = scanner.next();
		System.out.println("Hello " + name);
	}
}