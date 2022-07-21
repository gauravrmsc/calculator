package org.calculator.exception;

/**
 * @author gauravkumar
 * @since 16/07/22
 */
public class CalculatorException extends RuntimeException {
    public CalculatorException(Exception e) {
        super(e);
    }
}
