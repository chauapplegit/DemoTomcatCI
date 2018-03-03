package com.demotomcatci;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tuanledinh
 */
public class ExampleTest {

    /**
     * Test of sumNumberInterger method, of class Example.
     */
    @Test
    public void testSumNumberInterger() {
        System.out.println("sumNumberInterger");
        int a = 2;
        int b = 3;
        Example instance = new Example();
        int expResult = 5;
        int result = instance.sumNumberInterger(a, b);
        assertEquals(expResult, result);
    }
    
}
