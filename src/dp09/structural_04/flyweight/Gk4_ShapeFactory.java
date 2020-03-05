package dp09.structural_04.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Gk4_ShapeFactory {

	private static Map<ShapeTypeEnum, Gk1_Shape> shapes = new HashMap<ShapeTypeEnum, Gk1_Shape>();

	public static Gk1_Shape getShape(ShapeTypeEnum type) {

		Gk1_Shape objectShape = shapes.get(type);

		if (objectShape == null) {

			if (type.equals(ShapeTypeEnum.LINE)) {
				objectShape = new Gk2_Line();
			} else if (type.equals(ShapeTypeEnum.FILL_OVAL)) {
				objectShape = new Gk3_Oval(true);
			} else if (type.equals(ShapeTypeEnum.NO_FILL_OVAL)) {
				objectShape = new Gk3_Oval(true);
			}
			
			shapes.put(type, objectShape);
		}
		return objectShape;
	}

}
