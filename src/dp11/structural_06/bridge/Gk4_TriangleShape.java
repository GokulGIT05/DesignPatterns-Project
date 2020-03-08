package dp11.structural_06.bridge;

public class Gk4_TriangleShape extends Gk2_ShapeAbstractClass {

	public Gk4_TriangleShape(Gk1_ColorInterface color) {
		super(color);
	}

	@Override
	public void drawShape() {
		
		System.out.println("Printing Trianlge shape with ");
		color.fillColorToShape();
	}

}
