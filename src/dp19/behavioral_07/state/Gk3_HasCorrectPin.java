package dp19.behavioral_07.state;

public class Gk3_HasCorrectPin implements AtmStateInterface {

	AtmMachine atmMachine;

	public Gk3_HasCorrectPin(AtmMachine atmMachine) {
		super();
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("Already Card is inserted");

	}

	@Override
	public void ejectCard() {

		System.out.println("Card will be ejected");
		atmMachine.setAtmCurrentState(atmMachine.getNoCard());

	}

	@Override
	public void insertPinNumber(int pinNumber) {
		System.out.println("Pin Number Already Inserted");

	}

	@Override
	public void withdrawMoney(int cash) {
		
		if(atmMachine.getCashAvailableInATM() > 0) {
			
			atmMachine.setCashAvailableInATM(atmMachine.getCashAvailableInATM() - cash);
			System.out.println("Cash is Withdraw : " + cash);
			
			atmMachine.setAtmCurrentState(atmMachine.getNoCard());
		}else {
			System.out.println("No Cash");
			atmMachine.setAtmCurrentState(atmMachine.getAtmOutOfMoney());
		}
	}

}
