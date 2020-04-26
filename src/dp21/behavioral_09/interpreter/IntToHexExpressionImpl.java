package dp21.behavioral_09.interpreter;

public class IntToHexExpressionImpl implements ExpressionInterface {
	
	
	private int value;
	
	public IntToHexExpressionImpl(int value) {
		super();
		this.value = value;
	}


	@Override
	public String interpret(InterpreterContextEngine engine) {
		// TODO Auto-generated method stub
		return engine.getHexadecimalFormat(value);
	}

}
