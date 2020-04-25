package dp17.behavioral_05.stategy;

public class AppMain {

	public static void main(String[] args) {
		
		AnimalParentClass doggy = new Gk1_Dog();
		
		AnimalParentClass sparrow = new Gk2_Bird();
		
		System.out.println(doggy.getAnimalName());
		System.out.println(doggy.getNoOfLegs());
		System.out.println(doggy.getFlyType().getFlyMethod());
		System.out.println("*********************************");
		
		System.out.println(sparrow.getAnimalName());
		System.out.println(sparrow.getNoOfLegs());
		System.out.println(sparrow.getFlyType().getFlyMethod());
		

	}

}
