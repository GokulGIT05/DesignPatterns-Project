package dp05.creational_05.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeePrototypeDP implements Cloneable {
	
	private List<String> empList;

	public EmployeePrototypeDP() {
		super();
		empList = new ArrayList<String>();
	}

	// Overloaded Constructor is used in deep cloning
	public EmployeePrototypeDP(List<String> empList) {
		super();
		this.empList = empList;
	}

	public List<String> loadEmployee() {
		// Loading Employee From Database
		empList.add("Gk1");
		empList.add("Gk2");
		empList.add("Gk3");
		empList.add("Gk4");

		return empList;
	}

	// Getter
	public List<String> getEmpList() {
		return empList;
	}

	// Why are we overriding ?
	// We are not initiating an object via constructor. So we are performing deep cloning.
	@Override
	public EmployeePrototypeDP clone() throws CloneNotSupportedException{
		List<String> tempCopy = new ArrayList<String>();

		for (String str : this.getEmpList()) {
			tempCopy.add(str);
		}
		
		EmployeePrototypeDP deepClonedObj = new EmployeePrototypeDP(tempCopy);

		return deepClonedObj;
	}
	
	// With Object class clone method
	/*@Override
	public Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}*/
	
	
	
}
