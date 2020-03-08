package dp12.structural_07.decorator;

public class Gk3CarDecorator implements Gk1CarRootInterface {
	
	// Composition
	protected Gk1CarRootInterface thecar;
	
	public Gk3CarDecorator(Gk1CarRootInterface thecar) {
		super();
		this.thecar = thecar;
	}

	@Override
	public void assembleCar() {
		this.thecar.assembleCar();
	}
	
}
