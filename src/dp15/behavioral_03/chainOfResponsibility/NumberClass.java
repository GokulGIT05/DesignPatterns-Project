package dp15.behavioral_03.chainOfResponsibility;

public class NumberClass {

	private int number1;
	private int number2;
	private String command;

	public NumberClass(int number1, int number2, String command) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.command = command;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}
	
	

}
