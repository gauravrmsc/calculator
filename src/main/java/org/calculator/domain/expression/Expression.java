package org.calculator.domain.expression;

import org.calculator.constant.Opcode;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author gauravkumar
 * @since 16/07/22
 */
@Getter
@AllArgsConstructor
public class Expression {
    private Opcode opcode;

    private Double operand1;

    private Double operand2;
}
