package dp03.creational_03.abstractFactory;

import dp03.creational_03.abstractFactory.beans.Animals;

public interface AnimalFactoryInterface {

	// Should have abstract parent class composition
	public abstract Animals createAnimal();
}
