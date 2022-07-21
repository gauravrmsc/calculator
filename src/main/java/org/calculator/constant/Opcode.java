package org.calculator.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author gauravkumar
 * @since 16/07/22
 */
@Getter
@RequiredArgsConstructor
public enum Opcode {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String symbol;
}
