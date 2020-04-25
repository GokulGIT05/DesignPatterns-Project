package dp15.behavioral_03.chainOfResponsibility;

public class AppMain {

	public static void main(String[] args) {
		
		// 1. Create a Object for Each Operation Classes
		// 2. Link all the operation Classes
		// 3. Start the execution from Start of the class
		
		// Step 1:
		ChainBehaviourInterface addOperation = new Gk1_AddNumbers();
		ChainBehaviourInterface subOperation = new Gk2_SubtractionNumbers();
		ChainBehaviourInterface multiplyOperation = new Gk3_MultiplicationNumbers();
		ChainBehaviourInterface divideOperation = new Gk4_DivisionNumbers();
		
		// Step 2:
		addOperation.setNextChain(subOperation);;
		subOperation.setNextChain(multiplyOperation);
		multiplyOperation.setNextChain(divideOperation);
		
		// Step 3: Create number with Condition.
		NumberClass addition = new NumberClass(5, 10, "ADD");
		NumberClass division = new NumberClass(50, 10, "DIVISION");
		
		// Step 4: Execution. Start from FIRST Operation
		addOperation.calculateNumbers(addition);
		addOperation.calculateNumbers(division);
	
		
		

	}

}
