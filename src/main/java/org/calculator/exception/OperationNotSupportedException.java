package org.calculator.exception;

import org.calculator.constant.Opcode;

/**
 * @author gauravkumar
 * @since 16/07/22
 */
public class OperationNotSupportedException extends Exception {
    public OperationNotSupportedException(Opcode opcode) {
        super("Operation not supported for operator: " + opcode.getSymbol());
    }
}
