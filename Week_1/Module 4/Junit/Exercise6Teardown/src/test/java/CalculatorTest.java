import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed");
    }

    @Test
    public void testAddition() {
        assertEquals(30, calculator.add(10, 20));
        System.out.println("Addition test completed");
    }

    @Test
    public void testSubtraction() {
        assertEquals(15, calculator.subtract(20, 5));
        System.out.println("Subtraction test completed");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Cleanup completed");
    }
}