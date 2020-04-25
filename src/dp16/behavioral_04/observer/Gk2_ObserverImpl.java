package dp16.behavioral_04.observer;

public class Gk2_ObserverImpl implements Observer {
	
	private int applePriceOb;
	private int microsoftPriceOb;
	private int blackberryPriceOb;
	
	private static int observerCounter;

	private Publisher publisher;

	
	public Gk2_ObserverImpl(Publisher publisher) {
		super();
		this.publisher = publisher;
		
		++observerCounter;
		// Register this Observer to publisher
		publisher.register(this);
		
	}

	@Override
	public void update(int applePrice, int microsoftPrice, int blackberryPrice) {
		this.applePriceOb = applePrice;
		this.microsoftPriceOb = microsoftPrice;
		this.blackberryPriceOb = blackberryPrice;
		
		printPricesInConsole();
	}

	private void printPricesInConsole() {
		
		System.out.println("Observer type: "+observerCounter);
		
		System.out.println("applePrice: "+this.applePriceOb);
		System.out.println("microsoftPrice: "+ this.microsoftPriceOb);
		System.out.println("blackberryPrice: "+this.blackberryPriceOb);
		System.out.println("***********************************************");
		
	}
	
	

}
