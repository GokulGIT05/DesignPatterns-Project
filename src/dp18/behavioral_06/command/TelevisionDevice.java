package dp18.behavioral_06.command;

public class TelevisionDevice implements ElectronicDeviceInterface {

	private int volume;

	@Override
	public void deviceOn() {

		System.out.println("Television is Switched On");

	}

	@Override
	public void deviceOff() {

		System.out.println("Television is Swithed Off");

	}

	@Override
	public void volumeUp() {

		++volume;

		System.out.println("Television Volumne Up : " + volume);

	}

	@Override
	public void volumeDown() {
		--volume;
		System.out.println("Television Volumne Up : " + volume);
	}

}
