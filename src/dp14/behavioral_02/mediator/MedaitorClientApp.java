package dp14.behavioral_02.mediator;

public class MedaitorClientApp {

	public static void main(String[] args) {
		
		Gk1ChatMediatorInterface mediatorObj = new Gk4ChatMediatorImpl();
		
		Gk2UserAbstractClass user1 = new Gk3UserImpl(mediatorObj, "Gk1");
		Gk2UserAbstractClass user2 = new Gk3UserImpl(mediatorObj, "Gk2");
		Gk2UserAbstractClass user3 = new Gk3UserImpl(mediatorObj, "Gk3");
		Gk2UserAbstractClass user4 = new Gk3UserImpl(mediatorObj, "Gk4");
		
		mediatorObj.addUser(user1);
		mediatorObj.addUser(user2);
		mediatorObj.addUser(user3);
		mediatorObj.addUser(user4);
		
		// User 1 Sending Message to All
		user1.sendMessageToAllUser("Hi to All");
	}
}