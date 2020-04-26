package dp19.behavioral_07.state;

public class Gk1_HasCard implements AtmStateInterface {

	
	AtmMachine atmMachine;
	
	
	public Gk1_HasCard(AtmMachine atmMachine) {
		super();
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		
		System.out.println("Gk1_HasCard: Insert Card");

	}

	@Override
	public void ejectCard() {
		System.out.println("Gk1_HasCard: Card Ejected");
		atmMachine.setAtmCurrentState(atmMachine.getNoCard());
	}

	@Override
	public void insertPinNumber(int pinNumber) {
		System.out.println("Gk1_HasCard: Pin Number Inserted");
		
		if(pinNumber == 1234) {
			atmMachine.setPinAuthenticate(true);
			System.out.println("Pin Authenticated");
			atmMachine.setAtmCurrentState(atmMachine.getHasCorrectPin());
		} else {
			System.out.println("Pin is not Valid");
			atmMachine.setAtmCurrentState(atmMachine.getNoCard());
		}
	}

	@Override
	public void withdrawMoney(int cash) {	
		
		System.out.println("Gk1_HasCard: withDrawMoney");		

	}

}
