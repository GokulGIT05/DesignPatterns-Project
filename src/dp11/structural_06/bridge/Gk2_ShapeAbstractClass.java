package dp11.structural_06.bridge;

public abstract class Gk2_ShapeAbstractClass {
	
	Gk1_ColorInterface color;

	public Gk2_ShapeAbstractClass(Gk1_ColorInterface color) {
		super();
		this.color = color;
	}
	
	public abstract void drawShape();

}
