package dp18.behavioral_06.command;

public class TvVolumeDownCommand implements CommandInterface {

	private ElectronicDeviceInterface device;

	public TvVolumeDownCommand(ElectronicDeviceInterface device) {
		super();
		this.device = device;
	}

	// Operation
	@Override
	public void execute() {

		device.volumeDown();

	}

}
