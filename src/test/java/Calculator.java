/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author E7240
 */
public class Calculator {
    private Calculator number1;
    private Calculator number2;
    private Calculator ans;
            
    public Calculator() {
      
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
        
    }
    
    @BeforeEach
    public void setUp() {
        number1 = new Calculator();
        number2 = new Calculator();
        ans = new Calculator();
        
        number1 = ans;
    }
    @Test
    public void TestIdentity(){
        assertSame(number1, ans);
        
    }
      @Test
     void testEquality()
    {
        assertEquals(number1, ans);

    }

    @Disabled
    @Test
    void testEqualitys()
    {
        assertEquals(number1, ans);

    }

    @Test
    void FailingTest()
    {
        assertSame(number1, ans);
    }


    @Test
    @Timeout(10)
    void timeoutCheck()
    {
        for (int i =0 ; i<100 ; i++)
            System.out.println(i);
    }
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

