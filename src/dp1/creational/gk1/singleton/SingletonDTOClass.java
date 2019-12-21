package dp1.creational.gk1.singleton;

public class SingletonDTOClass {

	// Step 1. Create a static Variable of Type Class.
	private static SingletonDTOClass singletonDTO = null;

	// Step 2. Create a private Default - Constructor.
	private SingletonDTOClass() {

	}

	// Step 3. Create a Public Static getMethod.
	public static SingletonDTOClass getSingletonObject() {

		// To Access singletonDTO inside static method, we need create variable with
		// static modifier
		if (singletonDTO == null) {
			singletonDTO = new SingletonDTOClass();
		}

		return singletonDTO;
	}

}
