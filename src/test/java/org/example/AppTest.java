package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Week 12 assignment implementation.
 */
public class AppTest {
    
    @Test
    public void testSumOfSquares() {
        LoopControl loopControl = new LoopControl();
        assertEquals(385, loopControl.sumOfSquares());
    }

    @Test
    public void testFilterAndCountEvenNumbers() {
        ExampleUsage exampleUsage = new ExampleUsage();
        assertEquals(10, exampleUsage.filterAndCountEvenNumbers());
    }

    @Test
    public void testMatrixDiagonalSum() {
        ExampleUsage exampleUsage = new ExampleUsage();
        assertEquals(15, exampleUsage.matrixDiagonalSum());
    }

    @Test
    public void testSumArray() {
        ExampleUsage exampleUsage = new ExampleUsage();
        assertEquals(75, exampleUsage.sumArray());
    }
}
