package dp16.behavioral_04.observer;

public interface Publisher {
	
	void register(Observer ob);
	
	void unRegister(Observer ob);
	
	void notifyAllObservers();

}
