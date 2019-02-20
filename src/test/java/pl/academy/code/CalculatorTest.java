package pl.academy.code;

import org.junit.*;
import pl.academy.code.exceptions.DivadeByZeroException;

public class CalculatorTest {

    public static Calculator calculator;

    @BeforeClass
    public static void zrobTrudnyISkaplikowanyObiekt() {
        CalculatorTest.calculator = new Calculator();
        System.out.println("BeforeClass method");
    }

    @Before
    public void przedTestem() {
        System.out.println("Before method");
    }

    @AfterClass
    public static void poTestach() {
        System.out.println("PAfterClass method");
    }

    public CalculatorTest() {
        System.out.println("ABC");
    }

    @Test
    public void sumTest() {
        int a = 3;
        int b = 5;
        int expectedResult = 8;

        Assert.assertEquals(expectedResult, calculator.sum(a,b));
    }

    @Test
    @Ignore
    public void multiplyTest() {
        int a = 3;
        int b = 5;
        int expectedResult = 15;

        Assert.assertEquals(expectedResult, calculator.multiply(a,b));
    }

    @Test
    public void divideTest() {
        int a = 10;
        int b = 5;
        int expectedResult = 2;

        Assert.assertEquals(expectedResult, calculator.divide(a,b));
    }

    @Test(expected = DivadeByZeroException.class)
    public void divideByZeroTest() {
        int a = 10;
        int b = 0;

        calculator.divide(a,b);
    }
}
