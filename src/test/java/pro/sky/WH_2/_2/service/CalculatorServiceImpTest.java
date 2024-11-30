package pro.sky.WH_2._2.service;

import org.apache.coyote.BadRequestException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceImpTest {
    private final CalculatorService calculatorService = new CalculatorServiceImp();
    int num1 = 10;
    int num2 = 5;
    int num3 = 0;

    @Test
    void plus() {

        int actual = num1 + num2;
        int expected = calculatorService.plus(num1, num2);

        assertEquals(actual, expected);

    }

    @Test
    void minus() {
        int actual = num1 - num2;
        int expected = calculatorService.minus(num1, num2);

        assertEquals(actual, expected);
    }

    @Test
    void multiply() {
        int actual = num1 * num2;
        int expected = calculatorService.multiply(num1, num2);
        assertEquals(actual, expected);

    }

    @Test
    void divide() throws BadRequestException {
        int actual = num1 / num2;
        int expected = calculatorService.divide(num1, num2);
        assertEquals(expected, actual);

        BadRequestException exception = assertThrows(BadRequestException.class, ()-> {
            calculatorService.divide(num2, num3);
                });
        assertEquals("На ноль делить нельзя!", exception.getMessage());

}
}