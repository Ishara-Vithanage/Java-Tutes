import java.util.*;

class Section1Q3 {
	public static void main(String[] args) {
		Scanner getInput = new Scanner(System.in);

		// Inupt ict mark
		System.out.print("Enter ICT mark: ");
		float ictMark = getInput.nextFloat();

		// Input coursework mark
		System.out.print("Enter coursework mark: ");
		float courseworkMark = getInput.nextFloat();

		if (ictMark > 30 && courseworkMark > 30) {
			float finalMark = (ictMark + courseworkMark) / 2;
			System.out.println("Congratulations! you passed the module");
			System.out.println("Final mark: " + finalMark);
		}

		else {
			System.out.println("Unfortunately, you have not pass the exam.");			
		}
	}
}