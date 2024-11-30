package pro.sky.WH_2._2.service;

import org.apache.coyote.BadRequestException;

public interface CalculatorService {
    int plus(int num1, int num2);
    int minus(int num1, int num2);
    int multiply(int num1, int num2);
    int divide(int num1, int num2) throws BadRequestException;
}
