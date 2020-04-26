package dp19.behavioral_07.state;

public class Gk2_NoCard implements AtmStateInterface {

	AtmMachine atmMachine;

	public Gk2_NoCard(AtmMachine atmMachine) {
		super();
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		
		System.out.println("Gk2_NoCard: Please Insert Card");
		atmMachine.setAtmCurrentState(atmMachine.getHasCard());

	}

	@Override
	public void ejectCard() {
		System.out.println("Gk2_NoCard: Card is Ejected");
	}

	@Override
	public void insertPinNumber(int pinNumber) {
		System.out.println("Gk2_NoCard: No Card");
	}

	@Override
	public void withdrawMoney(int cash) {	
		
		System.out.println("Gk2_NoCard: No Card");		

	}

}
