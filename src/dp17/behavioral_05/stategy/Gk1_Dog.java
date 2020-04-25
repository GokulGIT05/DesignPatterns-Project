package dp17.behavioral_05.stategy;

public class Gk1_Dog extends AnimalParentClass {
	
	public Gk1_Dog() {
		
		setAnimalName("Doggy");
		setNoOfLegs("4");
		setSoundType("Bark");
		
		setFlyType(new CantFly()); // Setting the value for composition
	}
	
	public void dogClassMethod() {
		System.out.println("Inside Dog Class Method");
	}

}
