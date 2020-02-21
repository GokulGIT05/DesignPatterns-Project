package dp03.creational_03.abstractFactory.abstractBeans;

import dp03.creational_03.abstractFactory.AnimalFactoryInterface;
import dp03.creational_03.abstractFactory.beans.Animals;
import dp03.creational_03.abstractFactory.beans.WildAnimalImpl;

public class WildAbstractBean implements AnimalFactoryInterface {

	private String name;

	public WildAbstractBean(String name) {
		super();
		this.name = name;
	}

	@Override
	public Animals createAnimal() {
		return new WildAnimalImpl(name);
	}

}
