package dp21.behavioral_09.interpreter;

public class InterpreterClient {
	
	InterpreterContextEngine context;

	public InterpreterClient(InterpreterContextEngine context) {
		super();
		this.context = context;
	}
	
	public String interpret(String str){
		ExpressionInterface exp = null;
		//create rules for expressions
		if(str.contains("Hexadecimal")){
			exp=new IntToHexExpressionImpl(Integer.parseInt(str.substring(0,str.indexOf(" "))));
		}else if(str.contains("Binary")){
			exp=new IntoBinaryExpressionInterface(Integer.parseInt(str.substring(0,str.indexOf(" "))));
		}else return str;
		
		return exp.interpret(context);
	}
	
}
