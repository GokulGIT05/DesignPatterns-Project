package dp12.structural_07.decorator;

public class Gk4SportsCar extends Gk3CarDecorator {

	public Gk4SportsCar(Gk1CarRootInterface thecar) {
		super(thecar);
	}

	@Override
	public void assembleCar() {
		super.assembleCar();
		System.out.println("Adding Features of Sports Car...");
	}
}
