package dp03.creational_03.abstractFactory.beans;

public class DomesticAnimalImpl extends Animals{

	private String name;
	
	public DomesticAnimalImpl(String name) {
		super();
		this.name = name;
	}


	@Override
	public String getAnimalName() {
		return name;
	}

}
