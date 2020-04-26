package dp20.behavioral_08.visitor;

/*
http://www.newthinktank.com/2012/11/visitor-design-pattern-tutorial/
*/

public class AppMain {

	public static void main(String[] args) {

		TaxVisitor taxCalcObj = new TaxVisitor();

		Gk1_Tobaco tobaco = new Gk1_Tobaco(100);
		int priceWithTax1 = tobaco.accept(taxCalcObj);
		System.out.println(priceWithTax1);

		Gk2_Liquor liquor = new Gk2_Liquor(100);
		int priceWithTax2 = liquor.accept(taxCalcObj);
		System.out.println(priceWithTax2);

		Gk3_Neccesity milk = new Gk3_Neccesity(100);
		int priceWithTax3 = milk.accept(taxCalcObj);
		System.out.println(priceWithTax3);

		// Advantage is, we easily create HolidayTaxCalcularot and use the same logic
	}

}
