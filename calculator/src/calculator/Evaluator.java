package calculator;

import operators.Expression;
import operators.ExpressionFactory;
import operators.VariablesScope;

public class Evaluator {
	private final Expression syntaxTree;
	
	public Evaluator(final String expressionText) {
		this.syntaxTree = buildSyntaxTree(expressionText, null);
	}
	
	public Evaluator(final String expressionText, final VariablesScope variables) {
		this.syntaxTree = buildSyntaxTree(expressionText, variables);
	}
	
	public int evaluate() {
		return this.syntaxTree.interpret();
	}

	private static Expression buildSyntaxTree(final String expressionText, final VariablesScope variables) {
		return ExpressionFactory.createExpression(expressionText, variables);
	}
	
}
