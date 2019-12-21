package dp2.structural2.proxy;

public class CommandImpl implements CommandInterface {

	@Override
	public void executeCommand(String cmd) {
		
		System.out.println("Executing Command... from CommandImpl " +cmd);

	}

}
