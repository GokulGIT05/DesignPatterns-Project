package dp03.creational_03.abstractFactory.beans;

public abstract class Animals {

	public abstract String getAnimalName();

	@Override
	public String toString() {
		return "Animal [getAnimalName()=" + getAnimalName() + "]";
	}
	
}
