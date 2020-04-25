package dp15.behavioral_03.chainOfResponsibility;

public class Gk3_MultiplicationNumbers implements ChainBehaviourInterface {
	
	private ChainBehaviourInterface nextChain;

	@Override
	public void setNextChain(ChainBehaviourInterface chain) {
		
		this.nextChain=chain;

	}

	@Override
	public void calculateNumbers(NumberClass number) {
		
		if(number.getCommand().equals("MULTIPLY")) {
			
			int result = number.getNumber1() * number.getNumber2();
			
			System.out.println("The Multiply of "+ number.getNumber1() + " & " +
					number.getNumber2() + " is: "+result);
			
		}else {
			// Next Chain of Responsibility
			nextChain.calculateNumbers(number);
		}

	}

}
