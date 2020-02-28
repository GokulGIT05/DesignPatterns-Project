package dp07.structural_02.composite;

public class TestClient {

	public static void main(String[] args) {
		
		// Three Basic Principles.
		// 1. Base Component, 2. Leaf/Node, 3. Composite
		
		// Node Creation
		Gk1_Shape triangle1 = new Gk2_TriangleNode();
		Gk1_Shape circle1 = new Gk3_CircleNode();
		
		// Composite
		Gk5_DrawingComposite compositeObj = new Gk5_DrawingComposite();
		
		compositeObj.add(triangle1);
		compositeObj.add(circle1);
		
		compositeObj.draw("Red");
		
		compositeObj.clearShapes();
		System.out.println("\n********************************\n");
		
		// Example 2:
		Gk1_Shape triangle2 = new Gk2_TriangleNode();
		Gk1_Shape circle2 = new Gk3_CircleNode();
		Gk1_Shape rectangle = new Gk4_RectangleNode();
		
		compositeObj.add(triangle2);
		compositeObj.add(circle2);
		compositeObj.add(rectangle);
		
		compositeObj.draw("GREEN");
		
		
	}
}
