package dp21.behavioral_09.interpreter;

public class AppMain {

	public static void main(String[] args) {
		
		String str1 = "28 in Binary";
		String str2 = "28 in Hexadecimal";
		
		InterpreterClient client = new InterpreterClient(new InterpreterContextEngine());
		String result1 = client.interpret(str1);
		String result2 = client.interpret(str2);
		
		System.out.println("Binary Result: " +result1);
		System.out.println("HexaDeciamal Result: "+ result2);
		
	}
}
