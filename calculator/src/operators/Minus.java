package operators;

final class Minus implements Expression{
	
	private final Expression leftOperand;
	private final Expression rightOperand;
	
	Minus(final Expression leftOperand, final Expression rightOperand){
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	@Override
	public int interpret() {
		return this.leftOperand.interpret() - this.rightOperand.interpret();
	}

}