package dp20.behavioral_08.visitor;

public class Gk3_Neccesity implements VisitableInterface {
	
	private int price;

	public Gk3_Neccesity(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public int accept(VisitorInterface visitor) {
		return visitor.visit(this);
	}
}
