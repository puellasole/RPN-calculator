package operators;

final class Power implements Expression{
	
	private final Expression leftOperand;
	private final Expression rightOperand;
	
	Power(final Expression leftOperand, final Expression rightOperand){
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	@Override
	public int interpret() {
		final int x = this.rightOperand.interpret();
		final int y = this.leftOperand.interpret();
		if(y < 0) {
			throw new UnsupportedOperationException("Not supported!");
		}
		return powerImpl(x, y);
	}
	
	private static int powerImpl(final int a, final int b) {
		return b == 0 ? 1 : a * powerImpl(a, b - 1);
	}
}
