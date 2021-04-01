/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignmentone;

import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sine
 * 
 */

//Sinenhlanhla Zondi
//220008922

public class wattCalculatorTest {
    
    private wattCalculator w1;
    private wattCalculator w2;
    private wattCalculator w3;
    
    public wattCalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        this.w1 = new wattCalculator();
        this.w2 = this.w1;
        this.w3 = new wattCalculator();
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testingEquality()
    {
        fail("Testing, failing a test.");
        int output = w1.wattFormula(64, 5);
        assertEquals(380, output);
    }
    
    @Test
    public void testingIdentity()
    {
        assertSame(w1, w2);
    }
    
    @Test
    public void testingIdentityAgain()
    {
        assertNotSame(w2, w3);
    }
    
    @Test
    public void testingTimeout()
    {
        String tmeout = assertTimeout(Duration.ofMillis(300), () -> 
        {
            Thread.sleep(100);
            return "TIMEOUT!";
        });
        assertEquals("TIMEOUT!", tmeout);
    }
    
    @Disabled("Test disabling successful.")
    @Test
    public void testDisable()
    {
        assertNull(w1);
    }
}
