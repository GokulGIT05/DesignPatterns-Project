package dp01.creational_01.singleton;

public class Gk2BillPughMainApp {

	public static void main(String[] args) {
		
		BillPughSingleton object1 = BillPughSingleton.getSingletonInstance();
		BillPughSingleton object2 = BillPughSingleton.getSingletonInstance();
		
		if(object1 == object2) {
			System.out.println("Both Instance are same.");
		}

	}
}
