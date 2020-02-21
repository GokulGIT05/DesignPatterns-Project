package dp03.creational_03.abstractFactory.beans;

public class WildAnimalImpl extends Animals {

	private String name;

	public WildAnimalImpl(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getAnimalName() {
		return name;
	}

}
