package dp02.creational_02.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeePrototypeDP implements Cloneable {
	
	private List<String> empList;

	public EmployeePrototypeDP() {
		super();
		empList = new ArrayList<String>();
	}

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

	@Override
	public EmployeePrototypeDP clone() throws CloneNotSupportedException{
		List<String> tempCopy = new ArrayList<String>();

		for (String str : this.getEmpList()) {
			tempCopy.add(str);
		}
		
		EmployeePrototypeDP deepClonedObj = new EmployeePrototypeDP(tempCopy);

		return deepClonedObj;
	}
}
