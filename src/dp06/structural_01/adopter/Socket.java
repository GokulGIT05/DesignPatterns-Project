package dp06.structural_01.adopter;

public class Socket {

	public Volt getVoltage() {
		return new Volt(120); // Always it will be 120 only.
	}

}
