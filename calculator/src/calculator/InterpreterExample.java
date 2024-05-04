package calculator;

public class InterpreterExample {
	public static void main(String[] args) {
        simpleExample();
    }
	
	private static void simpleExample() {
		final String expressionText = "3 4 + 5 6 + *";
		final Evaluator evaluator = new Evaluator(expressionText);
		final int result = evaluator.evaluate();
		System.out.println(result);
	}

}

