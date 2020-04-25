package dp17.behavioral_05.stategy;

public class Gk2_Bird extends AnimalParentClass {
	
	
	// need to make sure the bird can fly not not
	
	public Gk2_Bird() {
		
		setAnimalName("BirdName");
		setNoOfLegs("2");
		setSoundType("BirdSound");
		
		setFlyType(new CanFly());
	
	}

}
