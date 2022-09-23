package Part2;

public class Methods {

	public static void main(String[] args) {
		findingNumber();
		add();
		delete();
		update();
		System.out.println(sum(7, 5));
		System.out.println(city());
		System.out.println(sum2(12,532,352,53,3,354,5));

	}

	// Understanding the methods:
	public static void findingNumber() {
		int[] numbers = { 1, 2, 3, 4, 5, 7, 9, };
		int searched = 7;
		boolean isThere = false;

		for (int number : numbers) {
			if (searched == number) {
				isThere = true;
				break;
			}
		}
		if (isThere == true)
			giveMessage("Number is exist: " + searched);
		else
			giveMessage("Number is not exist: " + searched);

	}

	public static void giveMessage(String message) {
		System.out.println(message);
	}

	// Methods with parameters:
	public static void add() {
		System.out.println("Added.");
	}

	public static void update() {
		System.out.println("Updated.");
	}

	public static void delete() {
		System.out.println("Deleted.");
	}

	public static int sum(int number1, int number2) {
		return number1 + number2;
	}

	public static String city() {
		return "İstanbul";
	}

	// Variable Arguments:
	public static int sum2(int... numbers) {
		int result = 0;
		for (int number : numbers) {
			result = result + number;
		}
		return result;
	}

}
