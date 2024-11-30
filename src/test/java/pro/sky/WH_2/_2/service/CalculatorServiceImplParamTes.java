package pro.sky.WH_2._2.service;

import org.apache.coyote.BadRequestException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplParamTes {
    private final CalculatorService calculatorService = new CalculatorServiceImp();
    private static Collection<Arguments> parameters() {
        return List.of(
                Arguments.of(1, 2),
                Arguments.of(-1, 2),
                Arguments.of(1, -2),
                Arguments.of(-1, -2));

    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void plus (int num1, int num2) {
        int actual = calculatorService.plus(num1, num2);
        int expected = num1 + num2;
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @MethodSource("parameters")
    public void minus (int num1, int num2) {
        int actual = calculatorService.minus(num1, num2);
        int expected = num1 - num2;
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @MethodSource("parameters")
    public void multiply (int num1, int num2) {
        int actual = calculatorService.multiply(num1, num2);
        int expected = num1 * num2;
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @MethodSource("parameters")
    public void divide (int num1, int num2) throws BadRequestException {
        int actual = calculatorService.divide(num1, num2);
        int expected = num1 / num2;
        assertEquals(expected, actual);


    }
}
