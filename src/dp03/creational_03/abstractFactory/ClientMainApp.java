package dp03.creational_03.abstractFactory;

import dp03.creational_03.abstractFactory.abstractBeans.DomesticAbstractBean;
import dp03.creational_03.abstractFactory.abstractBeans.WildAbstractBean;
import dp03.creational_03.abstractFactory.beans.Animals;

public class ClientMainApp {

	
	public static void main(String[] args) {
		
		Animals wild = FactoryClassToGetObject.getObject(new WildAbstractBean("LION"));
		System.out.println(wild.getAnimalName());
		System.out.println(wild);
		
		
		Animals domestic = FactoryClassToGetObject.getObject(new DomesticAbstractBean("GOAT"));
		System.out.println(domestic.getAnimalName());
		System.out.println(domestic);
	}

}
