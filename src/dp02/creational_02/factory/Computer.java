package dp02.creational_02.factory;

public abstract class Computer {
	
	public abstract String getHardDiskCapacity();
	public abstract String getPrice();
	
	@Override
	public String toString() {
		return "Computer [getHardDiskCapacity()=" + getHardDiskCapacity() + ", getPrice()=" + getPrice() + "]";
	}
	
	

}
