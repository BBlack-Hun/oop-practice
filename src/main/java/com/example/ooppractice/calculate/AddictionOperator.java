package com.example.ooppractice.calculate;

public class AddictionOperator implements NewArithmeticOperator{

    @Override
    public boolean supports(String operator) {
        return "+".equals(operator);
    }

    @Override
    public int calculate(int operand1, int operand2) {
        return operand1 + operand2;
    }
}