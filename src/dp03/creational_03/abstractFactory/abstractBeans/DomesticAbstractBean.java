package dp03.creational_03.abstractFactory.abstractBeans;

import dp03.creational_03.abstractFactory.AnimalFactoryInterface;
import dp03.creational_03.abstractFactory.beans.Animals;
import dp03.creational_03.abstractFactory.beans.DomesticAnimalImpl;

public class DomesticAbstractBean implements AnimalFactoryInterface {


	private String name;
	
	public DomesticAbstractBean(String name) {
		super();
		this.name = name;
	}
	
	// Got the Domestic Animal.
	@Override
	public Animals createAnimal() {
		return new DomesticAnimalImpl(name);
	}

}
