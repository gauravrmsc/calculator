package org.calculator;

import java.util.Scanner;
import org.calculator.service.Calculator;
import org.calculator.service.CalculatorImpl;

/**
 * @author gauravkumar
 * @since 16/07/22
 */
public class Main {
    private static String HELPER_TEXT = "Write an expression to evaluate or \'exit\' to exit";

    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        System.out.println(HELPER_TEXT);
        Scanner scanner = new Scanner(System.in);
        for (String expressionString = scanner.nextLine().trim(); !expressionString.equals("exit"); expressionString = scanner.nextLine().trim()) {
            try {
                System.out.println(calculator.calculate(expressionString));
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            System.out.println(HELPER_TEXT);
        }
    }
}
