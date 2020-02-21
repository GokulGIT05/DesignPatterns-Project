package dp06.structural_01.adopter;

public class Volt {

	int voltNumber;

	public Volt(int voltNumber) {
		super();
		this.voltNumber = voltNumber;
	}

	public int getVoltNumber() {
		return voltNumber;
	}

	public void setVoltNumber(int voltNumber) {
		this.voltNumber = voltNumber;
	}

	@Override
	public String toString() {
		return "Volt [voltNumber=" + voltNumber + "]";
	}

}
