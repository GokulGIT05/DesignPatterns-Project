package dp15.behavioral_03.chainOfResponsibility;

public class Gk4_DivisionNumbers implements ChainBehaviourInterface {

	private ChainBehaviourInterface nextChain;

	@Override
	public void setNextChain(ChainBehaviourInterface chain) {

		this.nextChain = chain;

	}

	@Override
	public void calculateNumbers(NumberClass number) {

		if (number.getCommand().equals("DIVISION")) {

			int result = number.getNumber1() / number.getNumber2();

			System.out
					.println("The Division of " + number.getNumber1() + " & " + number.getNumber2() + " is: " + result);

		} else {
			
			System.out.println("End Of Operation");
			
		}

	}

}
