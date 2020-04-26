package dp20.behavioral_08.visitor;

public class Gk1_Tobaco implements VisitableInterface{

	private int price;

	public Gk1_Tobaco(int price) {
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
