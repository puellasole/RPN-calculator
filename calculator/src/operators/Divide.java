package operators;

final class Divide implements Expression{
	
	private final Expression leftOperand;
	private final Expression rightOperand;
	
	Divide(final Expression leftOperand, final Expression rightOperand){
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	@Override
	public int interpret() {
		final int numerator = this.rightOperand.interpret();
		final int denominator = this.leftOperand.interpret();
		if(denominator == 0) {
			throw new ArithmeticException("Division by zero!");
		}
		return numerator / denominator;
	}
	

}
