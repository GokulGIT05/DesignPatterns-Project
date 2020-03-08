package dp12.structural_07.decorator;

public class Gk5LuxaryCar extends Gk3CarDecorator {

	public Gk5LuxaryCar(Gk1CarRootInterface thecar) {
		super(thecar);
	}

	@Override
	public void assembleCar() {
		super.assembleCar();
		System.out.println("Adding Features of Luxary Car...");
	}
}
