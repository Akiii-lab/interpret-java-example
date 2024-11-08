package interpret.service;

import java.util.Map;

import interpret.domain.Expression;

public class ExpressionServiceImp implements ExpressionService {
    @Override
    public boolean evaluateExpression(Expression expression, Map<String, Boolean> context){
        return expression.interpret(context);
    }
}
