package io.github.arena.challenges.jltemplate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static io.github.arena.challenges.jltemplate.CalcOperator.*;
import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    private static Calculator uut;

    @BeforeAll
    public static void init() {
        uut = new Calculator();
    }

    public static Object[][] calculate() {
        return new Object[][]{
                {ADD, 5, 10, 15},
                {ADD, 5, 10.5, 15.5},
                {SUB, 5, 10.5, -5.5},
                {DIV, 10, 5, 2},
                {MUL, 10, 5.25, 52.5},
        };
    }

    @ParameterizedTest
    @MethodSource("calculate")
    void calculate_test(CalcOperator op, double op1, double op2, double expResult) {
        assertThat(uut.calculate(op, op1, op2)).isEqualTo(expResult);
    }
}