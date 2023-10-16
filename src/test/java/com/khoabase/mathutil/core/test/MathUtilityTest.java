/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.khoabase.mathutil.core.test;

import com.khoabase.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author truon
 */
public class MathUtilityTest {

    //test case #1 - Verify getFactorial(with n=0)
    //Steps/Procedures
    //      1. Given n=0
    //      2. Call/invoke getFactorial(n=0)
    //Expected Result:
    //      The method must return 1 as the result of 0!=1
    //Status: PASSED
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(0));

    }

    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(1));

    }

    @Test
    public void verifyFactorialGivenRightArgument5ReturnsOk() {
        assertEquals(120, MathUtility.getFactorial(5));

    }
    
    //3 TEST CASE ABOVE IS BAD SMELL, BECAUSE JUST DIFFERENT OF DATA 
    // THEN I WILL USE DDT -DATA DRIVEN TESTING
}
