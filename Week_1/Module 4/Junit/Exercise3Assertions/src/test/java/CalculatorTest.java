import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(30, calculator.add(10, 20));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    public void testTrue() {
        assertTrue(calculator.add(5, 5) == 10);
    }

    @Test
    public void testFalse() {
        assertFalse(calculator.add(5, 5) == 20);
    }

    @Test
    public void testNotNull() {
        assertNotNull(calculator);
    }

    @Test
    public void testNull() {
        String name = null;
        assertNull(name);
    }
}