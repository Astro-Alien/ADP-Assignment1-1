/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignmentone;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 * Date: 
 * @author Brandon Lee Kruger
 * Student No: 216049245
 */
public class SpeedTest {
    
    private Speed test1;
    private Speed test2;
    private Speed result; 
    
    public SpeedTest() {
    
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
        
    }
    
    @BeforeEach
    public void setUp() {
        this.test1 = new Speed();
        this.test2 = new Speed();
        this.result = this.test1;
        
    }
    
    @AfterEach //Disabling Test
    public void tearDown() {
    
    }
    
    
    @Test //Object Equality
     void testEquality()
    {
        assertEquals(test1, result);

    }
     
    @Test //Object Indentity
    public void TestingIdentity(){
        assertSame(test1, result);
        
    }

    @Test //Failing Test
    void FailingTest()
    {
        assertNotSame(test1, result);
    }


    @Test //Timeouts
    @Timeout(10)
    void timeoutCheck()
    {
        for (int i =0 ; i<60 ; i++)
            System.out.println(i);
    }
    
    @Disabled("Testing Disabled Successfully.")
    @Test
    public void testingDisabled(){
        assertNull(test1);
    }
    
   
}
