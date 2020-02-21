package dp02.creational_02.factory;

public class ApplicationTest {

	public static void main(String[] args) {

		Computer objectPC = ComputerFactoryClass.getComputerUsingFactoryMethod("PC", "1 TB", "50K");
		System.out.println(objectPC);

		Computer objectServer = ComputerFactoryClass.getComputerUsingFactoryMethod("Server", "100 TB", "10L");
		System.out.println(objectServer);

	}
}
