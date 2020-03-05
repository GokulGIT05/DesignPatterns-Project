package dp09.structural_04.flyweight;

public class Gk3_Oval implements Gk1_Shape {

	// Extrensic Property
	boolean isFillColor;
	
	public Gk3_Oval(boolean isFillColor) {
		super();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.isFillColor = isFillColor;
	}

	@Override
	public void draw(String name, String type) {
		
		System.out.println("Inside Gk3_Oval");
		System.out.println("The Oval done by " + name);
		System.out.println("The color of Oval is " + type);
		
		if(isFillColor) {
			System.out.println("The Circle is filled with the same color.");
		}
		System.out.println("***********************************");

	}

}
