package org.calculator.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.calculator.constant.Opcode;
import org.calculator.exception.UnknownOpcodeException;

/**
 * @author gauravkumar
 * @since 16/07/22
 */
public class OpcodeFactory {
    private static Map<String, Opcode> opcodeMap = new HashMap<>();

    static {
        register(Opcode.ADD);
        register(Opcode.SUBTRACT);
        register(Opcode.MULTIPLY);
        register(Opcode.DIVIDE);
    }

    public static void register(Opcode opcode) {
        opcodeMap.put(opcode.getSymbol(), opcode);
    }

    public static Opcode getOpcode(String opcodeSymbol) throws UnknownOpcodeException {
        return Optional.ofNullable(opcodeMap.get(opcodeSymbol)).orElseThrow(() -> new UnknownOpcodeException(opcodeSymbol));
    }
}
