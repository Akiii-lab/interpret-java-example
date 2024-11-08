package interpret.domain;

import java.util.Map;

public class AndExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public AndExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public boolean interpret(Map<String, Boolean> context) {
        return leftExpression.interpret(context) && rightExpression.interpret(context);
    }
}
