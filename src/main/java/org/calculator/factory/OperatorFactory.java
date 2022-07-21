package org.calculator.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.calculator.constant.Opcode;
import org.calculator.domain.operator.Operator;
import org.calculator.domain.operator.implementation.Add;
import org.calculator.domain.operator.implementation.Divide;
import org.calculator.domain.operator.implementation.Multiply;
import org.calculator.domain.operator.implementation.Subtract;
import org.calculator.exception.OperationNotSupportedException;

/**
 * @author gauravkumar
 * @since 16/07/22
 */
public class OperatorFactory {
    private static Map<Opcode, Operator> operatorMap = new HashMap<>();

    static {
        registerOperator(Opcode.ADD, new Add());
        registerOperator(Opcode.SUBTRACT, new Subtract());
        registerOperator(Opcode.MULTIPLY, new Multiply());
        registerOperator(Opcode.DIVIDE, new Divide());
    }

    public static Operator getOperator(Opcode opcode) throws OperationNotSupportedException {
        return Optional.ofNullable(operatorMap.get(opcode)).orElseThrow(() -> new OperationNotSupportedException(opcode));
    }

    public static void registerOperator(Opcode opcode, Operator operator) {
        operatorMap.put(opcode, operator);
    }
}
