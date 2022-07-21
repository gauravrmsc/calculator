package org.calculator.exception;

/**
 * @author gauravkumar
 * @since 16/07/22
 */
public class ExpressionParsingException extends Exception {
    public ExpressionParsingException(String error) {
        super(error);
    }

    public ExpressionParsingException(Exception exception) {
        super(exception);
    }
}
