package dp02.creational_02.factory;

public class PC extends Computer {

	private String totalCapacity;

	private String price;

	public PC(String totalCapacity, String price) {
		super();
		this.totalCapacity = totalCapacity;
		this.price = price;
	}

	@Override
	public String getHardDiskCapacity() {
		return totalCapacity;
	}

	@Override
	public String getPrice() {
		return price;
	}
	
}

