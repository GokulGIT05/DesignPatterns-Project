package dp18.behavioral_06.command;

public class TurnTvOffCommand implements CommandInterface {
	
	private ElectronicDeviceInterface device;

	public TurnTvOffCommand(ElectronicDeviceInterface device) {
		super();
		this.device = device;
	}

	// Operation
	@Override
	public void execute() {

		device.deviceOff();

	}

}
