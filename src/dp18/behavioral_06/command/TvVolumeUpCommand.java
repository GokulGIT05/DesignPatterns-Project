package dp18.behavioral_06.command;

public class TvVolumeUpCommand implements CommandInterface{
	
	
	private ElectronicDeviceInterface device;

	public TvVolumeUpCommand(ElectronicDeviceInterface device) {
		super();
		this.device = device;
	}

	// Operation
	@Override
	public void execute() {

		device.volumeUp();

	}

}
