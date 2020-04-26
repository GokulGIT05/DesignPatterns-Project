package dp18.behavioral_06.command;

/*
http://www.newthinktank.com/2012/09/command-design-pattern-tutorial/
*/

public class AppMain {

	public static void main(String[] args) {
		
		// Get the Television Object
		// Pass the Television Object into the command you need.
		
		ElectronicDeviceInterface televsionObj = RemoteForElectricalDevices.getTelevision();
		
		// Tv On.
		TurnTvOnCommand onCommand  = new TurnTvOnCommand(televsionObj);
		DeviceButton buttonClicked = new DeviceButton(onCommand);
		buttonClicked.buttonClick();
		System.out.println("***************************************************");
		
		// Tv OFF
		TurnTvOffCommand offCommandd = new TurnTvOffCommand(televsionObj);
		
		buttonClicked = new DeviceButton(offCommandd);
		buttonClicked.buttonClick();
		System.out.println("***************************************************");
		
		// Volume Up
		TvVolumeUpCommand volumeUp = new TvVolumeUpCommand(televsionObj);
		
		buttonClicked = new DeviceButton(volumeUp);
		buttonClicked.buttonClick();
		
		buttonClicked.buttonClick();
		buttonClicked.buttonClick();
		System.out.println("***************************************************");
		
		// Volume Down
		TvVolumeDownCommand volumeDown = new TvVolumeDownCommand(televsionObj);
		
		buttonClicked = new DeviceButton(volumeDown);
		buttonClicked.buttonClick();
		buttonClicked.buttonClick();
		
		
		
		
	}
}
