package dp11.structural_06.bridge;

public class Gk3_PentagonShape extends Gk2_ShapeAbstractClass {

	public Gk3_PentagonShape(Gk1_ColorInterface color) {
		super(color);
	}

	@Override
	public void drawShape() {
		
		System.out.println("Printing Pentagon shape with ");
		color.fillColorToShape();
	}

}
