package Part1;

public class Main2 {

	public static void main(String[] args) {

		// Working with Arrays:
		String[] students = new String[3];
		students[0] = "Emre";
		students[1] = "Emir";
		students[2] = "Eymen";

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		// foreach:
		for (String student : students) {
			System.out.println(student);
		}

		// ----------------------------------------------------------------------------

		// ReCapDemo2: Finding Max number and total in Array
		double numbers[] = { 3.1, 5.4, 1.3, 1.2, 2.5 };
		double total = 0;
		double max = numbers[0];
		for (double number : numbers) {
			if (max < number) {
				max = number;
			}
			total = total + number;
		}
		System.out.println("Total number = " + total);
		System.out.println("Max number = " + max);

		// ----------------------------------------------------------------------------

		// Working with multiDimentional Arrays:

		String[][] cities = new String[3][3];
		cities[0][0] = "İstanbul";
		cities[0][1] = "Ankara";
		cities[0][2] = "İzmir";
		cities[1][0] = "Konya";
		cities[1][1] = "Sivas";
		cities[1][2] = "Malatya";
		cities[2][0] = "Kastamonu";
		cities[2][1] = "Bursa";
		cities[2][2] = "Balıkesir";

		for (int i = 0; i < cities.length; i++) {
			System.out.println("------------");
			for (int j = 0; j < cities.length; j++) {
				System.out.println(cities[i][j]);
			}
		}

		// ------------------------------------------------------------------------------

		// Working with Strings:

		String message = "The weather is beautiful today.";
		
		System.out.println("Message length = " + message.length());
		System.out.println("5. word = " + message.charAt(4));
		System.out.println(message.concat("Yey"));
		System.out.println(message.startsWith("a"));
		System.out.println(message.endsWith("."));
		System.out.println(message.replace(" ", "-"));
		System.out.println(message.substring(5,9));
		for(String word: message.split(" ")) {
			System.out.println(word);
		}
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		// ------------------------------------------------------------------------------
		
		//Mini Project1 is number prime? : 
		int number =11;
		boolean isPrime= true;
		for(int i = 2;i<number;i++) {
			
			if(number%i ==0) {
				isPrime = false;
			}
		}
		if(isPrime==true) {
			System.out.println("The "+number + " is prime");
		}
			else
				System.out.println("The " +number+" is not prime");
		
		
		// ------------------------------------------------------------------------------
		
		//Mini Project3 is number perfect? : 
		int number1 = 6;
		int total1 = 0;
		for (int i = 1; i < number1; i++) {
			if(number1%i == 0) {
				total1 =total1 +i;
			}
		}
		if(total1 == number1) {
			System.out.println("its perfect number");
		}
		else
			System.out.println("its not a perfect number");
		
		
		// ------------------------------------------------------------------------------
		
		//Mini Project5 finding number:
		int[] numbers1 = {1,2,5,7,9,0};
		int findingNumber = 3;
		boolean isThere = false;
		for (int i : numbers1) {
			if(findingNumber == i) {
				isThere=true;
			}
		}
		if(isThere) {
			System.out.println("The number exist");
		}
		else
			System.out.println("The number not exist");
	}
}
