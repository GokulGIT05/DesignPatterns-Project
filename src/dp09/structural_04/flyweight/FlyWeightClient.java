package dp09.structural_04.flyweight;


public class FlyWeightClient {

	public static void main(String[] args) {
		
		System.out.println("----- LINE -------");
		Gk1_Shape line1 = Gk4_ShapeFactory.getShape(ShapeTypeEnum.LINE);
		line1.draw("Gk1", "Red");
		System.out.println("Line 2 Object");
		
		Gk1_Shape line2 = Gk4_ShapeFactory.getShape(ShapeTypeEnum.LINE);
		line2.draw("Gk2", "Green");
		
		
		System.out.println("----- Oval - No Fill -------");
		Gk1_Shape oval1 = Gk4_ShapeFactory.getShape(ShapeTypeEnum.NO_FILL_OVAL);
		oval1.draw("Gk1", "Red");
		System.out.println("Line 2 Object");
		
		Gk1_Shape oval2 = Gk4_ShapeFactory.getShape(ShapeTypeEnum.NO_FILL_OVAL);
		oval2.draw("Gk2", "Green");
		
		
		System.out.println("----- Oval - Fill -------");
		Gk1_Shape ovalFill1 = Gk4_ShapeFactory.getShape(ShapeTypeEnum.FILL_OVAL);
		ovalFill1.draw("Gk1", "Red");
		System.out.println("Line 2 Object");
		
		Gk1_Shape ovalFill2 = Gk4_ShapeFactory.getShape(ShapeTypeEnum.FILL_OVAL);
		ovalFill2.draw("Gk2", "Green");
		
	}
}
