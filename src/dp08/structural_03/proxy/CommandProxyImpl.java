package dp08.structural_03.proxy;

import dp08.structural_03.proxy.CommandImpl;
import dp08.structural_03.proxy.CommandInterface;

public class CommandProxyImpl implements CommandInterface {

	boolean isUserAuthenticate;
	CommandInterface command;

	public CommandProxyImpl(String Uname, String pwd) {
		super();

		// Authenticating
		if ("Gk".equals(Uname) && "123".equals(pwd)) {
			isUserAuthenticate = true;
			System.out.println("The Given User is authenticated.");
		}
		command = new CommandImpl(); // Creating Object inside Constructor. Composition.
	}

	@Override
	public void executeCommand(String cmd) {

		if (isUserAuthenticate) {
			command.executeCommand(cmd);
		} else {
			if (cmd.startsWith("rm")) {
				throw new RuntimeException("User is not authenticate, so rm command wont be performed.");
			} else {
				command.executeCommand(cmd);
			}
		}

	}

}
