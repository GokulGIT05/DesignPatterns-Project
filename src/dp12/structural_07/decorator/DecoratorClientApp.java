package dp12.structural_07.decorator;

public class DecoratorClientApp {

	public static void main(String[] args) {
		
		Gk1CarRootInterface sportsCar = new Gk4SportsCar(new Gk2BasicCar());
		sportsCar.assembleCar();
		
		System.out.println("*****");

		Gk1CarRootInterface comboCar = new Gk5LuxaryCar(new Gk4SportsCar(new Gk2BasicCar()));
		comboCar.assembleCar();
	}

}
