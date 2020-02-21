package dp04.creational_04.builder;

// Other ways to get object using factorry method
public class CarBuilderDirector {
	
	public static Car getBasicCar() {
		
		return new Car.CarBuilderInnerStaticClass("Mini", "2020")
						.build();
		
	}

}
