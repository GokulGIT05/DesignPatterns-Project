package dp03.creational_03.abstractFactory;

import dp03.creational_03.abstractFactory.beans.Animals;

public class FactoryClassToGetObject {
	
	public static Animals getObject(AnimalFactoryInterface interfaceReference) {
		return interfaceReference.createAnimal();
	}

}
