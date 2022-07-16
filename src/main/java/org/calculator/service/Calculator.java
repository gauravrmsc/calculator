package org.calculator.service;

import org.calculator.domain.expression.Expression;
import org.calculator.exception.CalculatorException;
import org.calculator.exception.ExpressionParsingException;
import org.calculator.exception.OperationNotSupportedException;
import org.calculator.factory.OperatorFactory;
import org.calculator.mapper.ExpressionMapper;

/**
 * @author gauravkumar
 * @since 16/07/22
 */
public class Calculator {
    private final ExpressionMapper expressionMapper;

    public Calculator() {
        this.expressionMapper = new ExpressionMapper();
    }

    public Double calculate(String expressionString) {
        try {
            Expression expression = expressionMapper.getExpression(expressionString);
            return calculate(expression);
        } catch (ExpressionParsingException e) {
            throw new CalculatorException(e);
        }
    }

    public Double calculate(Expression expression) {
        try {
            return OperatorFactory.getOperator(expression.getOpcode()).calculate(expression.getOperand1(), expression.getOperand2());
        } catch (OperationNotSupportedException e) {
            throw new CalculatorException(e);
        }
    }
}
