package InheritanceDemo;

public class Main {

	public static void main(String[] args) {

 
		CreditUi creditUi = new CreditUi();
		creditUi.CalculateCredit(new TeacherCreditManager()); 
		//We used BaseCreditManager so we can calculate any class which extends BaseCreditManager.
		

	}

}
