package dp1.creational.gk1.singleton;

public class Gk1SingletonDemoApp {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		// SingletonDTOClass obj = new SingletonDTOClass(); // It wont work bcoz we have
		// private Constructor.
		
		SingletonDTOClass singletonObj1 = SingletonDTOClass.getSingletonObject();
		System.out.println("First Obj :"+singletonObj1);
		
		SingletonDTOClass singletonObj2 = SingletonDTOClass.getSingletonObject();
		System.out.println("Second Obj :"+singletonObj2);
		
		if(singletonObj1 == singletonObj2) {
			System.out.println("Both Objects are EQUAL");
		}
		
		System.out.println("The HasCode of singletonObj1: "+singletonObj1.hashCode());
		System.out.println("The HasCode of singletonObj2: "+singletonObj2.hashCode());
		
		// 2. Other way to create an object. But This will fail.
		/*SingletonDTOClass singletonObj3 = SingletonDTOClass.class.newInstance();
		System.out.println(singletonObj3);*/

	}

}
