package interpret.domain;

import java.util.Map;

public class NotExpression implements Expression {
    private Expression expression;

    public NotExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public boolean interpret(Map<String, Boolean> context) {
        return !expression.interpret(context);
    }
}