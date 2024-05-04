package calculator;

public class InterpreterExample {
	public static void main(String[] args) {
        simpleExample();
    }
	
	private static void simpleExample() {
		final String expressionText = "2 2 *";
		final Evaluator evaluator = new Evaluator(expressionText);
		final int result = evaluator.evaluate();
		System.out.println(result);
	}

}

