package interpret.service;

import java.util.Map;

import interpret.domain.Expression;

public interface ExpressionService {
    public boolean evaluateExpression(Expression expression, Map<String, Boolean> context);   
}
