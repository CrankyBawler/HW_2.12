package pro.sky.WH_2._2.service;

import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImp implements CalculatorService {

    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) throws BadRequestException {
        if (num2 == 0) {
            throw new BadRequestException("На ноль делить нельзя!");
        } else {
            return num1 / num2;

        }
    }
}
