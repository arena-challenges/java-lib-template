package io.github.arena.challenges.jltemplate;

public class Calculator {

    public Double calculate(CalcOperator op, double operand1, double operand2) {
        switch (op) {
            case ADD -> {
                return operand1 + operand2;
            }
            case SUB -> {
                return operand1 - operand2;
            }
            case MUL -> {
                return operand1 * operand2;
            }
            case DIV -> {
                return operand1 / operand2;
            }
        }
        return -1.0;
    }
}
