package interpret.domain;

import java.util.Map;

public class VariableExpression implements Expression {
    private String variableName;

    public VariableExpression(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public boolean interpret(Map<String, Boolean> context) {
        return context.getOrDefault(variableName, false);
    }
}





