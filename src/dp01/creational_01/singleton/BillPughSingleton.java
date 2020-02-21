package dp01.creational_01.singleton;

public class BillPughSingleton {
	
	// 1. Private Constructor
	private BillPughSingleton() {
		
	}

	// Inner Class
	private static class SingletonHelper {
		private static BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getSingletonInstance() {
		return SingletonHelper.INSTANCE;	
	}
	
	
}
