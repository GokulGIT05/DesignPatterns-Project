package dp14.behavioral_02.mediator;

public class Gk3UserImpl extends Gk2UserAbstractClass {

	// Constructor to initialize SuperClass Objects
	public Gk3UserImpl(Gk1ChatMediatorInterface mediator, String userName) {
		super(mediator, userName);
	}

	@Override
	public void sendMessageToAllUser(String sendMessage) {
		System.out.println("Sending Message to All from the user: " + userName);
		mediator.sendMessage(sendMessage, this);
	}

	@Override
	public void recieveMessage(String recievedMessage) {
		System.out.println(this.userName+": Message Recieved: " + recievedMessage);
	}

}
