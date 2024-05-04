package operators;

final class Plus implements Expression{
	
	private final Expression leftOperand;
	private final Expression rightOperand;
	
	Plus(final Expression leftOperand, final Expression rightOperand){
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	@Override
	public int interpret() {
		return this.leftOperand.interpret() + this.rightOperand.interpret(); //whyy
	}

}
