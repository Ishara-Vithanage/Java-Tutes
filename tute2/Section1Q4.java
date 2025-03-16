import java.util.*;

class Section1Q4 {
	public static void main(String[] args) {
		Scanner getInput = new Scanner(System.in);
		System.out.print("Enter mark: ");
		float mark = getInput.nextFloat();
		
		if (mark >= 70 && mark <= 100) {
			System.out.println("1st Class Honours (1)");
		}
		else if (mark >= 60 && mark <= 69) {
			System.out.println("2nd Class Honours Upper Division (2:i)");	
		}
		else if (mark >= 50 && mark <= 59) {
			System.out.println("2nd Class Honours Lower Division (2:ii)");	
		}
		else if (mark >= 40 && mark <= 49) {
			System.out.println("3rd Class Honours (3)");	
		}
		else {
			System.out.println("Invalid value");	
		}
	}
}