package dp07.structural_02.composite;

import java.util.ArrayList;
import java.util.List;

public class Gk5_DrawingComposite implements Gk1_Shape {
	
	// Instance Group of Leaf Nodes
	List<Gk1_Shape> collectionOfNodes = new ArrayList<Gk1_Shape>();

	@Override
	public void draw(String color) {
		
		for(Gk1_Shape eachShape : collectionOfNodes) {
			eachShape.draw(color);
		}
		
	}
	
	
	// To Add Shapes
	public void add(Gk1_Shape shape) {
		collectionOfNodes.add(shape);
	}
	
	// To Delete all Values
	public void clearShapes() {
		collectionOfNodes.clear();
	}

}
