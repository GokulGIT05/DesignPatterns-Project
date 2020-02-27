package dp04.creational_04.builder;


public class ClientMainApp {

	public static void main(String[] args) {

		// Unless until required don't go for builder patterns. Use factory Pattern.

		// Use only when more number of parameters are present.

		Car object1 = new Car.CarBuilderInnerStaticClass("Sedan", "2018")
								.build();
		System.out.println(object1);

		Car object2 = new Car.CarBuilderInnerStaticClass("XUV", "2019")
								.setElectric(true)
								.setAutomatic(true)
								.setColor("Black")
								.build();
		System.out.println(object2);
		
		System.out.println("******************");
		
		// Using Director to get predefined objects
		Car basicCar = CarBuilderDirector.getBasicCar();
		System.out.println(basicCar);
	}

}
