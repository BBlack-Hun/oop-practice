package com.example.ooppractice;

public class Calculator {
    public static int calculator(int operand1, String operator, int operand2) {
        if (operator.equals("+")) {
            return operand1 + operand2;
        } else if (operator.equals("-")) {
            return operand1 - operand2;
        } else if (operator.equals("*")) {
            return operand1 * operand2;
        } else {
            return operand1 / operand2;
        }
    }
}
