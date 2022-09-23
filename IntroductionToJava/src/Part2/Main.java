package Part2;

public class Main {

	public static void main(String[] args) {
		// Working with classes:
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		// Class is a reference type so if we do this:
		customerManager = customerManager2;
		// customerManager's new is not work.
		customerManager.add();
		customerManager.delete();
		customerManager.update();

		// ReCap Demo Calculator:

		Calculator calculator = new Calculator();
		calculator.addition(1, 2);
		calculator.division(1, 2);
		calculator.multiplication(1, 2);
		calculator.subtraction(1, 2);

		// Working with Encapsulation and Constructor:

		Product product1 = new Product();
		product1.setDescription("Laptop");
		product1.setId(1);
		product1.setName("Asus");
		product1.setPrice(5000);
		product1.setStockAmount(3);

		Product product2 = new Product(2, "Laptop", "Apple", 10000, 4);

		System.out.println(product2.getName());
		ProductManager productManager = new ProductManager();
		productManager.add(product1);

	}

}
