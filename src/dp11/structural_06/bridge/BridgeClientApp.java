package dp11.structural_06.bridge;

public class BridgeClientApp {

	public static void main(String[] args) {
		
		System.out.println("Main App Starts Executing...");
		
		Gk2_ShapeAbstractClass triangle = new Gk4_TriangleShape(new RedColor());
		triangle.drawShape();
		
		Gk2_ShapeAbstractClass pentagon = new Gk3_PentagonShape(new GreenColor());
		pentagon.drawShape();
		
		
	}

}
