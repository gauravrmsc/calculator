package org.calculator.domain.operator.implementation;

import org.calculator.domain.operator.Operator;

/**
 * @author gauravkumar
 * @since 16/07/22
 */
public class Add implements Operator {
    @Override
    public Double calculate(Double operand1, Double operand2) {
        return operand1 + operand2;
    }
}
