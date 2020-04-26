package dp21.behavioral_09.interpreter;

public class IntoBinaryExpressionInterface implements ExpressionInterface {

	private int value;
	
	public IntoBinaryExpressionInterface(int value) {
		super();
		this.value = value;
	}

	
	@Override
	public String interpret(InterpreterContextEngine engine) {
		// TODO Auto-generated method stub
		return engine.getBinaryFormat(value);
	}

}
