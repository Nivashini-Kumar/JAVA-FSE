import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {

        
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 20;

     
        int result = calculator.add(a, b);

       
        assertEquals(30, result);
    }

    @Test
    public void testSubtraction() {

        
        Calculator calculator = new Calculator();

        
        int result = calculator.subtract(20, 5);

       
        assertEquals(15, result);
    }

    @Test
    public void testMultiplication() {

        
        Calculator calculator = new Calculator();

       
        int result = calculator.multiply(5, 6);

        
        assertEquals(30, result);
    }

    @Test
    public void testDivision() {

        
        Calculator calculator = new Calculator();

        int result = calculator.divide(20, 5);

        assertEquals(4, result);
    }
}