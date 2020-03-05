package dp09.structural_04.flyweight;

public class Gk2_Line implements Gk1_Shape {

	public Gk2_Line() {

		// Making the object to take more time to create.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void draw(String name, String color) {

		System.out.println("Inside Gk2_Line");
		System.out.println("The Line done by " + name);
		System.out.println("The color of Line is " + color);
		System.out.println("***********************************");

	}

}
