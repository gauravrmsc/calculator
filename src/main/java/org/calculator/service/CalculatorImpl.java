package org.calculator.service;

import org.calculator.domain.expression.Expression;
import org.calculator.exception.CalculatorException;
import org.calculator.exception.ExpressionParsingException;
import org.calculator.exception.OperationNotSupportedException;
import org.calculator.factory.OperatorFactory;
import org.calculator.mapper.ExpressionParser;

/**
 * @author gauravkumar
 * @since 16/07/22
 */
public class CalculatorImpl implements Calculator {
    private final ExpressionParser expressionParser;

    public CalculatorImpl() {
        this.expressionParser = new ExpressionParser();
    }

    @Override
    public Double calculate(String expressionString) {
        try {
            Expression expression = expressionParser.parseExpression(expressionString);
            return calculate(expression);
        } catch (ExpressionParsingException e) {
            throw new CalculatorException(e);
        }
    }

    @Override
    public Double calculate(Expression expression) {
        try {
            return OperatorFactory.getOperator(expression.getOpcode()).calculate(expression.getOperand1(), expression.getOperand2());
        } catch (OperationNotSupportedException e) {
            throw new CalculatorException(e);
        }
    }
}
