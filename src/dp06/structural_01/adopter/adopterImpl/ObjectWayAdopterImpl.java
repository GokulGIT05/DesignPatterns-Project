package dp2.structural1.adopter.adopterImpl;

import dp2.structural1.adopter.Socket;
import dp2.structural1.adopter.Volt;

public class ObjectWayAdopterImpl implements AdopterSocketInterface {

	// Object way. It Uses Composition Principle.

	Socket mainSocket = new Socket();

	@Override
	public Volt get3Volt() {
		Volt v = mainSocket.getVoltage(); // This always returns 120
		Volt threeVolt = adopterCalculateMethod(v, 40);
		return threeVolt;
	}

	@Override
	public Volt get12Volt() {
		Volt v = mainSocket.getVoltage(); // This always returns 120
		Volt twelveVolt = adopterCalculateMethod(v, 10);
		return twelveVolt;
	}

	@Override
	public Volt get120Volt() {
		return mainSocket.getVoltage();
	}

	private Volt adopterCalculateMethod(Volt v, int i) {

		int volt = v.getVoltNumber();
		Volt adoptiveObj = new Volt(volt / i);
		// new Volt(v.getVoltNumber()/i);
		return adoptiveObj;
	}

}
