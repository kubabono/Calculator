package pl.edu.agh.mwo.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    @Test
    public void testSum() {
        Calculator calc = new Calculator();
        assertEquals(12, calc.sum(5,7));

    }

    @Test
    public void testSubtract()  {
        Calculator calc = new Calculator();
        assertEquals(5, calc.substract(7,2));

    }


    @Test ()
    public void testDivideByZero()  {
        Calculator calc = new Calculator();
        calc.divide(5,0);

    }
}

