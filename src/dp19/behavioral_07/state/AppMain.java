package dp19.behavioral_07.state;

/*
http://www.newthinktank.com/2012/10/state-design-pattern-tutorial/
*/

public class AppMain {

	public static void main(String[] args) {

		// ATM Machine - this is context

		AtmMachine atmMachine = new AtmMachine();

		atmMachine.insertCard();

		atmMachine.insertPinNumber(1234);

		atmMachine.withDrawMoney(500);

		atmMachine.ejectCard();

		System.out.println(atmMachine.getCashAvailableInATM());

	}

}
