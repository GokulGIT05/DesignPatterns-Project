package dp18.behavioral_06.command;

public class TurnTvOnCommand implements CommandInterface {
	
	private ElectronicDeviceInterface device ;
	
	public TurnTvOnCommand(ElectronicDeviceInterface device) {
		super();
		this.device = device;
	}

	// Operation
	@Override
	public void execute() {
		
		device.deviceOn();
		
	}

}
