package interpret.example;

import java.util.Map;

import interpret.domain.AndExpression;
import interpret.domain.Expression;
import interpret.domain.NotExpression;
import interpret.domain.OrExpression;
import interpret.domain.VariableExpression;
import interpret.service.ExpressionServiceImp;

public class Main {
    public static void main(String[] args) {
        // Crear expresiones: (A AND B) OR (C AND NOT D)
        Expression a = new VariableExpression("A");
        Expression b = new VariableExpression("B");
        Expression c = new VariableExpression("C");
        Expression d = new VariableExpression("D");
        
        Expression andExpression1 = new AndExpression(a, b);
        Expression notD = new NotExpression(d);
        Expression andExpression2 = new AndExpression(c, notD);
        Expression orExpression = new OrExpression(andExpression1, andExpression2);

        // Crear el servicio
        ExpressionServiceImp expressionService = new ExpressionServiceImp();

        // Contexto con los valores de las variables
        Map<String, Boolean> context = Map.of(
            "A", true,
            "B", false,
            "C", true,
            "D", false
        );

        // Evaluar la expresión
        boolean result = expressionService.evaluateExpression(orExpression, context);
        System.out.println("Resultado de la expresión: " + result);
    }
}