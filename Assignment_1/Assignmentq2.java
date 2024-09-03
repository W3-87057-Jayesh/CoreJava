import java.util.Scanner;

public class Assignmentq2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		System.out.println("Enter the first number: ");

		if (a.hasNextInt()) {
			System.out.println("Error: The first input is not a valid double.");
		} else {
			if (a.hasNextDouble()) {
				double num1 = a.nextDouble();
				System.out.println("Enter the second number: ");
				if (a.hasNextInt()) {
					System.out.println("Error: The second input is not a valid double.");
				} else {
					if (a.hasNextDouble()) {
						double num2 = a.nextDouble();
						double average = (num1 + num2) / 2;
						System.out.println("The average is: " + average);
					} else {
						System.out.println("Error: The second input is not a valid double.");
					}
				}

			} else {
				System.out.println("Error: The first input is not a valid double.");

			}

		}a.close();
	}
}