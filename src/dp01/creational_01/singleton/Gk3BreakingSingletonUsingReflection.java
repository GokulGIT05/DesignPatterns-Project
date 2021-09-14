package dp01.creational_01.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Gk3BreakingSingletonUsingReflection {
	
	public static void main(String[] args) {
		
		SingletonDTOClass object1 = SingletonDTOClass.getSingletonObject();
		System.out.println(object1);
		
		SingletonDTOClass object2 = null;
		
		// Reflection APi
		try {
			Constructor<SingletonDTOClass> SingletonDTOClass = SingletonDTOClass.class.getDeclaredConstructor();
			// Singleton Object is destroyed
			SingletonDTOClass.setAccessible(true);
			object2 = SingletonDTOClass.newInstance();
			System.out.println(object2);
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		System.out.println(object1.hashCode());
		System.out.println(object2.hashCode());
	}
}
