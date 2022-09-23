package Part1;

public class Main {

	public static void main(String[] args) {
		// Print Console:
		System.out.println("Hello Java");

		// ------------------------------------------------------------------------

		// if we use one information in a lot of places, we should use it like this:
		int numberOfStudents = 12;
		String message = "Number of students: ";
		System.out.println(message + numberOfStudents);
		System.out.println(message + numberOfStudents);
		System.out.println(message + numberOfStudents);

		// ------------------------------------------------------------------------

		// Working with if/else:
		int number = 19;
		if (number < 20) {
			System.out.println("The number is less than 20.");
		} else if (number > 20) {
			System.out.println("The number is bigger than 20.");
		} else {
			System.out.println("The number is equal 20.");
		}

		// ------------------------------------------------------------------------

		// ReCap Demo 1: Find the biggest number.
		int number1 = 20;
		int number2 = 10;
		int number3 = 30;
		int biggest = number1;
		if (number2 > biggest) {
			biggest = number2;
		}
		if (number3 > biggest) {
			biggest = number3;
		}
		System.out.println("The biggest number is: " + biggest);

		// ------------------------------------------------------------------------

		// Working with Switch blocks:
		char grade = 'A';

		switch (grade) {
		case 'A': {
			System.out.println("Perfect: You passed.");
			break;
		}
		case 'B': {
			System.out.println("Very good: You passed.");
			break;
		}
		case 'F': {
			System.out.println("You failed.");
			break;
		}
		default:
			System.out.println("You entered unvalid note.");
		}

		// ------------------------------------------------------------------------

		// Working with For loops:
		System.out.print("For loops: ");
		for (int i = 1; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// ------------------------------------------------------------------------

		// Working with while loops:
		int i = 1;
		System.out.print("While loops: ");
		while (i < 10) {
			System.out.print(i + " ");
			i++;
		}

	}
}