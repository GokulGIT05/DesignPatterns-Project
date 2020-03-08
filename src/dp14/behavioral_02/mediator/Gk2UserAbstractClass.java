package dp14.behavioral_02.mediator;

public abstract class Gk2UserAbstractClass {

	protected Gk1ChatMediatorInterface mediator;
	protected String userName;

	public Gk2UserAbstractClass(Gk1ChatMediatorInterface mediator, String userName) {
		super();
		this.mediator = mediator;
		this.userName = userName;
	}
	
	public abstract void sendMessageToAllUser(String sendMessage);
	
	public abstract void recieveMessage(String recievedMessage);
	

}
