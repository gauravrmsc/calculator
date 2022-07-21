package org.calculator.mapper;

import org.calculator.constant.Opcode;
import org.calculator.domain.expression.Expression;
import org.calculator.exception.ExpressionParsingException;
import org.calculator.factory.OpcodeFactory;

/**
 * @author gauravkumar
 * @since 16/07/22
 */
public class ExpressionParser {
    public Expression parseExpression(String expressionStr) throws ExpressionParsingException {
        String[] parts = expressionStr.split(" ");
        if (parts.length != 3) {
            throw new ExpressionParsingException("Size of the expression should be 3");
        }
        try {
            Double operand1 = Double.parseDouble(parts[0]);
            Opcode opcode = OpcodeFactory.getOpcode(parts[1]);
            Double operand2 = Double.parseDouble(parts[2]);
            return new Expression(opcode, operand1, operand2);
        } catch (Exception e) {
            throw new ExpressionParsingException(e);
        }
    }
}
