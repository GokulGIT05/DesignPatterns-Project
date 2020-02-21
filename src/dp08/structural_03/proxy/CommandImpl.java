package dp08.structural_03.proxy;

public class CommandImpl implements CommandInterface {

	@Override
	public void executeCommand(String cmd) {
		
		System.out.println("Executing Command... from CommandImpl " +cmd);

	}

}
