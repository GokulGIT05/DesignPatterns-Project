package dp20.behavioral_08.visitor;

public class Gk2_Liquor implements VisitableInterface {
	
	private int price;

	public Gk2_Liquor(int price) {
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
