package org.calculator.exception;

/**
 * @author gauravkumar
 * @since 16/07/22
 */
public class UnknownOpcodeException extends Exception {
    public UnknownOpcodeException(String operatorSymbol) {
        super("Unknown opcode symbol: " + operatorSymbol);
    }
}
