package org.calculator.service;

import org.calculator.domain.expression.Expression;

/**
 * @author gauravkumar
 * @since 20/07/22
 */
public interface Calculator {
    Double calculate(String expressionString);

    Double calculate(Expression expression);
}
