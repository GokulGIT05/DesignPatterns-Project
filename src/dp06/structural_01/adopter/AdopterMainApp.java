 package dp06.structural_01.adopter;

public class AdopterMainApp {
	
	// https://www.journaldev.com/1487/adapter-design-pattern-java
	public static void main(String[] args) {

		Socket simpleSocket = new Socket();
		System.out.println(simpleSocket.getVoltage().getVoltNumber());
		System.out.println();

		// There are two ways to implement adopterPattern
		UsingCompositionObject();
		UsingInheritanceClass();

	}

	private static void UsingCompositionObject() {
		System.out.println("Using Composition");
		ObjectWayAdopterImpl adopterObj = new ObjectWayAdopterImpl();
		System.out.println(adopterObj.get3Volt());
		System.out.println(adopterObj.get12Volt());
		System.out.println(adopterObj.get120Volt());
		// Got the Volt object with different voltages.
		System.out.println();

	}

	private static void UsingInheritanceClass() {
		ClassWayAdopterImpl adopterObj = new ClassWayAdopterImpl();
		System.out.println("Using Inheritance");
		System.out.println(adopterObj.get3Volt());
		System.out.println(adopterObj.get12Volt());
		System.out.println(adopterObj.get120Volt()); // Default

	}

}
