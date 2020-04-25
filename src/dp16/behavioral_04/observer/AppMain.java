package dp16.behavioral_04.observer;

public class AppMain {

	public static void main(String[] args) {

		Gk1_PublisherImpl publisherObj = new Gk1_PublisherImpl();

		Gk2_ObserverImpl observeObj1 = new Gk2_ObserverImpl(publisherObj);

		publisherObj.setApplePrice(100);
		publisherObj.setBlackberryPrice(200);
		publisherObj.setMicrosoftPrice(1000);

		System.out.println();

		// Here prints two times, because we have to notify all observer this time we
		// will be having two observers. so each time modify it will be notified to all
		Gk2_ObserverImpl observeObj2 = new Gk2_ObserverImpl(publisherObj);
		publisherObj.setApplePrice(2500);
	}

}
