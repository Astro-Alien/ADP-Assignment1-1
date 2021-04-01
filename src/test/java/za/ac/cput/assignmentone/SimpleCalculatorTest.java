/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignmentone;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Charles
 */
public class SimpleCalculatorTest {

    public SimpleCalculatorTest() {

    }

    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Testing object Equality
     * 
     */
    @Test
    public void testObjectEquality() {
        SimpleCalculator test1 = new SimpleCalculator();
        int output = test1.squareRoot(5);
        assertEquals(25, output);
    }

    /**
     * Testing object Identity
     * 
     */
    @Test
    public void testObjectIdentity() {
        //
        SimpleCalculator test2 = new SimpleCalculator();
        int output1 = test2.AdditionSum1(4, 5);
        int output2 = test2.AdditionSum2(4, 5);
        int output3 = test2.AdditionSum3(4,9);
        assertSame(output1, output2);
        assertNotSame(output2,output3);

    }

    /**
     * Testing Fail
     * 
     */
    @Test
    public void testFail() {
        SimpleCalculator test1 = new SimpleCalculator();
        int output = test1.squareRoot(5);
        assertEquals(25, output);
        fail("This test will fail and four others will succeed");

    }

    /**
     * Testing Timeout
     * 
     */
    @Test
    public void testTimeout() {
        SimpleCalculator str = new SimpleCalculator();
        assertTimeout(ofMillis(200), () -> {
            // Simulate task that takes than 10

            Thread.sleep(100);
            String output = str.greeting("Hello There!");
            assertEquals("Hello There!", output);

        });
    }
    /**
     * Disabling Test
     * 
     */
    @Disabled("Disabled Test with message")
    @Test
    public void testDisabled() {
        
        System.out.print("This is a disabled test.");

    }


}
