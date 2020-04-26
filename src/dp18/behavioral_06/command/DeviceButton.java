package dp18.behavioral_06.command;

public class DeviceButton {
	// This class is used to extending the functionalaity. We can easily add undo operation like that 
	
	CommandInterface command ;

	public DeviceButton(CommandInterface command) {
		super();
		this.command = command;
	}
	
	public void buttonClick() {
		command.execute();
	}

}
