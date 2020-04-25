package dp15.behavioral_03.chainOfResponsibility;

// This is learned from Derak Banes
public interface ChainBehaviourInterface {

	// This interface is the key paramter for Chain Behaviour

	// Two Methods will be used

	// This Methods is used to create a chain relation ship between classes
	void setNextChain(ChainBehaviourInterface chain);

	// This Method is used to calculate number if condition satisfies or it will
	// call next calulate method in the relation for calculation.
	void calculateNumbers(NumberClass number);

}
