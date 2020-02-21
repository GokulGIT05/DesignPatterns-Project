package dp05.creational_05.prototype;

import java.util.List;

public class PrototypeMainApp {

	// https://www.journaldev.com/1440/prototype-design-pattern-in-java
	@SuppressWarnings("unused")
	public static void main(String[] args) throws CloneNotSupportedException {

		EmployeePrototypeDP mainObj = new EmployeePrototypeDP();
		List<String> mainEmpList = mainObj.loadEmployee();
		mainObj.getEmpList().remove(0); // If we alter the object in main, then it will reflect in all the cloned
										// objects.

		EmployeePrototypeDP cloneObj1 = mainObj.clone();
		cloneObj1.getEmpList().add("Gk50");

		EmployeePrototypeDP cloneObj2 = mainObj.clone();
		cloneObj2.getEmpList().remove(0);

		System.out.println("Main Object List of Employees: " + mainObj.getEmpList());
		System.out.println("Clone1 Object : " + cloneObj1.getEmpList());
		System.out.println("Clone2 Object: " + cloneObj2.getEmpList());
	}

}
