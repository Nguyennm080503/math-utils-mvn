package org.minhnguyen.math.utils.core;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.minhnguyen.math.utils.core.MathUtils.*;

/**
 *
 * @author ADMIN
 */
public class MathUtilityAdvanceTest {
    // hamf chuẩn bị bộ data để sau đó fill vào hàm assertE() ở dưới
    public static Object[][] initTestData(){
        Object testData[][] = {{0,1},
                               {1,1},
                               {2,2},
                               {3,6}};
        
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunWell(int n , long expected){
        assertEquals(expected, getFactorial(n));
    }
    
    @Test
    public void testFactorialGivenWrongArgumentThrowsException(){
        Executable executable = () -> getFactorial(-5);
        assertThrows(IllegalArgumentException.class, executable); // hàm thuộc interface Executable, lambda
    }
}
