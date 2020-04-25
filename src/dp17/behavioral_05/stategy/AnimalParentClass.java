package dp17.behavioral_05.stategy;

public class AnimalParentClass {
	
	
	private String animalName;
	
	private String noOfLegs;
	
	private String soundType;
	
	private FlyType flyType;
	

	public FlyType getFlyType() {
		return flyType;
	}

	public void setFlyType(FlyType flyType) {
		this.flyType = flyType;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(String noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	public String getSoundType() {
		return soundType;
	}

	public void setSoundType(String soundType) {
		this.soundType = soundType;
	}
	
	
	

}
