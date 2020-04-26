package dp19.behavioral_07.state;

public class AtmMachine {

	// Need to define all states here.

	private AtmStateInterface hasCard;
	private AtmStateInterface noCard;
	private AtmStateInterface hasCorrectPin;
	private AtmStateInterface atmOutOfMoney;

	private AtmStateInterface atmCurrentState;

	private int CashAvailableInATM;
	private boolean isPinAuthenticate;

	// Initializing all Parameters
	public AtmMachine() {

		this.hasCard = new Gk1_HasCard(this);
		this.noCard = new Gk2_NoCard(this);
		this.hasCorrectPin = new Gk3_HasCorrectPin(this);
		this.atmOutOfMoney = new Gk4_AtmOutOfMoney(this);

		this.CashAvailableInATM = 25000;
		this.isPinAuthenticate = false;
		
		this.atmCurrentState = this.noCard;
	}

	// *******************************************************************
	// All 4 Operation Methods.
	public void insertCard() {
		atmCurrentState.insertCard();
	}

	public void ejectCard() {
		atmCurrentState.ejectCard();
	}

	public void insertPinNumber(int pin) {
		atmCurrentState.insertPinNumber(pin);
	}

	public void withDrawMoney(int cash) {
		atmCurrentState.withdrawMoney(cash);
	}
	
	// *******************************************************************

	public AtmStateInterface getAtmCurrentState() {
		return atmCurrentState;
	}

	public void setAtmCurrentState(AtmStateInterface atmCurrentState) {
		this.atmCurrentState = atmCurrentState;
	}

	// Getters of 4 State
	public AtmStateInterface getHasCard() {
		return hasCard;
	}

	public AtmStateInterface getNoCard() {
		return noCard;
	}

	public AtmStateInterface getHasCorrectPin() {
		return hasCorrectPin;
	}

	public AtmStateInterface getAtmOutOfMoney() {
		return atmOutOfMoney;
	}

	// Other Two Fields

	public boolean isPinAuthenticate() {
		return isPinAuthenticate;
	}

	public void setPinAuthenticate(boolean isPinAuthenticate) {
		this.isPinAuthenticate = isPinAuthenticate;
	}

	public int getCashAvailableInATM() {
		return CashAvailableInATM;
	}

	public void setCashAvailableInATM(int cashAvailableInATM) {
		CashAvailableInATM = cashAvailableInATM;
	}

}
