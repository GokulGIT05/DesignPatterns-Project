package dp16.behavioral_04.observer;

import java.util.ArrayList;
import java.util.List;

public class Gk1_PublisherImpl implements Publisher {

	private List<Observer> allObservers;

	private int applePrice;
	private int microsoftPrice;
	private int blackberryPrice;

	public Gk1_PublisherImpl() {
		allObservers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer ob) {
		allObservers.add(ob);
	}

	@Override
	public void unRegister(Observer ob) {

		int index = allObservers.indexOf(ob);
		allObservers.remove(index);
		System.out.println("Observer Register: index " + index);

	}

	@Override
	public void notifyAllObservers() {

		for (Observer ob : allObservers) {
			ob.update(applePrice, microsoftPrice, blackberryPrice);
		}
	}

	// Setters and it will notify
	public void setApplePrice(int applePrice) {
		this.applePrice = applePrice;
		notifyAllObservers();
	}

	public void setMicrosoftPrice(int microsoftPrice) {
		this.microsoftPrice = microsoftPrice;
		notifyAllObservers();
	}

	public void setBlackberryPrice(int blackberryPrice) {
		this.blackberryPrice = blackberryPrice;
		notifyAllObservers();
	}

}
