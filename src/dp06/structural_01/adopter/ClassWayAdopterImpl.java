package dp06.structural_01.adopter;

import dp06.structural_01.adopter.Socket;
import dp06.structural_01.adopter.Volt;

public class ClassWayAdopterImpl extends Socket implements AdopterSocketInterface {

	// Using Inheritance.

	@Override
	public Volt get3Volt() {
		return adopterMethodForVolt(getVoltage(), 40);
	}

	@Override
	public Volt get12Volt() {
		return adopterMethodForVolt(getVoltage(), 10);
	}

	@Override
	public Volt get120Volt() {
		return getVoltage();
	}

	private Volt adopterMethodForVolt(Volt voltage, int i) {
		return new Volt(voltage.getVoltNumber() / i);
	}

}
