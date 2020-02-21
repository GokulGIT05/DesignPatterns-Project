package dp02.creational_02.factory;

// We can make this factory class as abstract
public class ComputerFactoryClass {

	// Factory Method is used to get object based on types
	public static Computer getComputerUsingFactoryMethod(String type, String totalCapacity, String price) {

		if (type.equals("PC")) {
			return new PC(totalCapacity, price);
		} else if (type.equals("Server")) {
			return new Server(totalCapacity, price);
		}
		return null;
	}
}
