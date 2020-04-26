package dp18.behavioral_06.command;

public class RemoteForElectricalDevices {

	public static ElectronicDeviceInterface getTelevision() {
		return new TelevisionDevice();
	}

}
