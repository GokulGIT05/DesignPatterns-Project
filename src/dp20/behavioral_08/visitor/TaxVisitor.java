package dp20.behavioral_08.visitor;

public class TaxVisitor implements VisitorInterface {

	@Override
	public int visit(Gk1_Tobaco tobaco) {
		return tobaco.getPrice() + 50;
	}

	@Override
	public int visit(Gk2_Liquor liqur) {
		return liqur.getPrice() + 30;
	}

	@Override
	public int visit(Gk3_Neccesity neccesityItems) {
		return neccesityItems.getPrice() + 5;
	}

}
