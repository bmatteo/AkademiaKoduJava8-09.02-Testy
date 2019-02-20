package pl.academy.code;

import pl.academy.code.exceptions.DivadeByZeroException;

public class Calculator {
    public int sum(int a, int b) {
        return a+b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
    public int divide(int a, int b) {
        if(b == 0) {
            throw new DivadeByZeroException();
        }
        return a/b;
    }
}
