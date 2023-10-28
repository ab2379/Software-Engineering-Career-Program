import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 4);

        assertEquals(7, result);
    }

    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        int result = calculator.substract(3, 4);

        assertEquals(-1, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(3, 4);

        assertEquals(12, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivide() {
        Calculator calculator = new Calculator();
        //int result = calculator.divide(8, 4);
        int result = calculator.divide(8, 0);

        //assertEquals(2, result);

    }
}
