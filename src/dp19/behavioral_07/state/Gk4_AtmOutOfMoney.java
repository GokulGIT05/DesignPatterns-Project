package dp19.behavioral_07.state;

public class Gk4_AtmOutOfMoney implements AtmStateInterface {
	
	AtmMachine atmMachine;

	public Gk4_AtmOutOfMoney(AtmMachine atmMachine) {
		super();
		this.atmMachine = atmMachine;
	}
	

	@Override
	public void insertCard() {
		System.out.println("ATM OUT of Money ");
		
		
	}

	@Override
	public void ejectCard() {
		System.out.println("ATM OUT of Money ");
		
	}

	@Override
	public void insertPinNumber(int pinNumber) {
		System.out.println("ATM OUT of Money ");
		
	}

	@Override
	public void withdrawMoney(int cash) {
		System.out.println("ATM OUT of Money ");
		
	}

}
